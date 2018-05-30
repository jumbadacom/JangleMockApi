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
@JsonPropertyOrder({ "country_iso_code", "country_digit_code",  "confirm_code", "phone_no", "language" })
public class PhoneConfirmationModel {

	@NotBlank
	@NotNull
	@JsonProperty(value = "country_iso_code")
	private String countryISOCode;

	@NotBlank
	@NotNull
	@JsonProperty(value = "country_digit_code")
	private String countryDigitCode;


	@NotNull
	@JsonProperty(value = "confirm_code")
	private Integer confirmCode;

	@NotBlank
	@NotNull
	@JsonProperty(value = "phone_no")
	private String phoneNo;

	@NotNull
	@JsonProperty(value = "language")
	private Language language;

}
