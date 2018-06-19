package com.example.apidemo.mocky.request;

import javax.validation.constraints.NotNull;

import com.example.apidemo.mocky.Language;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonPropertyOrder({ "password", "rememberMe", "username" })
public class TokenModel {

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
