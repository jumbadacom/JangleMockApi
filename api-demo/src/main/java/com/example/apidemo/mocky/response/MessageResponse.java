package com.example.apidemo.mocky.response;

import java.util.List;

import com.example.apidemo.mocky.Language;
import com.example.apidemo.mocky.LanguageMessages;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({ "response_code", "response_message", "show_to_user", "response_time", "messages" })
@Data
@EqualsAndHashCode(callSuper = true)
public class MessageResponse extends ResponseBaseModel {

	@JsonProperty("messages")
	private List<Message> messages = null;

	public MessageResponse(LanguageMessages languageMessages, Language language) {
		super(languageMessages, language);
		// TODO Auto-generated constructor stub
	}

}
