package interfaces;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Email gonderildi : " + message);
		
	}

}

//Muhammet Bilgin...@mhmmtbilgin