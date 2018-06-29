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
@JsonPropertyOrder({ "activated", "authorities", "createdBy", "createdDate", "email", "firstName", "hiddenAccount",
		"image", "imageContentType", "imageUrl", "langKey", "lastModifiedBy", "lastModifiedDate", "lastName", "login",
		"password", "phone", "supportChat", "uuid" })
public class ManagedUserVM {

	@JsonProperty("activated")
	public boolean activated;

	@JsonProperty("authorities")
	public List<String> authorities = null;

	@JsonProperty("createdBy")
	public String createdBy;

	@JsonProperty("createdDate")
	public String createdDate;

	@JsonProperty("email")
	public String email;

	@JsonProperty("firstName")
	public String firstName;

	@JsonProperty("hiddenAccount")
	public boolean hiddenAccount;

	@JsonProperty("image")
	public String image;

	@JsonProperty("imageContentType")
	public String imageContentType;

	@JsonProperty("imageUrl")
	public String imageUrl;

	@JsonProperty("langKey")
	public String langKey;

	@JsonProperty("lastModifiedBy")
	public String lastModifiedBy;

	@JsonProperty("lastModifiedDate")
	public String lastModifiedDate;

	@JsonProperty("lastName")
	public String lastName;

	@JsonProperty("login")
	public String login;

	@JsonProperty("password")
	public String password;

	@JsonProperty("phone")
	public String phone;

	@JsonProperty("supportChat")
	public boolean supportChat;

	@JsonProperty("uuid")
	public String uuid;

}