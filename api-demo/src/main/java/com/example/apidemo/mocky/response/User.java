package com.example.apidemo.mocky.response;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonPropertyOrder({ "user_id", "username", "full_name", "profile_description", "profile_picture",
		"profile_picture_thumbnail", "jangles", "follows", "followers", "score", "is_messaging_enabled" })
@Data
public class User {
	@NotNull
	@JsonProperty(value = "user_id")
	private String userID;

	@NotNull
	@JsonProperty(value = "username")
	private String username;

	@JsonProperty(value = "full_name")
	private String fullName;

	@JsonProperty(value = "profile_description")
	private String profileDescription;

	@JsonProperty(value = "profile_picture")
	private String profilePicture;

	@JsonProperty(value = "profile_picture_thumbnail")
	private String profilePictureThumbnail;

	@JsonProperty(value = "jangles")
	private List<Jangle> jangles;

	@JsonProperty(value = "follows")
	private List<User> follows;

	@JsonProperty(value = "followers")
	private List<User> followers;

	@JsonProperty(value = "score")
	private int score;

	@JsonProperty(value = "is_messaging_enabled")
	private boolean isMessagingEnabled;

}
