package com.example.apidemo.mocky;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apidemo.mocky.request.NewPasswordEmailModel;
import com.example.apidemo.mocky.request.NewPasswordPhoneModel;
import com.example.apidemo.mocky.request.NewUserEmailModel;
import com.example.apidemo.mocky.request.NewUserPhoneModel;
import com.example.apidemo.mocky.request.PasswordRecoveryEmailModel;
import com.example.apidemo.mocky.request.PasswordRecoveryPhoneModel;
import com.example.apidemo.mocky.request.PhoneConfirmationModel;
import com.example.apidemo.mocky.request.RegisterEmailModel;
import com.example.apidemo.mocky.request.RegisterImageModel;
import com.example.apidemo.mocky.request.RegisterPhoneModel;
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
	
	@PostMapping(value = "/password-recovery-phone")
	public ResponseEntity<ResponseBaseModel> recoverPass(
			@Valid @RequestBody PasswordRecoveryPhoneModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_PHONE_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	@PostMapping(value = "/password-recovery-email")
	public ResponseEntity<ResponseBaseModel> recoverEmail(
			@Valid @RequestBody PasswordRecoveryEmailModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/new-password-email")
	public ResponseEntity<ResponseBaseModel> newPassEmail(
			@Valid @RequestBody NewPasswordEmailModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/new-password-phone")
	public ResponseEntity<ResponseBaseModel> newPassPhone(
			@Valid @RequestBody NewPasswordPhoneModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	@PostMapping(value = "/new-user-email")
	public ResponseEntity<ResponseBaseModel> newUserEmail(
			@Valid @RequestBody NewUserEmailModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	@PostMapping(value = "/new-user-phone")
	public ResponseEntity<ResponseBaseModel> newUserPhone(
			@Valid @RequestBody NewUserPhoneModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	@PostMapping(value = "/phone-confirmation")
	public ResponseEntity<ResponseBaseModel> phoneConfirmation(
			@Valid @RequestBody PhoneConfirmationModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	@PostMapping(value = "/register-email")
	public ResponseEntity<ResponseBaseModel> registerEmail(
			@Valid @RequestBody RegisterEmailModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	@PostMapping(value = "/register-phone")
	public ResponseEntity<ResponseBaseModel> registerPhone(
			@Valid @RequestBody RegisterPhoneModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	
	@PostMapping(value = "/register-image")
	public ResponseEntity<ResponseBaseModel> registerPhone(
			@Valid @RequestBody RegisterImageModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		//return new ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}
	

}
