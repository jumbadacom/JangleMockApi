package com.example.apidemo.mocky.response;

import java.util.Date;

import com.example.apidemo.mocky.Language;
import com.example.apidemo.mocky.LanguageMessages;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public abstract class CommonResponse extends ResponseBaseModel {

	@JsonProperty(value = "jangle")
	private Jangle jangle;

	@JsonProperty(value = "action")
	private String action;

	@JsonProperty(value = "action_time")
	private Date actionTime;

	public CommonResponse(LanguageMessages languageMessages, Language language) {
		super(languageMessages, language);
		// TODO Auto-generated constructor stub
	}

}
