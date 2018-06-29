package com.example.apidemo.aws;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apidemo.aws.request.MailStringModel;
import com.example.apidemo.aws.request.PhoneStringModel;
import com.example.apidemo.aws.request.TokenRequestModel;
import com.example.apidemo.aws.response.ResultVM;
import com.example.apidemo.aws.response.TokenResponseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "api/")
@RestController
public class EntryController {

	private final EntryService service;

	public EntryController(EntryService service) {
		this.service = service;
	}

	@PostMapping(value = "/authenticate")
	public ResponseEntity<TokenResponseModel> authenticate(@Valid @RequestBody TokenRequestModel model)
			throws InterruptedException {

		return service.authenticate(model);
	}

	@PostMapping(value = "/account/checkEmailInUser")
	public ResponseEntity<ResultVM> checkEmailInUser(@Valid @RequestBody MailStringModel model)
			throws InterruptedException {

		return service.checkEmailInUser(model);
	}

	@PostMapping(value = "/account/checkPhoneInUse")
	public ResponseEntity<ResultVM> checkPhoneInUser(@Valid @RequestBody PhoneStringModel model)
			throws InterruptedException {

		return service.checkPhoneInUser(model);
	}

}
