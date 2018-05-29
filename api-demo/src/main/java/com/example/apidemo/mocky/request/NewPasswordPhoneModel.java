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
@JsonPropertyOrder({ "country_code", "phone_country_code", "phone_no", "confirm_code", "password", "language" })
public class NewPassPhoneModel {

	@NotNull
	@JsonProperty(value = "confirm_code")
	private Integer confirmCode;
	@NotBlank
	@Size(max = 10)
	@JsonProperty(value = "country_code")
	private String countryCode;
	@NotNull
	@JsonProperty(value = "language")
	private Language language;
	@NotBlank
	@Size(max = 21)
	@JsonProperty(value = "password")
	private String password;
	@NotNull
	@Size(max = 10)
	@JsonProperty(value = "phone_country_code")
	private String phoneCountryCode;
	@NotBlank
	@Size(max = 21)
	@JsonProperty(value = "phone_no")
	private String phoneNumber;
}