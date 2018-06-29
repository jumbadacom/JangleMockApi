package com.example.apidemo.aws;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.apidemo.aws.request.MailStringModel;
import com.example.apidemo.aws.request.ManagedUserVM;
import com.example.apidemo.aws.request.PhoneStringModel;
import com.example.apidemo.aws.request.TokenRequestModel;
import com.example.apidemo.aws.response.JWTToken;
import com.example.apidemo.aws.response.KeyAndShortMessageVM;
import com.example.apidemo.aws.response.ResultVM;
import com.example.apidemo.aws.response.TokenResponseModel;

import lombok.extern.slf4j.Slf4j;

/*
 * 
 * Burada business logic henuz olusturulmadigi icin, local api oldugu icin, responseModel objelerini test parametreleriyle olusturuyoruz.
 * 
 * Response nesnesi belli olmayan service methodlarini da sonra ekleyecegiz.
 */

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
	public ResponseEntity<ResultVM> checkEmailInUser(MailStringModel model) {
		log.info(model.toString());
		try {
			Thread.sleep(SLEEP);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ResultVM responseModel = new ResultVM("result : ok");
		;

		return responseModel.checkEmailInUser(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResultVM> checkPhoneInUser(PhoneStringModel model) {
		log.info(model.toString());
		try {
			Thread.sleep(SLEEP);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ResultVM responseModel = new ResultVM("result : ok");

		return responseModel.checkEmailInUser(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<KeyAndShortMessageVM> requestPasswordResetBySMS(PhoneStringModel model) {
		log.info(model.toString());
		try {
			Thread.sleep(SLEEP);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		KeyAndShortMessageVM responseModel = new KeyAndShortMessageVM("test", "test");
		;

		return responseModel.requestPasswordResetBySMS(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResultVM> isAuthenticated() {
		log.info("EntryService.isAuthenticated() is called.");
		try {
			Thread.sleep(SLEEP);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ResultVM responseModel = new ResultVM("result : ok");

		return responseModel.isAuthenticated(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<JWTToken> registerAccount(ManagedUserVM model) {
		log.info(model.toString());
		try {
			Thread.sleep(SLEEP);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JWTToken responseModel = new JWTToken("id_token : xxxTEST_TOKENxxx");

		return responseModel.registerAccount(HttpStatus.OK);
	}

}
