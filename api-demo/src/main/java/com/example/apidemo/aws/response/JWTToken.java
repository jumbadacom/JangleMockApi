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
@JsonPropertyOrder({ "id_token" })
public class JWTToken {

	@JsonProperty("id_token")
	public String idToken;

	public ResponseEntity<JWTToken> registerAccount(HttpStatus status) {
		return new ResponseEntity<JWTToken>(this, status);
	}

}