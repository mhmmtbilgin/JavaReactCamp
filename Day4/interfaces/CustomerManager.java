package interfaces;

public class CustomerManager {
	private Logger[] loggers;
	
	//private Logger logger;
	/*public CustomerManager(Logger logger) {
		
		this.logger = logger;
	}*/
	
	public CustomerManager(Logger[] loggers) {
			this.loggers=loggers;
			
		}
	//loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("Musteri Eklendi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
		
	}
	
	
	public void delete(Customer customer) {
		System.out.println("Musteri Silindi : " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}

}


//Muhammet Bilgin...@mhmmtbilgin