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
@JsonPropertyOrder({ "country_iso_code", "country_digit_code", "phone_no", "username", "password", "language" })
public class RegisterPhoneModel {

	@NotBlank
	@NotNull
	@JsonProperty("country_iso_code")
	private String countryISOCode;

	@NotNull
	@JsonProperty("country_digit_code")
	private String countryDigitCode;

	@NotBlank
	@JsonProperty("phone_no")
	private String phoneNo;

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