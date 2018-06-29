package com.example.apidemo.aws.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "result" })
public class AuthenticateResponseModel {

	@JsonProperty("result")
	public String result;

	public ResponseEntity<AuthenticateResponseModel> isAuthenticated(HttpStatus status) {
		return new ResponseEntity<AuthenticateResponseModel>(this, status);
	}

}
