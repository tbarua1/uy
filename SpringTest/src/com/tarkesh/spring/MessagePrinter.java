package com.tarkesh.spring;

import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
private MessageService service;
public MessagePrinter(MessageService service){
	this.service=service;
}
public void printMessage(){
	System.out.println(this.service.getMessage());
}
}
