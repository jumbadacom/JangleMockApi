package com.example.apidemo.mocky.response;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.apidemo.mocky.Language;
import com.example.apidemo.mocky.LanguageMessages;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({ "id_token" })
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TokenResponse {

	@JsonProperty("id_token")
	private String id_token;

	
	public ResponseEntity<TokenResponse> authenticate(HttpStatus status) {
		return new ResponseEntity<TokenResponse>(this, status);
	}

}
