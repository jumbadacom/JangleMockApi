package com.example.apidemo.mocky.response;


import com.example.apidemo.mocky.Language;
import com.example.apidemo.mocky.LanguageMessages;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonPropertyOrder({ "response_code", "response_message", "show_to_user", "response_time", "user", "action",
		"action_time" })
@Data
@EqualsAndHashCode(callSuper = true)
public class JangleResponse extends CommonResponse {

	@JsonProperty(value = "user")
	private User user;

	public JangleResponse(LanguageMessages languageMessages, Language language) {
		super(languageMessages, language);
		// TODO Auto-generated constructor stub
	}
}
