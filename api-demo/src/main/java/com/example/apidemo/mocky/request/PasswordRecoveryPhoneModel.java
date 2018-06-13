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
@JsonPropertyOrder({ "country_iso_code", "country_digit_code", "phone_no" })
public class PasswordRecoveryPhoneModel {

	@NotBlank
	@JsonProperty(value = "country_iso_code")
	private String countryISOCode;

	@NotNull
	@JsonProperty(value = "country_digit_code")
	private Integer countryDigitCode;

	@NotBlank
	@JsonProperty(value = "phone_no")
	private String phoneNo;

}
