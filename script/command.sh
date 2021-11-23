#!/usr/bin/env bash
1. kafka
    1.1 topic 创建
    bin/kafka-topics.sh --zookeeper 10.218.223.122:52181  --create --replication-factor 1  --partitions 1  --topic zhangweiwei_test
    1.2 生产者
    bin/kafka-console-producer.sh --broker-list 10.218.223.122:59092 --topic zhangweiwei_test
    1.3 消费者
    bin/kafka-console-consumer.sh --bootstrap-server 10.218.223.122:59092 --topic zhangweiwei_test
    1.4 查看所有的topic
    bin/kafka-topics.sh --zookeeper 10.218.223.122:52181 --list
    1.5 查看指定topic的信息
    bin/kafka-topics.sh --zookeeper 10.218.223.122:52181  --describe --topic wfz_test
    1.6 查看kafka版本
    bin/kafka-console-producer.sh --version


2. zookeeper
    2.1 后台登录
    bin/zkCli.sh -server 10.218.223.122:52181
    2.2 查看zookeeper版本
    echo stat | nc 10.218.223.122 52181
