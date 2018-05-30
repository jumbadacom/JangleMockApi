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
@JsonPropertyOrder({ "email", "confirm_code", "password", "language" })
public class NewPasswordEmailModel {

	@NotBlank
	@JsonProperty(value = "email")
	private String email;

	@NotNull
	@JsonProperty(value = "confirm_code")
	private Integer confirmCode;

	@NotBlank
	@JsonProperty(value = "password")
	private String password;

	@NotNull
	@JsonProperty(value = "language")
	private Language language;

}
