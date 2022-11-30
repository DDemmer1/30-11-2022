package de.demmer.dennis;

import java.util.Arrays;

public class Application {
	
	public static void main(String[] args) {

		int[] intArray = {1,5,6};
		
		int size = 10;
		int[] intArray2 = new int[size];
		
//		System.out.println(Arrays.toString(intArray2));
		
		
		EMail email1 = new EMail("Dennis.Demmer@web.de", "Nils.Reiter@gmail.com");
		EMail email2 = new EMail("D.Demmer@web.de", "N.R@gmail.com");
		EMail email3 = new EMail("Max.Mustermann@web.de", "Nils.Reiter@gmail.com");
		EMail email4 = new EMail("Klaus.Günther@gmx.de", "Max.Mustermann@web.de");
		EMail email5 = new EMail("Kls.Gr@gmx.de", "Max@web.de");


	

		Outbox outbox = new Outbox(4);
		outbox.addMail(email1);
		outbox.addMail(email2);
		outbox.addMail(email3);
		outbox.addMail(email4);
		outbox.addMail(email5);


		System.out.println(outbox.getMails());
		
		
		
		
//		System.out.println(Arrays.toString(intArray2));
//		System.out.println(MailUtils.mailToString(email1));
		

		
	}

}
