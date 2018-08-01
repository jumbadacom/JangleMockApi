package com.example.apidemo.mocky;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

import javax.swing.ListModel;
import javax.validation.constraints.Null;

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
	
	private static int COUNTER=0;
	@Override
	public ResponseEntity<ResponseBaseModel> getMessages(int page) {
		
		MessageResponse mResponse =new MessageResponse(LanguageMessages.SUCCESFUL, Language.EN_US);
		mResponse.setMessages(getMessageList(page));
		return mResponse.generateInvisible(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseBaseModel> getMessagesById(int id, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ResponseBaseModel> getNotifications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ResponseBaseModel> getNotificationsById(int id, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String[] imageLinks= 
		    {
		    
		    		
		    "https://upload.wikimedia.org/wikipedia/commons/b/b2/Flag-map_of_Chernihiv_Oblast.png",
			"https://upload.wikimedia.org/wikipedia/commons/7/7a/Bengkulu_indonesia_Flag.png",
			"https://upload.wikimedia.org/wikipedia/commons/3/37/Flag-map_of_Zaporizhia_Oblast.png",
			"https://upload.wikimedia.org/wikipedia/commons/e/e1/LotFlag.gif",
			"https://upload.wikimedia.org/wikipedia/commons/b/bf/Telsiai_County_flag.png",
			"https://upload.wikimedia.org/wikipedia/commons/a/a8/Flag_map_of_Rio_Grande_Do_Sul.png",
			"https://upload.wikimedia.org/wikipedia/commons/2/21/600px_Bianco_con_gallo_e_palla_Blu.png",
			"https://upload.wikimedia.org/wikipedia/commons/3/3c/Arsk_rayon_flag.gif",
			"https://upload.wikimedia.org/wikipedia/commons/1/15/Governadorat_de_Suhaj.png",
			"https://upload.wikimedia.org/wikipedia/commons/5/57/Flag_of_Aznakayev_rayon_%28Tatarstan%29.png",
			"https://upload.wikimedia.org/wikipedia/commons/0/05/Flag_of_Aktanyshsky_rayon_%28Tatarstan%29.png",
			"https://upload.wikimedia.org/wikipedia/commons/6/61/Flag_of_Barsky_raion_in_Vinnytsia_oblast.png",
			"https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Zadonsk_rayon_%28Lipetsk_oblast%29.png",
			"https://upload.wikimedia.org/wikipedia/commons/0/0d/Flag_Verxovazhskij.jpg",
			"https://upload.wikimedia.org/wikipedia/commons/6/64/Flag_of_Dobrinka_rayon_%28Lipetsk_oblast%29.png",
			"https://upload.wikimedia.org/wikipedia/commons/0/0f/Bandeira_cabo_frio.png",
			"https://upload.wikimedia.org/wikipedia/commons/d/d4/Flag_of_Argayash_rayon_%28Chelyabinsk_oblast%29.png",
			"https://upload.wikimedia.org/wikipedia/commons/8/8c/Vlagjutiapa.gif",
			"https://upload.wikimedia.org/wikipedia/commons/8/8c/Pt-bcl1.png",
			"https://upload.wikimedia.org/wikipedia/commons/f/f4/Flag_of_Kunashak_rayon_%28Chelyabinsk_oblast%29.png",
			"https://upload.wikimedia.org/wikipedia/commons/b/b5/Flag_of_Sumyskyj_district.png",
			"https://upload.wikimedia.org/wikipedia/commons/4/46/Bandeira-saquarema.png",
			"https://upload.wikimedia.org/wikipedia/commons/c/cd/Flag_of_Rohatynsky_Rayon.png",
			"https://upload.wikimedia.org/wikipedia/commons/4/45/Bandeira_FozIguacu.png",
			"https://upload.wikimedia.org/wikipedia/commons/b/b0/Flag_of_Suzdalsky_rayon.gif",
			"https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Illineczky_raion_in_Vinnytsia_oblast.png",
			"https://upload.wikimedia.org/wikipedia/commons/7/7a/Flag_of_Tver.png",
			"https://upload.wikimedia.org/wikipedia/commons/2/26/Popelnianskii_rayon_fl.png",
			"https://upload.wikimedia.org/wikipedia/commons/b/b5/Flag_of_Tetyushi_%28Tatarstan%29.png",
			"https://upload.wikimedia.org/wikipedia/commons/8/88/Flag_of_Kolomyisky_raion_in_Ivano-Frankivsk_oblast.png",
			"https://upload.wikimedia.org/wikipedia/commons/3/3e/Flag_of_Aksubayevsky_rayon_%28Tatarstan%29.png",
			"https://upload.wikimedia.org/wikipedia/commons/6/69/Pt-vvd1.png",
			"https://upload.wikimedia.org/wikipedia/commons/f/fc/Chernahivskiy_rayon_prapor.png",
			"https://upload.wikimedia.org/wikipedia/commons/9/9f/Flag_of_Nizhnekamsk_rayon_%28Tatarstan%29.png",
			"https://upload.wikimedia.org/wikipedia/commons/6/67/FeSp%C3%A4Kp_200.png",
			"https://upload.wikimedia.org/wikipedia/commons/b/b5/LogBrig_200.png",
			"https://upload.wikimedia.org/wikipedia/commons/b/b6/1511A_Television_200.png",
			"https://upload.wikimedia.org/wikipedia/commons/1/1e/Cuba_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/2/21/Kenya_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/4/47/Algeria_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/c/c9/Colombia_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/a/a3/Estonia_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/1/1f/Spain_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/8/8a/Kazakhstan_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/1/13/Brazil_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/3/31/Lithuania_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/9/9a/Argentina_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/2/22/Bolivia_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/9/9a/Argentina_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/8/84/Hungary_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/9/92/India_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/c/ca/China_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/c/cb/South_Korea_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/d/d3/Benin_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/0/07/South_Africa_people_icon.png",
			"https://upload.wikimedia.org/wikipedia/commons/e/e5/Human-emblem-people-black-blue-128.png",
			"https://upload.wikimedia.org/wikipedia/commons/8/8c/Old_Sami_people_flag.PNG",
			"https://upload.wikimedia.org/wikipedia/commons/8/8e/Flag_of_the_Lezgi_people.png",
			"https://upload.wikimedia.org/wikipedia/commons/7/71/Human-emblem-people-blue-128.png",
			"https://upload.wikimedia.org/wikipedia/commons/6/63/Human-emblem-people-yellow-128.png",
			"https://upload.wikimedia.org/wikipedia/commons/c/c9/Human-emblem-people-red-128.png"
			
	};
	
	
	private List<Message> getMessageList(int page){
		
		RandomsGenerator rg =new RandomsGenerator();
		List<Message> messages = new ArrayList<>();
		int start=(page-1)*50+1;
		int finish=(page*50)+1;
		log.info("page start : "+start+" finish :"+finish);
        for (int i = start; i < finish; i++) {
        	
            Message.Profile profile = new Message.Profile(
            		rg.generateRandomIntByMaxDigit(false, 5)
                    , "@"+ rg.generateRandomAlphanumStringWithLengthRange(4, 16)
                    , rg.generateRandomAlphanumStringWithMaxLength(25)
                    , rg.generateRandomAlphanumStringWithMaxLength(70)
                    , rg.generateRandomAlphanumStringWithMaxLength(10)
                    , rg.generateRandomThumbnail()
                    , rg.generateRandomIntByMaxDigit(true, 4)
                    , rg.generateRandomIntByMaxDigit(true, 4)
                    , rg.generateRandomIntByMaxDigit(true, 6)
                    , rg.generateBoolean()
                    , rg.generateBoolean()
                    , rg.generateBoolean()
            );

            Message message = new Message(++COUNTER,
                    profile, rg.generateBoolean() ? "IMAGE" : "TEXT",
                    rg.generateRandomAlphanumStringWithLengthRange(15, 70),
                    rg.generateRandomInt(1, 70),
                    String.valueOf(COUNTER)
              
            );

            messages.add(message);
        }

        return messages;
		
	}
	
	 final static String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

     String lower2 = upper.toLowerCase(Locale.ROOT);

     final static String digits = "0123456789";

      String alphanum = upper + lower2 + digits;

    private class RandomsGenerator {

       

         Random random = new Random();

         String generateRandomThumbnail() {
        	int r=random.nextInt(70);
        	if (r>=60) {
        		return null;
        	}
        	else {
        		return imageLinks[r];
        	}
        	
        }

         String generateRandomAlphanumStringWithMaxLength(int maxLength) {
            int length = generateRandomInt(1, maxLength);
            return new RandomString(length).nextString();
        }

         String generateRandomAlphanumStringWithLengthRange(int minLength, int maxLength) {
            int length = generateRandomInt(minLength, maxLength);
            return new RandomString(length).nextString();
        }

         String generateRandomAlphanumStringFixedLength(int length) {
            return new RandomString(length).nextString();
        }

         String generateSpecialSymbolString(int maxLength, String symbols) {
            int length = generateRandomInt(1, maxLength);
            return new RandomString(length, symbols).nextString();
        }

         String generateSpecialSymbolStringFixedLength(int length, String symbols) {
            return new RandomString(length, symbols).nextString();
        }

          int generateRandomInt(int min, int max) {
            return random.nextInt((max - min) + 1) + min;
        }

         int generateRandomIntByMaxDigit(boolean isZeroInclusive, int maxDigit) {
            if (!isZeroInclusive)
                return generateRandomInt(1, (int) (Math.pow(10, maxDigit) - 1));
            else
                return generateRandomInt(0, (int) (Math.pow(10, maxDigit) - 1));

        }

         boolean generateBoolean() {
            return ((generateRandomInt(0, 1) % 2) == 1);
        }

         String generateTimeString() {
            int randomInt = generateRandomInt(1, 4);
            String timeString = null;
            switch (randomInt) {

                case 1:
                    timeString = (generateRandomInt(1, 9) +"");
                    break;

                case 2:
                    timeString = (generateRandomInt(0, 364) + "");
                    break;

                case 3:
                    timeString = (generateRandomInt(0, 23) + "");
                    break;

                case 4:
                    timeString = (generateRandomInt(1, 59) + "");
                    break;

            }

            return timeString;
        }

    }

    private  class RandomString {

        private final Random random;

        private final char[] symbols;

        private final char[] buf;

        public RandomString(int length, Random random, String symbols) {
            if (length < 1) throw new IllegalArgumentException();
            if (symbols.length() < 2) throw new IllegalArgumentException();
            this.random = Objects.requireNonNull(random);
            this.symbols = symbols.toCharArray();
            this.buf = new char[length];
        }

        /**
         * Create an alphanumeric string generator.
         */
        public RandomString(int length, Random random) {
            this(length, random, alphanum);
        }

        /**
         * Create an alphanumeric strings from a secure generator.
         */
        public RandomString(int length) {
            this(length, new SecureRandom());
        }

        /*
         * Create a string with special symbols.
         */
        public RandomString(int length, String symbols) {
            this(length, new SecureRandom(), symbols);
        }

        /**
         * Generate a random string.
         */
        public String nextString() {
            for (int idx = 0; idx < buf.length; ++idx)
                buf[idx] = symbols[random.nextInt(symbols.length)];
            return new String(buf);
        }
    }


	
	
	/*

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
			Profile profile = new Profile();
			Random random = new Random();
			profile.setFollowers(1000+random.nextInt(500));
			profile.setFollowing(10+random.nextInt(90));
			profile.setScore(2000+random.nextInt(5000));
			profile.setJangles(0);
			profile.setMessagingEnabled(i/2==0?true:false);
			profile.setProfileDescription(i/2==0?null:"sample description ...");
			profile.setProfilePicture("http://");
			profile.setProfilePictureThumbnail("http://");
			profile.setUserID(1000000+i);
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
			profile.setUsername(message.getUsername());
			profile.setFullName(message.getUsername()+" full");
			message.setProfile(profile);
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
	*/
	
	
	

}
