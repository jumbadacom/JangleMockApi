package com.example.apidemo.mocky.response;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({ "profile_id", "username", "full_name", "profile_description", "profile_picture",
		"profile_picture_thumbnail", "jangle_count", "following_count", "follower_count", "score", "is_messaging_enabled" })
@Data
public class Profile {
	@NotNull
	@JsonProperty(value = "profile_id")
	private Integer userID;

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

	@JsonProperty(value = "jangle_count")
	private Integer jangles;

	@JsonProperty(value = "following_count")
	private Integer following;

	@JsonProperty(value = "follower_count")
	private Integer followers;

	@JsonProperty(value = "score")
	private Integer score;

	@JsonProperty(value = "is_messaging_enabled")
	private boolean isMessagingEnabled;

}
