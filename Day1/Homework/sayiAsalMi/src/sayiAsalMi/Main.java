package sayiAsalMi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
			
		
		int kalan=0;
		int sayac=0;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Bir sayi gir:");
		int sayi=reader.nextInt();	
		for (int i = 1; i <= sayi; i++) {
			
			kalan =sayi % i;
			
			if (kalan == 0) {
				sayac++;
			}
			
			
		}
		if (sayac==2) {
			System.out.println(sayi +" Sayısı Asaldır.");
			
		}else if (sayi==1) {
			System.out.println(sayi +" Sayısı Asaldır.");
			
		}else if (sayi < 0) {
			System.out.println(sayi +" Sayı Negatif Olamaz.");
		} 
		
		else {
			System.out.println(sayi +" Sayısı Asal Değildir.");
		}
		
		
		}

	}


