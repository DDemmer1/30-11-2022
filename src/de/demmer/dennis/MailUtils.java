package de.demmer.dennis;

public class MailUtils {
	
	
	public static String mailToString(EMail mail) {
		return "Mail= [sender=" + mail.sender + ", text=" + mail.text + "]";
	}

}
