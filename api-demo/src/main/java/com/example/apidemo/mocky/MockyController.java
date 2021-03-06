package com.example.apidemo.mocky;

import java.io.IOException;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.apidemo.mocky.request.LoginModel;
import com.example.apidemo.mocky.request.NewPasswordEmailModel;
import com.example.apidemo.mocky.request.NewPasswordPhoneModel;
import com.example.apidemo.mocky.request.NewUserEmailModel;
import com.example.apidemo.mocky.request.NewUserPhoneModel;
import com.example.apidemo.mocky.request.PasswordRecoveryEmailModel;
import com.example.apidemo.mocky.request.PasswordRecoveryPhoneModel;
import com.example.apidemo.mocky.request.PhoneConfirmationModel;
import com.example.apidemo.mocky.request.RegisterEmailModel;
import com.example.apidemo.mocky.request.RegisterImageModel;
import com.example.apidemo.mocky.request.RegisterPhoneModel;
import com.example.apidemo.mocky.request.SampleModel;
import com.example.apidemo.mocky.request.SettingsModel;
import com.example.apidemo.mocky.response.ResponseBaseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "api/entry")
@RestController
public class MockyController {

	private final MockyService mockyService;

	public MockyController(MockyService mockyService) {
		this.mockyService = mockyService;
	}

	private static final long SLEEP = 500;

	@PostMapping(value = "/login")
	public ResponseEntity<ResponseBaseModel> login(@Valid @RequestBody LoginModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL, model.getLanguage()).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/sample")
	public ResponseEntity<ResponseBaseModel> sample(@Valid @RequestBody SampleModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/password-recovery-phone")
	public ResponseEntity<ResponseBaseModel> recoverPass(@Valid @RequestBody PasswordRecoveryPhoneModel model)
			throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_PHONE_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/password-recovery-email")
	public ResponseEntity<ResponseBaseModel> recoverEmail(@Valid @RequestBody PasswordRecoveryEmailModel model)
			throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/new-password-email")
	public ResponseEntity<ResponseBaseModel> newPassEmail(@Valid @RequestBody NewPasswordEmailModel model)
			throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/new-password-phone")
	public ResponseEntity<ResponseBaseModel> newPassPhone(@Valid @RequestBody NewPasswordPhoneModel model)
			throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/new-user-email")
	public ResponseEntity<ResponseBaseModel> newUserEmail(@Valid @RequestBody NewUserEmailModel model)
			throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/new-user-phone")
	public ResponseEntity<ResponseBaseModel> newUserPhone(@Valid @RequestBody NewUserPhoneModel model)
			throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/phone-confirmation")
	public ResponseEntity<ResponseBaseModel> phoneConfirmation(@Valid @RequestBody PhoneConfirmationModel model)
			throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/register-email")
	public ResponseEntity<ResponseBaseModel> registerEmail(@Valid @RequestBody RegisterEmailModel model)
			throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/register-phone")
	public ResponseEntity<ResponseBaseModel> registerPhone(@Valid @RequestBody RegisterPhoneModel model)
			throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/register-image-upload", consumes = { "multipart/form-data", "application/json" })
	public ResponseEntity<ResponseBaseModel> uploadProfileImage(@RequestPart("model") RegisterImageModel model,
			@RequestPart("file") MultipartFile uploadfile) throws IOException {
		log.info(model.toString());
		log.info("Uploaded image size: " + uploadfile.getSize());
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@GetMapping(value = "/messages")
	public ResponseEntity<ResponseBaseModel> getMessages(@RequestParam("page") Integer page)
			throws InterruptedException {
		log.info("messages "+" page: "+page );
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return mockyService.getMessages(page);
	}

	@GetMapping(value = "/messages/{id}")
	public ResponseEntity<ResponseBaseModel> getMessagesById(@PathVariable Integer id,
			@RequestParam("page") Integer page, @RequestParam("size") Integer size) throws InterruptedException {
		log.info("getMessagesById " + String.valueOf(id));
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return mockyService.getMessagesById(id, page, size);
	}

	@GetMapping(value = "/notifications")
	public ResponseEntity<ResponseBaseModel> getNotifications(@RequestParam("userId") Integer id)
			throws InterruptedException {
		log.info(String.valueOf(id));
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return mockyService.getNotifications();
	}

	@GetMapping(value = "/notifications/{id}")
	public ResponseEntity<ResponseBaseModel> getNotificationsById(@PathVariable Integer id,
			@RequestParam("page") Integer page, @RequestParam("size") Integer size) throws InterruptedException {
		log.info("getMessagesById " + String.valueOf(id));
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return mockyService.getNotificationsById(id, page, size);
	}

	@PostMapping(value = "/settings-main-private-account")
	public ResponseEntity<ResponseBaseModel> settingsMainPrivateAccount(@Valid @RequestBody SettingsModel model)
			throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);

		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);

	}

	@PostMapping(value = "/settings-main-disable-incoming-messages")
	public ResponseEntity<ResponseBaseModel> settingsMainDisableIncomingMessages(
			@Valid @RequestBody SettingsModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/settings-main-hide-read-info")
	public ResponseEntity<ResponseBaseModel> settingsMainHideReadInfo(@Valid @RequestBody SettingsModel model)
			throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/settings-notifications-following-voted")
	public ResponseEntity<ResponseBaseModel> settingsNotificationsFollowingVoted(
			@Valid @RequestBody SettingsModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/settings-notifications-following-likes")
	public ResponseEntity<ResponseBaseModel> settingsNotificationsFollowingLikes(
			@Valid @RequestBody SettingsModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/settings-notifications-following-jangle")
	public ResponseEntity<ResponseBaseModel> settingsNotificationsFollowingJangle(
			@Valid @RequestBody SettingsModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/settings-notifications-not-following-voted")
	public ResponseEntity<ResponseBaseModel> settingsNotificationsNotFollowingVoted(
			@Valid @RequestBody SettingsModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/settings-notifications-not-following-Likes")
	public ResponseEntity<ResponseBaseModel> settingsNotificationsNotFollowingLikes(
			@Valid @RequestBody SettingsModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/settings-notifications-not-following-follow")
	public ResponseEntity<ResponseBaseModel> settingsNotificationsNotFollowingFollow(
			@Valid @RequestBody SettingsModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/settings-notifications-email-and-sms-jangle-news")
	public ResponseEntity<ResponseBaseModel> settingsNotificationsEmainAndSMSJangleNews(
			@Valid @RequestBody SettingsModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

	@PostMapping(value = "/settings-notifications-email-and-sms-jangle-interactions")
	public ResponseEntity<ResponseBaseModel> settingsNotificationsEmainAndSMSJangleInteractions(
			@Valid @RequestBody SettingsModel model) throws InterruptedException {
		log.info(model.toString());
		Thread.sleep(SLEEP);
		// return new
		// ResponseBaseModel(LanguageMessages.VALIDATION_EMAIL_INVALID,model.getLanguage()).generateInvisible(HttpStatus.BAD_REQUEST);
		return new ResponseBaseModel(LanguageMessages.SUCCESFUL).generateInvisible(HttpStatus.OK);
	}

}
