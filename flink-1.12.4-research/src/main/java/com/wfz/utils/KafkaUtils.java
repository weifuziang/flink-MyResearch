package com.wfz.utils;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaUtils {
    private String bootstrap;

    private String groupID;


    public KafkaUtils(String bootstrap, String groupID) {
        this.bootstrap = bootstrap;
        this.groupID = groupID;
    }

    public KafkaUtils(String bootstrap) {
        this.bootstrap = bootstrap;
    }

    public Properties getProps() {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrap);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupID);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.FETCH_MAX_BYTES_CONFIG, 104857600);
        props.put(ConsumerConfig.MAX_PARTITION_FETCH_BYTES_CONFIG, 2097152);
        props.put(ConsumerConfig.RECEIVE_BUFFER_CONFIG, 131072);
        // props.put(ConsumerConfig.ISOLATION_LEVEL_CONFIG, "read_committed");

//        props.put("transaction.timeout.ms", 1000*60*5+"");

        return props;
    }

    public Properties getPropsTest() {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrap);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupID);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
//        props.put(ConsumerConfig.FETCH_MAX_BYTES_CONFIG, 146800640);
//        props.put(ConsumerConfig.MAX_PARTITION_FETCH_BYTES_CONFIG, 10485760);
//        props.put(ConsumerConfig.RECEIVE_BUFFER_CONFIG, 655360);


//        props.put("transaction.timeout.ms", 1000*60*5+"");

        return props;
    }

    public Properties getSaslProps() {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrap);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupID);
        props.put("sasl.jaas.config", "org.apache.kafka.common.security.scram.ScramLoginModule required username=\"ds-assoc\" password=\"ZrTxV27410\";");
        props.put("security.protocol", "SASL_PLAINTEXT");
        props.put("sasl.mechanism", "SCRAM-SHA-256");
        // props.put(ConsumerConfig.ISOLATION_LEVEL_CONFIG, "read_committed");
//        props.put("transaction.timeout.ms", 1000*60*5+"");
        return props;
    }

    public Properties getProductProps() {
        Properties props = new Properties();

//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//        props.put(ProducerConfig.ACKS_CONFIG, "all");
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrap);
//        props.put("transaction.timeout.ms", 1000*60*5+"");

        return props;
    }
}
