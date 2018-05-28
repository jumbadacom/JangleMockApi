package com.example.apidemo.mocky;


/*message.properties sırasında olmalıdır. (Tek tek girilmesi)*/
/*0-2000 general*/
/*5000-6000 validation*/
/*1000-2000 info*/
/*3000-4000 warning*/
/*9000-9999 error*/
public enum LanguageMessages {
	/* General */
	NOT_FOUND(3, "not_found"), SUCCESFUL(0, "succesful"), FAILED(2, "failed"), CONFIRMED(1, "confirmed"), UNKNOWN(4,
			"unknown"), MALE(5, "male"), FEMALE(6, "female"), YEAR(7, "year"), YEARS(8,
					"year_multiple"), MONTH(9, "month"), MONTHS(10, "month_multiple"), DAY(11, "day"), DAYS(12,
							"days"), HOUR(13, "hour"), HOURS(14, "hours"), MINUTE(15,
									"minute"), MINUTES(16, "minutes"), BEFORE(17, "before"), NOW(18, "now"),

	/* Validation */
	VALIDATION_CODE_INVALID(5000, "validation.code.invalid"), VALIDATION_CODE_CONFIRM_CODE_INVALID(5001,
			"validation.code.confirm_code.invalid"), VALIDATION_CODE_CONFIRM_CODE_EXPIRED(5002,
					"validation.code.confirm_code.expired"), VALIDATION_EMAIL_INVALID(5003,
							"validation.email.invalid"), VALIDATION_EMAIL_ALREADY_THERE(5004,
									"validation.email.already_there"), VALIDATION_PASSWORD_INVALID(5005,
											"validation.password.invalid"), VALIDATION_PHONE_INVALID(5006,
													"validation.phone.invalid"), VALIDATION_PHONE_ALREADY_THERE(5007,
															"validation.phone.already_there"), VALIDATION_USER_USER_CANNOT_USE_SERVICE(
																	5008,
																	"validation.user.user_cannot_use_service"), VALIDATION_USERNAME_INVALID(
																			5009,
																			"validation.user.username.invalid"), VALIDATION_USER_USERNAME_ALREADY_THERE(
																					5010,
																					"validation.user.username.already_there"), VALIDATION_USER_USERNAME_EMPTY(
																							5011,
																							"validation.user.username.empty"), VALIDATION_USER_USERNAME_TOO_SHORT(
																									5012,
																									"validation.user.username.too_short"), VALIDATION_USER_USERNAME_TOO_LONG(
																											5013,
																											"validation.user.username.too_long"), VALIDATION_USER_USERNAME_INVALID_REGEX(
																													5014,
																													"validation.user.username.invalid_regex"), VALIDATION_USER_PASSWORD_EMPTY(
																															5015,
																															"validation.user.password.empty"), VALIDATION_USER_PASSWORD_TOO_SHORT(
																																	5016,
																																	"validation.user.password.too_short"), VALIDATION_USER_PASSWORD_TOO_LONG(
																																			5017,
																																			"validation.user.password.too_long"), VALIDATION_USER_PASSWORD_INVALID_REGEX(
																																					5018,
																																					"validation.user.password.invalid_regex"), VALIDATION_PHONE_UNCONFIRMED(
																																							5019,
																																							"validation.phone.unconfirmed"),

	/* Info */
	INFO_USER_PHONE_CONFIRMATION_CODE_POSTED(1001,
			"info.user.phone.confirmation.code_posted"), INFO_USER_EMAIL_CONFIRMATION_CODE_POSTED(1002,
					"info.user.email.confirmation.code_posted"), INFO_USER_REGISTER_PHONE_CONFIRMATION_SMS(1003,
							"info.user.register.phone.confirmation_sms"), INFO_USER_PASSWORD_RECOVERY_MAIL(1004,
									"info.user.password.recovery.mail"), INFO_USER_PASSWORD_RECOVERY_SMS(1005,
											"info.user.password.recovery.sms"), INFO_USER_PASSWORD_SUCCESFULLY_CHANGED(
													1006, "info.user.password.succesfully_changed"),

	/* Warning */
	WARNING_REQUIREMENT_NO_INFO_PLEASE_ENTER_MAIL_OR_PHONE(3000,
			"warning.requirement.no_info.please_enter_mail_or_phone"), WARNING_USER_PASSWORD_TOO_EASY(3001,
					"warning.user.password.too_easy"),

	/* Error */
	ERROR_USER_INVALID_LOGIN(9000, "error.user.invalid_login"), ERROR_CONNECTION(9001, "error.connection");

	private Integer code;
	private String messageCode;

	private LanguageMessages(Integer code, String messageCode) {
		this.messageCode = messageCode;
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public String getMessage(Language language) {
		return LanguageMessageService.getMessage(language, this);
	}

	public String getMessageCode() {
		return messageCode;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

}

