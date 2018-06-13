package com.example.apidemo.mocky.response;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonPropertyOrder({ "user_id", "user", "time" })
@Data
public class Comment {
	@NotNull
	@JsonProperty(value = "comment_id")
	private String commentID;
	
	@JsonProperty(value = "user")
	private User user;
	
	@JsonProperty(value = "time")
	private Date time;
}
