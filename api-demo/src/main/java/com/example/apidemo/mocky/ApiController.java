package com.example.apidemo.mocky;

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

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "api/")
@RestController
public class ApiController {

	private static final long SLEEP = 500;

	
	// şimdilik NOT_ACCEPTABLE gönderdim. Android tarafında switch(response.status) 'te NOT_ACCEPTABLE durumunu handle edip toast göstereceğim.
	@PostMapping(value = "/authenticate")
	public ResponseEntity<String> authenticate(@Valid @RequestBody TokenModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);

		if (model.getUsername().equals("admin") && model.getPassword().equals("admin")) {
			if (model.isRememberMe())
				return new ResponseEntity<>("AUTH BAŞARILI: TOKEN YARATILDI, REMEMBER ME: TRUE", HttpStatus.OK);
			else
				return new ResponseEntity<>("AUTH BAŞARILI: TOKEN YARATILDI, REMEMBER ME: FALSE", HttpStatus.OK);
		} else
			return new ResponseEntity<>("AUTH BAŞARISIZ", HttpStatus.NOT_ACCEPTABLE);
	}
}
