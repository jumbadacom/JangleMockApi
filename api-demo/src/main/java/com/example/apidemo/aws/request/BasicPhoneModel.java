package com.example.apidemo.aws.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "device_unique", "phone_code", "phone" })
public class BasicPhoneModel {

	@JsonProperty("device_unique")
	public String deviceUnique;

	@JsonProperty("phone_code")
	public String phoneCode;

	@JsonProperty("phone")
	public String phone;

}