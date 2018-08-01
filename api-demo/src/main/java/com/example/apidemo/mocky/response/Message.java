package com.example.apidemo.mocky.response;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    
    
    @JsonProperty("message_id")
    private int messageId;
    
    @JsonProperty("profile")
    private final Message.Profile profile;
    
    @JsonProperty("message_type")
    private String messageType;
    
    @JsonProperty("message_text")
    private String messageText;
     
    @JsonProperty("messages_count")
    private Integer messagesCount;
   
    @JsonProperty("time")
    private String time;

    public Message(int messageId, Profile profile, String messageType, String messageText, Integer messagesCount,
                   String time) {
        this.messageId = messageId;
        this.profile = profile;
        this.messageType = messageType;
        this.messageText = messageText;
        this.messagesCount = messagesCount;
        this.time = time;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public Profile getProfile() {
        return profile;
    }


    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Integer getMessagesCount() {
        return messagesCount;
    }

    public void setMessagesCount(Integer messagesCount) {
        this.messagesCount = messagesCount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static class Profile {

    	@JsonProperty("user_id")
        private final int userID;

    	@JsonProperty("username")
        private final String username;

    	@JsonProperty("full_name")
        private final String fullName;

    	@JsonProperty("profile_description")
        private final String profileDescription;

    	@JsonProperty("profile_picture_big")
        private final String profilePictureBig;

    	@JsonProperty("profile_picture_thumbnail")
        private final String profilePictureThumbnail;

    	@JsonProperty("following_count")
        private final int followingCount;

    	@JsonProperty("follower_count")
        private final int followerCount;

    	@JsonProperty("score")
        private final int score;

    	@JsonProperty("is_messaging_enabled")
        private final boolean isMessagingEnabled;

    	@JsonProperty("is_notifications_muted")
        private final boolean isNotificationsMuted;

    	@JsonProperty("is_followed")
        private final boolean isFollowed;

        public Profile(int userID, String username, String fullName, String profileDescription, String profilePictureBig, String
                profilePictureThumbnail, int followingCount, int followerCount, int score, boolean isMessagingEnabled, boolean
                               isNotificationsMuted, boolean isFollowed) {
            this.userID = userID;
            this.username = username;
            this.fullName = fullName;
            this.profileDescription = profileDescription;
            this.profilePictureBig = profilePictureBig;
            this.profilePictureThumbnail = profilePictureThumbnail;
            this.followingCount = followingCount;
            this.followerCount = followerCount;
            this.score = score;
            this.isMessagingEnabled = isMessagingEnabled;
            this.isNotificationsMuted = isNotificationsMuted;
            this.isFollowed = isFollowed;
        }

        public int getUserID() {
            return userID;
        }

        public String getUsername() {
            return username;
        }

        public String getFullName() {
            return fullName;
        }

        public String getProfileDescription() {
            return profileDescription;
        }

        public String getProfilePictureBig() {
            return profilePictureBig;
        }

        public String getProfilePictureThumbnail() {
            return profilePictureThumbnail;
        }

        public int getFollowingCount() {
            return followingCount;
        }

        public int getFollowerCount() {
            return followerCount;
        }

        public int getScore() {
            return score;
        }

        public boolean isMessagingEnabled() {
            return isMessagingEnabled;
        }

        public boolean isNotificationsMuted() {
            return isNotificationsMuted;
        }

        public boolean isFollowed() {
            return isFollowed;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Profile profile = (Profile) o;
            return userID == profile.userID &&
                    Objects.equals(username, profile.username);
        }

        @Override
        public int hashCode() {

            return Objects.hash(userID, username);
        }
    }

}
