package interfaces;



public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new SmsLogger(),new EmailLogger(), new FileLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		Customer muhammet = new Customer(1, "Muhammet", "BILGIN");
		customerManager.add(muhammet);

	}

}

//Muhammet Bilgin...@mhmmtbilgin