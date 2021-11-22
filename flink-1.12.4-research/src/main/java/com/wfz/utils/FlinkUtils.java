package com.wfz.utils;

import com.wfz.configs.ConnectConfig;
import org.apache.flink.contrib.streaming.state.RocksDBStateBackend;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class FlinkUtils {

    /**
     * @param checkpointDuration flink备份机制的周期时间
     * @param paralelism         flink的并行度
     * @param rocksDBPath        采用rockDB作为状态后端的存储路径名：/user/flink/${rocksDBPath}
     * @return flink的上下文
     */
    public static StreamExecutionEnvironment getStreamExecutionEnvironment(Long checkpointDuration, int paralelism, String rocksDBPath) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.enableCheckpointing(checkpointDuration, CheckpointingMode.EXACTLY_ONCE);
        // env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);
        env.setParallelism(paralelism);
        RocksDBStateBackend rocksDBStateBackend;
        try {
            rocksDBStateBackend = new RocksDBStateBackend(ConnectConfig.CHECKPOINT_POSITION+"/"+rocksDBPath);
            env.setStateBackend(rocksDBStateBackend);
            // env.setStateBackend(new FsStateBackend("hdfs://10.218.223.121:8020/t1"));
        } catch (Exception e) {
            System.out.println(e.getMessage() + e);
        }
        return env;

    }
}
