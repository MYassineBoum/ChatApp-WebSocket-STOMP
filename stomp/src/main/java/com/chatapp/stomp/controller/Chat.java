package com.chatapp.stomp.controller;

import com.chatapp.stomp.entity.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class Chat {
    @MessageMapping("/public")
    @SendTo("/topic")
    public Message roomMessage(@Payload Message message) {
        return message;
    }
}
