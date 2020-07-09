package com.nokia.itmsplus.nbifile.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nokia.itmsplus.nbifile.config.ActiveMQConfig;
import com.nokia.itmsplus.nbifile.jms.AMQProducer;

/**
 * @Project: nbifile
 * @Author : haihuab
 * @Date : 2020/6/12 15:26
 * @Description: TODO
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class NBIFileTester {
    private static final Logger logger = LoggerFactory.getLogger(NBIFileTester.class);

    @Autowired
    private AMQProducer producer;


    @Autowired
    ActiveMQConfig config;

    @Test
    public void testSendMessage() {
        Map map = new HashMap();
        map.put("name", "first");
        producer.sendMessageToFirstAMQ(config.getNbifileQueue(), "send to first", map);

        map.put("name", "second");
        producer.sendMessageToSecondAMQ(config.getNbifileQueue(), "send to second", map);
    }


}
