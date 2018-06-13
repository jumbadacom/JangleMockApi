package com.example.apidemo.mocky.response;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonPropertyOrder({ "jangle_id", "user", "jangle_type", "jangle_time", "likes" })
@Data
public class Jangle {
	@NotNull
	@JsonProperty(value = "jangle_id")
	private String jangleID;

	@JsonProperty(value = "user")
	private User user;

	@JsonProperty(value = "jangle_type")
	private String jangleType;

	@JsonProperty(value = "jangle_time")
	private Date jangleTime;

	@JsonProperty(value = "likes")
	private List<Like> likes;

	@JsonProperty(value = "comments")
	private List<Comment> comments;

	@JsonProperty(value = "jangle_thumbnail")
	private String jangleThumbnail;
}
