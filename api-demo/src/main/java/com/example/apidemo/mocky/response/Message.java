package com.example.apidemo.mocky.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonPropertyOrder({
	"message_id",
"image_url",
"username",
"message_type",
"message_text",
"messages_count",
"time"
})
@Data
public class Message {
	
	@JsonProperty("message_id")
	private Integer messageId;
@JsonProperty("image_url")
private String imageURL;
@JsonProperty("username")
private String username;
@JsonProperty("message_type")
private String messageType;
@JsonProperty("message_text")
private String messageText;
@JsonProperty("messages_count")
private Integer messagesCount;
@JsonProperty("time")
private String time;
}
