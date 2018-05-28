package com.example.apidemo.mocky;


public enum InfoAction {

	JANGLE_ADDED("jangle.added"), 
	JANGLE_LIKE("jangle.like"),
	JANGLE_LIKE_MULTIPLE("jangle.like.multiple"),
	
	COMPLETER_ADDED("completer.added"), 
	COMPLETER_CONFIRMED("completer.confirmed"), 
	COMPLETER_DECLINED("completer.declined"), 
	COMPLETER_LIKE("completer.like"),
	COMPLETER_LIKE_MULTIPLE("completer.like.multiple"),
	
	FOLLOWER_REQUEST("follower.request"),
	FOLLOWER_REQUEST_MULTIPLE("follower.request.multiple"),
	
	FOLLOWING_CONFIRMED("following.confirmed"), 
	FOLLOWING_DECLINED("following.declined"), 
	MESSAGE_NEW("message.new"),;

	private String messageCode;

	private InfoAction(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessage2(Language language , Long count) {
		return LanguageMessageService.getMessage(language, this,count);
	}

	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	
	public InfoAction getMultiple()
	{
		switch (this) {
		case JANGLE_LIKE:
			return JANGLE_LIKE_MULTIPLE;
		case COMPLETER_LIKE:
			return COMPLETER_LIKE_MULTIPLE;
		case FOLLOWER_REQUEST:
			return FOLLOWER_REQUEST_MULTIPLE;
		default:
			return this;
		}
	}
}
