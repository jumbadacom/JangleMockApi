package com.example.apidemo.mocky;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apidemo.mocky.request.NewPassEmailModel;
import com.example.apidemo.mocky.request.NewPassPhoneModel;
import com.example.apidemo.mocky.request.RecoveryEmailModel;
import com.example.apidemo.mocky.request.RecoveryPasswordModel;
import com.example.apidemo.mocky.request.SampleModel;
import com.example.apidemo.mocky.response.ResponseBaseModel;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequestMapping(value = "api/entry")
@RestController
public class MockyController {
	
	private static final long SLEEP=4000;
	
	@PostMapping(value = "/sample")
	public ResponseEntity<ResponseBaseModel> sample(@Valid @RequestBody SampleModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	@PostMapping(value = "/recover-pass-phone")
	public ResponseEntity<ResponseBaseModel> recoverPass(
			@Valid @RequestBody RecoveryPasswordModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_PHONE_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	@PostMapping(value = "/recover-pass-email")
	public ResponseEntity<ResponseBaseModel> recoverEmail(
			@Valid @RequestBody RecoveryEmailModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		//return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/new-pass-email")
	public ResponseEntity<ResponseBaseModel> newPassEmail(
			@Valid @RequestBody NewPassEmailModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/new-pass-phone")
	public ResponseEntity<ResponseBaseModel> newPassPhone(
			@Valid @RequestBody NewPassPhoneModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	

}
