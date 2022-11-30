package de.demmer.dennis;

import java.util.Arrays;

public class Outbox {
	
	private EMail[] mails;

	
	public Outbox(int outboxSize) {
		mails = new EMail[outboxSize];
	}
	
	
	
	public void addMail(EMail mail) {
		
		for(int i = 0 ; i < mails.length; i++) {
			
			if(mails[i] == null) {
				mails[i] = mail;
				return;
			}
		}
		
		doubleOutboxSize();
		addMail(mail);
		
		System.out.println("Die Mail " + mail + " konnte nicht in die Outbox genommen werden. Outbox ist voll. Bitte lösche ein paar mails");
	}
	
	
	private void doubleOutboxSize() {
	
		//TODO outbox doppelt so groß machen

	}
	
	
	
	
	
	public String getMails() {
		
		return Arrays.toString(mails);
	}
	

}
