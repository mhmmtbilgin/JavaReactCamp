package kalinSesliInceSesliHarfler;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Sesli Bir Harf Girin: ");
		String harf = reader.next(); 

	
		
				switch (harf) {
				case "A":
				case "I":
				case "U":
				case "O":
				case "a":
				case "ı":
				case "u":
				case "o":
					System.out.println(harf + " Harfi Kalın Seslidir.");
					break;

				default:
					
					System.out.println(harf + " Harfi İnce Seslidir.");
				}
				
			
				
				
			
		
		
		
		

	}

}

//Muhammet Bilgin...@mhmmtbilgin