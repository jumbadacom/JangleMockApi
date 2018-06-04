package com.example.apidemo.mocky.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonPropertyOrder({
"imageURL",
"username",
"messsageType",
"messageText",
"messagesCount",
"time"
})
@Data
public class Message {
	

@JsonProperty("imageURL")
private String imageURL;
@JsonProperty("username")
private String username;
@JsonProperty("messsageType")
private String messsageType;
@JsonProperty("messageText")
private String messageText;
@JsonProperty("messagesCount")
private Integer messagesCount;
@JsonProperty("time")
private String time;
}
