package interfaces;
//Loggeri SmsLoggera uyarla
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Sms gonderildi : "+ message);
		
	}
	

}

//Muhammet Bilgin...@mhmmtbilgin