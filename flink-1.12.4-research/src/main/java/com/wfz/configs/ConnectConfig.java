package com.wfz.configs;

public class ConnectConfig {


    //--------test---------zww-----------start----------test----------------------------------------------------------
    //--------test---------zww-----------start----------test----------------------------------------------------------
    //kafka 1 配置
    public static final String JS_KAFKA_BOOTSTRAP = "10.218.223.120:9092,10.218.223.121:9092,10.218.223.122:9092";
    public static final String VMALL_KAFKA_BOOTSTRAP = "10.218.223.120:9092,10.218.223.121:9092,10.218.223.122:9092";
    public static final String TM_KAFKA_BOOTSTRAP = "10.218.223.120:9092,10.218.223.121:9092,10.218.223.122:9092";
    //source topic
    public static final String DWD_VMALL_CASH_ORDER = "wfz_test";
    public static final String VMALLCASHGROUPID = "vmallCashGroupId";

    //source topic
    public static final String LOGANTOPIC_KFC_WECHAT_1 = "wfz_test2";
    public static final String WECHAT1GROUPID = "weChat1GroupId";

    public static final String LOGANTOPIC_KFC_APP_4 = "wfz_test2";


    //flink环境配置
    //------------------------------------------------------------------------------------------------------
    // public static final String CHECKPOINT_POSITION = "hdfs://10.218.223.121:8020/user/flink/checkpoints/zwwRocksDB";
    public static final String CHECKPOINT_POSITION = "hdfs://10.218.223.120:8020/user/flink/checkpoints/zwwRocksDB";

    public static final int CLEANUP_SIZE = 100000;

    //mysql 环境配置
    //-------------------------------------------------------------------------------------------
    public static final String URL_TIDB = "jdbc:mysql://10.218.223.122:3306/zww";
    public static final String USER_NAME_TIDB = "root";
    public static final String PASSWORD_TIDB = "1300@Yumc";
    public static final String DATABASETIDB_KFC = "zww";

    //Hbase 配置
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static final String HBASE_ZOOKEEPER_QUORUM = "10.218.223.120,10.218.223.121,10.218.223.122";
    public static final String HBASE_ZOOKEEPER_PROPERTY_CLIENTPORT = "2181";


    //口袋商城用户行为数据
    public static final String HBASE_TABLE_KFCWECHAT_BEHAVIOR = "superapp:KFCWechat1Behavior";
    public static final String HBASE_FAMILY_KFCWECHAT_BEHAVIOR = "behavior";
    public static final String HBASE_COLUMN_KFCWECHAT_BEHAVIOR = "info";

    //HDFS 配置
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static final String HDFS_BACKPATH_TIDB = "hdfs://nameservice1/user/flink/flink_to_tidb_back/";


    //doris 配置
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static final String[] DORIS_HOST_IPS = {"172.25.186.203", "172.25.186.200", "1172.25.186.204"};
    public static final String DORIS_HOST_PORT = "8777";
    public static final String DORIS_DB = "test0517";
    public static final String DORIS_TBL = "kfc_edw_coupon_data";
    public static final String DORIS_USER = "root";
    public static final String DORIS_PASSWD = "";
    public static final String DORIS_LOADURLPATTERN = "http://%s/api/%s/%s/_stream_load?";



    public static final String REAL_REDBOX_DORIS_JDBC_URL = "jdbc:mysql://172.25.186.204:9030?real_redbox";
    public static final String DORIS_LOAD_URL = "fe_ip:http_port;fe_ip:http_port";
    public static final String DORIS_USER_NAME = "root";
    public static final String DORIS_PASSWORD = "";

    public static final String FLOW_DYEING_DORIS_TABLE_NAME = "flow_dyeing_redbox";
    public static final String FLOW_DYEING_DORIS_TABLE_DATABASE = "real_redbox";

    //实时任务name
    public static final String EXECUTENAME_POCKETMALTOTIDB = "PocketmalToTidbTest";


    //--------test---------zww-----------end----------test----------------------------------------------------------
    //--------test---------zww-----------end----------test----------------------------------------------------------
}
