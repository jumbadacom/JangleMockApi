package com.example.apidemo.aws;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apidemo.aws.request.TokenRequestModel;
import com.example.apidemo.aws.response.TokenResponseModel;
import com.example.apidemo.mocky.MockyService;
import com.example.apidemo.mocky.request.SampleModel;
import com.example.apidemo.mocky.response.ResponseBaseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "api/")
@RestController
public class ApiController {

	private final ApiService service;

	public ApiController(ApiService service) {
		this.service = service;
	}

	@PostMapping(value = "/authenticate")
	public ResponseEntity<TokenResponseModel> authenticate(@Valid @RequestBody TokenRequestModel model)
			throws InterruptedException {

		return service.authenticate(model);
	}
}
