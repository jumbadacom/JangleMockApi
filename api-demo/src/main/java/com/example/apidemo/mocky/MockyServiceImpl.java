package com.example.apidemo.mocky;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.apidemo.mocky.response.Message;
import com.example.apidemo.mocky.response.MessageResponse;
import com.example.apidemo.mocky.response.Notification;
import com.example.apidemo.mocky.response.NotificationResponse;
import com.example.apidemo.mocky.response.Profile;
import com.example.apidemo.mocky.response.ResponseBaseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MockyServiceImpl implements MockyService {

	public ResponseEntity<ResponseBaseModel> getMessages() {

		List<Message> messages = new ArrayList<>();
		for (int i = 1; i < 16; i++) {
			Message message = new Message();
			message.setMessageId(10010 + i);
			message.setImageURL("http://");
			message.setTime(i + "s");
			message.setMessagesCount(0);
			if (i % 3 == 0) {
				message.setMessageType("TAIL");
				message.setMessageText("Tamamlama paylaştı");
				message.setUsername("@user-" + i);
			} else if (i % 3 == 1) {
				message.setMessageType("JANGLE");
				message.setMessageText("Jangle paylaştı");
				message.setUsername("@username" + i);

			} else {
				message.setMessageType("CHAT");
				message.setMessageText("Deneme mesaj test");
				message.setUsername("@user_" + i);
				message.setMessagesCount((int) Math.round(5) + i);
			}
			messages.add(message);
		}
		MessageResponse response = new MessageResponse(LanguageMessages.SUCCESFUL, Language.EN_US);
		response.setMessages(messages);
		return response.generateInvisible(HttpStatus.OK);

	}

	@Override
	public ResponseEntity<ResponseBaseModel> getMessagesById(int id, int page, int size) {
		// TODO Auto-generated method stub
		MessageResponse response = new MessageResponse(LanguageMessages.SUCCESFUL, Language.EN_US);
		response.setMessages(generateMessageList(id, page, size));
		return response.generateInvisible(HttpStatus.OK);

	}

	public ResponseEntity<ResponseBaseModel> getNotifications() {

		List<Notification> notifications = new ArrayList<>();
		for (int i = 1; i < 25; i++) {
			Notification notification = new Notification();
			Profile profile = new Profile();
			profile.setUserID(20000 + i);
			profile.setFullName("fullname_" + i);
			profile.setUsername("username_" + i);
			profile.setProfileDescription("desc_" + i);
			profile.setProfilePicture("profilepicture_" + i);
			profile.setProfilePictureThumbnail("profilepicturethumbnail_" + i);
			profile.setMessagingEnabled(true);
			notification.setProfile(new Profile());

			if (i % 5 == 0) {
				notification.getNotificationContent().setMessageType("JangleNews");
				notification.getNotificationContent().setMessageText(", Jangle Ekledi");
				notification.getNotificationContent().setUsername("@user-" + i);
			} else if (i % 5 == 1) {
				notification.getNotificationContent().setMessageType("JangleVotes");
				notification.getNotificationContent().setMessageText(", tamamlamanı reddetti.");
				notification.getNotificationContent().setUsername("@username" + i);

			} else if (i % 5 == 2) {
				notification.getNotificationContent().setMessageType("JangleVotes");
				notification.getNotificationContent().setMessageText(", tamamlamanı onayladı.");
				notification.getNotificationContent().setUsername("@username" + i);

			} else if (i % 5 == 3) {
				notification.getNotificationContent().setMessageType("JangleInteractions");
				notification.getNotificationContent().setMessageText(", Jangle'nı beğendi.");
				notification.getNotificationContent().setUsername("@username" + i);

			} else {
				notification.getNotificationContent().setMessageType("FollowRequest");
				notification.getNotificationContent().setMessageText(", takip isteğinde bulundu.");
				notification.getNotificationContent().setUsername("@user_" + i);
			}
			notifications.add(notification);
		}
		NotificationResponse response = new NotificationResponse(LanguageMessages.SUCCESFUL, Language.EN_US);
		response.setNotifications(notifications);
		return response.generateInvisible(HttpStatus.OK);

	}

	@Override
	public ResponseEntity<ResponseBaseModel> getNotificationsById(int id, int page, int size) {
		// TODO Auto-generated method stub
		NotificationResponse response = new NotificationResponse(LanguageMessages.SUCCESFUL, Language.EN_US);
		response.setNotifications(generateNotificationList(id, page, size));
		return response.generateInvisible(HttpStatus.OK);

	}

	private List<Message> generateMessageList(int id, int page, int size) {
		List<Message> messages = new ArrayList<>();
		int start = (page - 1) * size;
		for (int i = start; i < size * page; i++) {
			Message message = new Message();
			message.setMessageId(10100 + i);
			message.setImageURL("http://");
			message.setTime(i + "s");
			message.setMessagesCount(0);
			if (i % 3 == 0) {
				message.setMessageType("TAIL");
				message.setMessageText("Tamamlama paylaştı");
				message.setUsername("@user-" + i);
			} else if (i % 3 == 1) {
				message.setMessageType("JANGLE");
				message.setMessageText("Jangle paylaştı");
				message.setUsername("@username" + i);

			} else {
				message.setMessageType("CHAT");
				message.setMessageText("Deneme mesaj test");
				message.setUsername("@user_" + i);
				message.setMessagesCount((int) Math.round(5) + i);
			}
			messages.add(message);
		}
		return messages;
	}

	private List<Notification> generateNotificationList(int id, int page, int size) {
		List<Notification> notifications = new ArrayList<>();
		int start = (page - 1) * size;
		for (int i = start; i < size * page; i++) {
			Notification notification = new Notification();
			Profile profile = new Profile();
			profile.setUserID(20000 + i);
			profile.setFullName("fullname_" + i);
			profile.setUsername("username_" + i);
			profile.setProfileDescription("desc_" + i);
			profile.setProfilePicture("profilepicture_" + i);
			profile.setProfilePictureThumbnail("profilepicturethumbnail_" + i);
			profile.setMessagingEnabled(true);
			notification.setProfile(new Profile());
			if (i % 5 == 0) {
				notification.getNotificationContent().setMessageType("JangleNews");
				notification.getNotificationContent().setMessageText(", Jangle Ekledi");
				notification.getNotificationContent().setUsername("@user-" + i);
			} else if (i % 5 == 1) {
				notification.getNotificationContent().setMessageType("JangleVotes");
				notification.getNotificationContent().setMessageText(", tamamlamanı reddetti.");
				notification.getNotificationContent().setUsername("@username" + i);

			} else if (i % 5 == 2) {
				notification.getNotificationContent().setMessageType("JangleVotes");
				notification.getNotificationContent().setMessageText(", tamamlamanı onayladı.");
				notification.getNotificationContent().setUsername("@username" + i);

			} else if (i % 5 == 3) {
				notification.getNotificationContent().setMessageType("JangleInteractions");
				notification.getNotificationContent().setMessageText(", Jangle'nı beğendi.");
				notification.getNotificationContent().setUsername("@username" + i);

			} else {
				notification.getNotificationContent().setMessageType("FollowRequest");
				notification.getNotificationContent().setMessageText(", takip isteğinde bulundu.");
				notification.getNotificationContent().setUsername("@user_" + i);
			}
			notifications.add(notification);
		}
		return notifications;
	}

}
