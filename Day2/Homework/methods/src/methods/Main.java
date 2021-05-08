package methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rakamBulmaca();
		

	}
	
	public static void rakamBulmaca() {
		Scanner reader = new Scanner(System.in);
		int[] sayilar= new int[]{1,2,3,5,6,7,8,9,0};
		System.out.println(" Aranacak sayiyi gir: ");
		int sayi = reader.nextInt();
		boolean varMi =false;
		
		for (int i : sayilar) {
			if (i==sayi) {
				varMi = true;
				break;
			}
		}
		if (varMi==true) {
			mesajVer(sayi+ " Rakamdir. ");
		}else {
			mesajVer(sayi+ " Rakam Değildir. ");
		}
		
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}

}


//Muhammet Bilgin...@mhmmtbilgin