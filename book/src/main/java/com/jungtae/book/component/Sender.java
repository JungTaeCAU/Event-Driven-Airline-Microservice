package com.jungtae.book.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;



import org.springframework.cloud.stream.annotation.Output;


@RefreshScope
@Component 
@EnableBinding(BookingSource.class)
public class Sender {
	
	public Sender(){
		
	}
	

	@Output (BookingSource.InventoryQ)
	@Autowired
	private MessageChannel messageChannel;	
	
	public void send(Object message){
		//template.convertAndSend("InventoryQ", message);
		messageChannel.send(MessageBuilder.withPayload(message).build());
	}
}

interface BookingSource {
	  public static String InventoryQ="inventoryQ"; 
	  @Output("inventoryQ")
	  public MessageChannel inventoryQ();
	  	  
}
