package com.example.apidemo.mocky.response;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonPropertyOrder({ "jangle_id", "user", "jangle_type", "jangle_time", "jangle_thumbnail" })
@Data
public class Jangle {
	@NotNull
	@JsonProperty(value = "jangle_id")
	private String jangleID;

	@JsonProperty(value = "profile")
	private Profile profile;

	@JsonProperty(value = "jangle_type")
	private String jangleType;

	@JsonProperty(value = "jangle_time")
	private Date jangleTime;

	@JsonProperty(value = "jangle_thumbnail")
	private String jangleThumbnail;
}
