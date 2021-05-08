package interfaceDemo;
// Bizim Calisanimiz..
public class Worker implements Workable , Eatable, Payable{

	@Override
	public void work() {
		System.out.println("Isletme ici calisan...");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Isletme ici calisan yemegi...");
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Isletme ici calisan maasi...");
		
	}
	

}

//Muhammet Bilgin...@mhmmtbilgin