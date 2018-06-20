package com.example.apidemo.aws;

import org.springframework.http.ResponseEntity;

import com.example.apidemo.aws.request.TokenRequestModel;
import com.example.apidemo.aws.response.TokenResponseModel;
import com.example.apidemo.mocky.response.ResponseBaseModel;


public interface ApiService {
	
	public ResponseEntity<TokenResponseModel> authenticate(TokenRequestModel model);

}
