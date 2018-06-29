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
@JsonPropertyOrder({ "key", "shortMessage" })
public class KeyAndShortMessageVM {

	@JsonProperty("key")
	public String key;

	@JsonProperty("short_message")
	public String shortMessage;

	public ResponseEntity<KeyAndShortMessageVM> requestPasswordResetBySMS(HttpStatus status) {
		return new ResponseEntity<KeyAndShortMessageVM>(this, status);
	}

}