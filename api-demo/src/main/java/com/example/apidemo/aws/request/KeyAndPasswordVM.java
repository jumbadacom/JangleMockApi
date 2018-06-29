package com.example.apidemo.aws.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "key", "new_password", "reset_password_sms" })
public class KeyAndPasswordVM {

	@JsonProperty("key")
	public String key;

	@JsonProperty("newPassword")
	public String newPassword;

	@JsonProperty("resetPasswordSms")
	public int resetPasswordSms;

}