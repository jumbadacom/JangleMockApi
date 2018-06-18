package com.example.apidemo.mocky.response;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonPropertyOrder({ "username", "message_type", "message_text" })
@Data
public class NotificationContent {
	
	@JsonProperty(value = "username")
	private String username;
	
	@JsonProperty(value = "message_type")
	private String messageType;
	
	@JsonProperty(value = "message_text")
	private String messageText;
}
