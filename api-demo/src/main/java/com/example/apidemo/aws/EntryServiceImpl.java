package com.example.apidemo.aws;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.apidemo.aws.request.TokenRequestModel;
import com.example.apidemo.aws.response.TokenResponseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EntryServiceImpl implements EntryService {

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

	@Override
	public ResponseEntity<TokenResponseModel> changePassword(TokenRequestModel model) {
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
