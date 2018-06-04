package com.example.apidemo.mocky;

import org.springframework.http.ResponseEntity;

import com.example.apidemo.mocky.response.ResponseBaseModel;

public interface MockyService {
	
	public ResponseEntity<ResponseBaseModel> getMessages();

}
