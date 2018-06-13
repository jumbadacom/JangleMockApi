package com.example.apidemo.mocky.response;

import java.util.List;

import com.example.apidemo.mocky.Language;
import com.example.apidemo.mocky.LanguageMessages;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonPropertyOrder({ "response_code", "response_message", "show_to_user", "response_time", "user", "is_followed_by_me" })
@Data
@EqualsAndHashCode(callSuper = true)
public class ProfileSummaryResponse extends ResponseBaseModel {

	@JsonProperty(value = "user")
	private User user;

	@JsonProperty(value = "is_followed_by_me")
	private boolean isFollowedByMe;

	public ProfileSummaryResponse(LanguageMessages languageMessages, Language language) {
		super(languageMessages, language);
		// TODO Auto-generated constructor stub
	}

}
