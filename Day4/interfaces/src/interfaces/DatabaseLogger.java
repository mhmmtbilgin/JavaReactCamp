package interfaces;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Veri tabani loglandi: "+ message);
	}

}

//Muhammet Bilgin...@mhmmtbilgin