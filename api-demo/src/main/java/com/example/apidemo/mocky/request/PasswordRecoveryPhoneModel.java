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
@JsonPropertyOrder({ "country_code", "iso_code", "phone_no", "language" })
public class RecoveryPasswordModel {

	
	@NotNull
	@JsonProperty(value = "country_code")
	private Integer countryCodel;
	@NotBlank
	@JsonProperty(value = "iso_code")
	private String isoCode;
	@NotBlank
	@JsonProperty(value = "phone_no")
	private String phoneNo;
	@NotNull
	@JsonProperty(value = "language")
	private Language language;

	
}
