package com.example.apidemo.mocky;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.apidemo.mocky.response.Message;
import com.example.apidemo.mocky.response.MessageResponse;
import com.example.apidemo.mocky.response.ResponseBaseModel;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class MockyServiceImpl implements  MockyService {
	
	public ResponseEntity<ResponseBaseModel> getMessages() {
	
		List<Message> messages=new ArrayList<>();
		for (int i=1;i<16;i++) {
			Message message=new Message();
			message.setImageURL("http://");
			message.setTime(i+"s");
			message.setMessagesCount(0);
			if(i%3==0) {
				message.setMesssageType("TAIL");
				message.setMessageText("Tamamlama paylaştı");
				message.setUsername("@user-"+i);
							}
			else if(i%3==1) {
				message.setMesssageType("JANGLE");
				message.setMessageText("Jangle paylaştı");
				message.setUsername("@username"+i);
			
			}
			else {
				message.setMesssageType("CHAT");
				message.setMessageText("Deneme mesaj test");
				message.setUsername("@user_"+i);
				message.setMessagesCount((int)Math.round(5)+i);
			}
			messages.add(message);
		}
		MessageResponse response=new MessageResponse(LanguageMessages.SUCCESFUL, Language.EN_US);
		response.setMessages(messages);
		return response.generateInvisible(HttpStatus.OK);
		
	}

}
