package com.chatapp.stomp.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {
    private String message;
    private String sender;
    private String receiver;
    private Type type;
}
