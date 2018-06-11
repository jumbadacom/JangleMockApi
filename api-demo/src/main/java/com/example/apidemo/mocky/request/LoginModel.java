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
@JsonPropertyOrder({ "email", "password", "language" })
public class LoginModel {

	@NotNull
	@JsonProperty(value = "email")
	private String email;
	
	@NotNull
	@JsonProperty(value = "password")
	private String password;
	
	@NotNull
	@JsonProperty(value = "language")
	private Language language;

}
