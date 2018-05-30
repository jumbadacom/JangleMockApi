package com.example.apidemo.mocky.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.apidemo.mocky.Language;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonPropertyOrder({ "email", "username", "password", "language" })
public class RegisterEmailModel {

	@NotBlank
	@JsonProperty("email")
	private String email;

	@NotBlank
	@JsonProperty("username")
	private String username;

	@NotBlank
	@JsonProperty("password")
	private String password;

	@NotNull
	@JsonProperty(value = "language")
	private Language language;

}
