package com.example.apidemo.mocky.response;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonPropertyOrder({ "notification_id", "profile","notification_content", "notification_time", "notification_thumbnail"})
@Data
public class Notification {
	
	@NotNull
	@JsonProperty(value = "notification_id")
	private Integer notificationId;
	
	@NotNull
	@JsonProperty(value = "profile")
	private Profile profile;
	
	@JsonProperty(value ="notification_content")
	private NotificationContent notificationContent;
	
	@JsonProperty(value = "notification_time")
	private Date notificationTime;
	
	@JsonProperty(value = "notification_thumbnail")
	private String notificationThumbnail;
}
