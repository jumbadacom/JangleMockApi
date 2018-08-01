package com.example.apidemo.mocky;

import org.springframework.http.ResponseEntity;

import com.example.apidemo.mocky.response.ResponseBaseModel;

public interface MockyService {
	
	public ResponseEntity<ResponseBaseModel> getMessages(int page);
	
	public ResponseEntity<ResponseBaseModel> getMessagesById(int id,int page,int size);
	
	public ResponseEntity<ResponseBaseModel> getNotifications();
	
	public ResponseEntity<ResponseBaseModel> getNotificationsById(int id,int page,int size);

}
