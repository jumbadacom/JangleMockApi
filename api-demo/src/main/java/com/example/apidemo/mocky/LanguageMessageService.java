package com.example.apidemo.mocky;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.stereotype.Service;

/*Uyarı, şayet dosyayı bulamaz ise otomatik olarak sistemin lokaline göre sonucu gönderecektir. Dosya isim formatı "<dosya standart isim>_Language_Country" formatındadır.
 Detaylı bilgi = https://www.youtube.com/watch?v=2_Bvi5mz1-k
 */
@Service
public class LanguageMessageService {

	public static String getDateDiffFromDateMessage(LocalDateTime from, LocalDateTime to, Language language) {
		if(from==null) {return "";}
		LocalDateTime t1 = LocalDateTime.from(from);
		Long value = t1.until(to, ChronoUnit.YEARS);
		if (value == 0) {
			value = t1.until(to, ChronoUnit.MONTHS);
			if (value == 0) {
				value = t1.until(to, ChronoUnit.DAYS);
				if (value == 0) {
					value = t1.until(to, ChronoUnit.HOURS);
					if (value == 0) {
						value = t1.until(to, ChronoUnit.MINUTES);
						if (value == 0) {
							return LanguageMessageService.getMessage(language, LanguageMessages.NOW);
						}
						return value + " "
								+ ((value > 1) ? LanguageMessageService.getMessage(language, LanguageMessages.MINUTES)
										: LanguageMessageService.getMessage(language, LanguageMessages.MINUTE))
								+ " " + LanguageMessageService.getMessage(language, LanguageMessages.BEFORE);
					}
					return value + " "
							+ ((value > 1) ? LanguageMessageService.getMessage(language, LanguageMessages.HOURS)
									: LanguageMessageService.getMessage(language, LanguageMessages.HOUR))
							+ " " + LanguageMessageService.getMessage(language, LanguageMessages.BEFORE);
				}
				return value + " "
						+ ((value > 1) ? LanguageMessageService.getMessage(language, LanguageMessages.DAYS)
								: LanguageMessageService.getMessage(language, LanguageMessages.DAY))
						+ " " + LanguageMessageService.getMessage(language, LanguageMessages.BEFORE);
			}
			return value + " "
					+ ((value > 1) ? LanguageMessageService.getMessage(language, LanguageMessages.MONTHS)
							: LanguageMessageService.getMessage(language, LanguageMessages.MONTH))
					+ " " + LanguageMessageService.getMessage(language, LanguageMessages.BEFORE);
		}
		return value + " "
				+ ((value > 1) ? LanguageMessageService.getMessage(language, LanguageMessages.YEARS)
						: LanguageMessageService.getMessage(language, LanguageMessages.YEAR))
				+ " " + LanguageMessageService.getMessage(language, LanguageMessages.BEFORE);
	}

	public static String getDateDiffFromNowMessage(LocalDateTime from) {
		return getDateDiffFromDateMessage(from, LocalDateTime.now(), Language.EN_US);
	}

	public static String getDateDiffFromNowMessage(LocalDateTime from, Language language) {
		return getDateDiffFromDateMessage(from, LocalDateTime.now(), language);
	}

	public static String getMessage(Language language, InfoAction infoAction , Long count, Object... params) {
		if (language == null || language.getCountry() == null || language.getLanguage() == null) {
			language = Language.EN_US;
		}
		
		
		
		Locale locale = new Locale(language.getLanguage(), language.getCountry());
		ResourceBundle rb = ResourceBundle.getBundle("infoaction" /* dosya standart isim */, locale);
		if(count>0)
		{
			infoAction=infoAction.getMultiple();
		}
		String message = rb.getString(infoAction.getMessageCode());
		if (message == null || message.length() < 1) {
			message = "TRANSLATION NOT FOUND!";
		}
		if(count>0)
		{
			Object[] paramx=new Object[params.length+1];
			for(int i=0; i<params.length;i++)
			{
				paramx[i]=params[i];
			}
			paramx[params.length]=count+"";
			return MessageFormat.format(message, paramx);
		}
		return MessageFormat.format(message, params);
	}

	public static String getMessage(Language language, LanguageMessages languageMessages) {
		return getMessage(language, languageMessages.getMessageCode());
	}

	public static String getMessage(Language language, String messageCode) {
		if (language == null || language.getCountry() == null || language.getLanguage() == null) {
			language = Language.EN_US;
		}
		Locale locale = new Locale(language.getLanguage(), language.getCountry());
		ResourceBundle rb = ResourceBundle.getBundle("messages" /* dosya standart isim */, locale);
		String message = rb.getString(messageCode);
		if (message == null || message.length() < 1) {
			message = "TRANSLATION NOT FOUND!";
		}
		return message;
	}
}

