package cn.iqoo.user.listener;

import cn.iqoo.user.constants.JmsConstant;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class UserJmsListener {

    @JmsListener(destination = JmsConstant.QUEUE_USER)
    public void QueueConsumer(String message) {
        System.out.println(String.format("[quququ] ==== %s", message));
    }
}
