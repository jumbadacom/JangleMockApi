package com.example.apidemo.mocky.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonPropertyOrder({
"imageURL",
"username",
"messageType",
"messageText",
"messagesCount",
"time"
})
@Data
public class Message {
	
	@JsonProperty("messageId")
	private Integer messageId;
@JsonProperty("imageURL")
private String imageURL;
@JsonProperty("username")
private String username;
@JsonProperty("messageType")
private String messageType;
@JsonProperty("messageText")
private String messageText;
@JsonProperty("messagesCount")
private Integer messagesCount;
@JsonProperty("time")
private String time;
}
