package com.example.apidemo.aws.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonPropertyOrder({ "password", "remember_me", "username" })
public class TokenRequestModel {

	@NotNull
	@JsonProperty(value = "password")
	private String password;

	@NotNull
	@JsonProperty(value = "rememberMe")
	private boolean rememberMe;

	@NotNull
	@JsonProperty(value = "username")
	private String username;

}
