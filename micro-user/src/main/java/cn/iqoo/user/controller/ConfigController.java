package cn.iqoo.user.controller;

import cn.iqoo.user.config.Props;
import cn.iqoo.user.constants.JmsConstant;
import cn.iqoo.user.entity.UserInfo;
import cn.iqoo.user.repository.UserRepository;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class ConfigController {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Props props;

    @GetMapping("/json")
    public List<String> getConfig() {
        List<String> list = Arrays.asList("json", "goods", "body");
        Stream<String> stream = list.stream();
        List<String> ll = stream.filter(s -> s.contains("o")).limit(2).collect(Collectors.toList());
        System.out.println(ll);
        System.out.println(props.getPort());
        System.out.println(props.getLocations());
//        redisTemplate.opsForValue().set("x", 111);
//        send("gogogo");
//        addMongo();
        return ll;
    }

    public void send(String message) {
        Destination destination = new ActiveMQQueue(JmsConstant.QUEUE_USER);
        jmsMessagingTemplate.convertAndSend(destination, message);
    }

    public void addMongo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("ww");
        userRepository.insert(userInfo);
    }
}
