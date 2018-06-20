package com.example.apidemo.mocky.response;

import javax.validation.constraints.NotNull;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonPropertyOrder({ "message_id", "image_url", "username", "message_type", "message_text", "messages_count", "time","profile" })
@Data
public class Message {
	@NotNull
	@JsonProperty(value = "message_id")
	private Integer messageId;
	@JsonProperty(value = "image_url")
	private String imageURL;
	@JsonProperty(value = "username")
	private String username;
	@JsonProperty(value = "message_type")
	private String messageType;
	@JsonProperty(value = "message_text")
	private String messageText;
	@JsonProperty(value = "messages_count")
	private Integer messagesCount;
	@JsonProperty(value = "time")
	private String time;
	@JsonProperty("profile")
	private Profile profile;
	
	
}
