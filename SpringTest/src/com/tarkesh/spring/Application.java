package com.tarkesh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	MessageService mockMessageService(){
		return new MessageService() {
			
			@Override
			public String getMessage() {
				// TODO Auto-generated method stub
				return "This is Tarkeshwar";
			}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Application.class);
MessagePrinter messagePrinter=applicationContext.getBean(MessagePrinter.class);
	messagePrinter.printMessage();
	}

}
