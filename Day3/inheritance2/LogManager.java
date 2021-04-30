package inheritance2;

public class LogManager {
	public void log(int logType) {
		if (logType == 1) {
			System.out.println("Veri Tabanina Loglandi.");
		}else if (logType == 2) {
			System.out.println("Dosyaya Loglandi.");
			
		}else {
			System.out.println("Email Loglandi.");
		}
	}

}
//1 - Database
//2 - File
//3 - Email

//Muhammet Bilgin...@mhmmtbilgin