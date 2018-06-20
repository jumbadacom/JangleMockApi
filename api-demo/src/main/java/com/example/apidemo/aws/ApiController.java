package com.example.apidemo.aws;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apidemo.mocky.request.SampleModel;
import com.example.apidemo.mocky.request.TokenModel;
import com.example.apidemo.mocky.response.ResponseBaseModel;
import com.example.apidemo.mocky.response.TokenResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "api/")
@RestController
public class ApiController {

	private static final long SLEEP = 500;

	// şimdilik NOT_ACCEPTABLE gönderdim. Android tarafında switch(response.status)
	// 'te NOT_ACCEPTABLE durumunu handle edip toast göstereceğim.
	@PostMapping(value = "/authenticate")
	public ResponseEntity<TokenResponse> authenticate(@Valid @RequestBody TokenModel model)
			throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);

		TokenResponse responseModel = new TokenResponse(
				"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTUzMTk5MzYzOH0.85_2kmqpQxjicPFvmOYbkRnPhzk3lJtNc6YscQEWfB-XRPpwHwDDiQDY2Nay7QajRzpOCjqE-g36VwAsO1oMWA");
		;

		return responseModel.authenticate(HttpStatus.OK);

	}
}
