package com.example.apidemo.mocky.response;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.apidemo.mocky.Language;
import com.example.apidemo.mocky.LanguageMessages;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({ "response_code", "response_message", "show_to_user", "response_time" })
public class ResponseBaseModel {
	@JsonProperty(value = "response_code")
	private Integer responseCode;
	@JsonProperty(value = "response_message")
	private String responseMessage;
	@JsonProperty(value = "response_time")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
	private Date responseTime = new Date();
	@JsonProperty(value = "show_to_user")
	private boolean showToUser;

	public ResponseBaseModel(LanguageMessages languageMessages) {
		new ResponseBaseModel(languageMessages);
	};

	public ResponseBaseModel(LanguageMessages languageMessages, Language language) {
		setResponseCode(languageMessages.getCode());
		setResponseMessage(languageMessages.getMessage((language != null) ? language : Language.EN_US));
		setShowToUser(true);
		// setResponseTime(LocalDateTime.now(Clock.systemUTC()));
	};
	

	public ResponseEntity<ResponseBaseModel> generateInvisible(HttpStatus status) {
		setShowToUser(false);
		return new ResponseEntity<ResponseBaseModel>(this, status);
	}

	public ResponseEntity<ResponseBaseModel> generateVisible(HttpStatus status) {
		setShowToUser(true);
		return new ResponseEntity<ResponseBaseModel>(this, status);
	}

}
