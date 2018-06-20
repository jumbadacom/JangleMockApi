package com.example.apidemo.aws;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ListModel;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.apidemo.aws.request.TokenRequestModel;
import com.example.apidemo.aws.response.TokenResponseModel;
import com.example.apidemo.mocky.response.Message;
import com.example.apidemo.mocky.response.MessageResponse;
import com.example.apidemo.mocky.response.Notification;
import com.example.apidemo.mocky.response.NotificationResponse;
import com.example.apidemo.mocky.response.Profile;
import com.example.apidemo.mocky.response.ResponseBaseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ApiServiceImpl implements ApiService {

	private static final long SLEEP = 500;

	@Override
	public ResponseEntity<TokenResponseModel> authenticate(TokenRequestModel model) {
		log.info(model.toString());
		try {
			Thread.sleep(SLEEP);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TokenResponseModel responseModel = new TokenResponseModel(
				"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTUzMTk5MzYzOH0.85_2kmqpQxjicPFvmOYbkRnPhzk3lJtNc6YscQEWfB-XRPpwHwDDiQDY2Nay7QajRzpOCjqE-g36VwAsO1oMWA");
		;

		return responseModel.authenticate(HttpStatus.OK);
	}

}
