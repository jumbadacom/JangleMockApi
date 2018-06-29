package com.example.apidemo.aws;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apidemo.aws.request.BasicMailModel;
import com.example.apidemo.aws.request.ManagedUserVM;
import com.example.apidemo.aws.request.BasicPhoneModel;
import com.example.apidemo.aws.request.TokenRequestModel;
import com.example.apidemo.aws.response.JWTToken;
import com.example.apidemo.aws.response.KeyAndShortMessageVM;
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

	/*
	 * Response'u No-content oldugu icin sonra duzenlenecek.
	 * 
	 * @PostMapping(value = "/account/change-password") public
	 * ResponseEntity<ResultVM> changePassword(@Valid @RequestBody
	 * PasswordStringModel model) throws InterruptedException {
	 * 
	 * return service.changePassword(model); }
	 */

	@PostMapping(value = "/account/checkEmailInUser")
	public ResponseEntity<ResultVM> checkEmailInUser(@Valid @RequestBody BasicMailModel model)
			throws InterruptedException {

		return service.checkEmailInUser(model);
	}

	@PostMapping(value = "/account/checkPhoneInUse")
	public ResponseEntity<ResultVM> checkPhoneInUser(@Valid @RequestBody BasicPhoneModel model)
			throws InterruptedException {

		return service.checkPhoneInUser(model);
	}

	/*
	 * Response'u No-content oldugu icin sonra duzenlenecek.
	 * 
	 * @PostMapping(value = "/account/reset-password/init") public
	 * ResponseEntity<ResultVM> requestPasswordReset(@Valid @RequestBody
	 * PasswordStringModel model) throws InterruptedException {
	 * 
	 * return service.requestPasswordReset(model); }
	 */

	@PostMapping(value = "/reset-passwordBySms/init")
	public ResponseEntity<KeyAndShortMessageVM> requestPasswordResetBySMS(@Valid @RequestBody BasicPhoneModel model)
			throws InterruptedException {

		return service.requestPasswordResetBySMS(model);
	}

	/*
	 * Response (status : 200 icin) nesnesini "key" parametresi olmadigi icin
	 * gorememistik. Sonra duzenlenecek.
	 * 
	 * @PostMapping(value = "/reset-password/finish") public
	 * ResponseEntity<ResultVM> finishPasswordReset(@Valid @RequestBody
	 * KeyAndPasswordVM model) throws InterruptedException {
	 * 
	 * return service.finishPasswordReset(model); }
	 */

	@PostMapping(value = "/register")
	public ResponseEntity<JWTToken> registerAccount(@Valid @RequestBody ManagedUserVM model)
			throws InterruptedException {

		return service.registerAccount(model);
	}
}
