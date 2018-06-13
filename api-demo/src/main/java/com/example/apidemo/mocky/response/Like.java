package com.example.apidemo.mocky.response;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Like {
	@NotNull
	@JsonProperty(value = "like_id")
	private String likeID;

	@JsonProperty(value = "user")
	private User user;

	@JsonProperty(value = "time")
	private Date time;
}
