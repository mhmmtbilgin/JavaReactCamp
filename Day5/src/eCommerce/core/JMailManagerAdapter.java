package eCommerce.core;

import eCommerce.JMail.JMailManager;

public class JMailManagerAdapter implements MailService {

	@Override
	public void mailTo(String message) {
		// TODO Auto-generated method stub
		JMailManager manager = new JMailManager();
		manager.log(message);
		
		
	}

	@Override
	public void verificationLink(String message) {
		// TODO Auto-generated method stub
		JMailManager manager = new JMailManager();
		manager.log(message);
	}

}

//Muhammet Bilgin...@mhmmtbilgin
