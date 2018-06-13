package com.example.apidemo.mocky.request;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonPropertyOrder({ "user_id", "is_enabled" })
public class SettingsModel {

	@NotNull
	@JsonProperty(value = "user_id")
	private String userID;

	@JsonProperty(value = "is_enabled")
	private boolean isEnabled;

}
