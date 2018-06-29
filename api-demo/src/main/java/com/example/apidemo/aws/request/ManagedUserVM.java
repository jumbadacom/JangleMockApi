package com.example.apidemo.aws.request;

import java.util.List;

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
@JsonPropertyOrder({ "activated", "authorities", "created_by", "created_date", "email", "first_name", "hidden_account",
		"image", "image_content_type", "image_url", "lang_key", "last_modified_by", "last_modified_date", "last_name",
		"login", "password", "phone", "support_chat", "uuid" })
public class ManagedUserVM {

	@JsonProperty("activated")
	public boolean activated;

	@JsonProperty("authorities")
	public List<String> authorities = null;

	@JsonProperty("created_by")
	public String createdBy;

	@JsonProperty("created_date")
	public String createdDate;

	@JsonProperty("email")
	public String email;

	@JsonProperty("first_name")
	public String firstName;

	@JsonProperty("hidden_account")
	public boolean hiddenAccount;

	@JsonProperty("image")
	public String image;

	@JsonProperty("image_content_type")
	public String imageContentType;

	@JsonProperty("image_url")
	public String imageUrl;

	@JsonProperty("lang_key")
	public String langKey;

	@JsonProperty("last_modified_by")
	public String lastModifiedBy;

	@JsonProperty("last_modified_date")
	public String lastModifiedDate;

	@JsonProperty("last_name")
	public String lastName;

	@JsonProperty("login")
	public String login;

	@JsonProperty("password")
	public String password;

	@JsonProperty("phone")
	public String phone;

	@JsonProperty("support_chat")
	public boolean supportChat;

	@JsonProperty("uuid")
	public String uuid;

}