package reCapDemo_Classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Birinci Sayiyi gir : ");
		int sayi1 = reader.nextInt();
		System.out.println("Ikinci Sayiyi gir : ");
		int sayi2 = reader.nextInt();

		DortIslem dortIslem = new DortIslem();
		dortIslem.topla(sayi1, sayi2);
		dortIslem.cikar(sayi1, sayi2);
		dortIslem.bol(sayi1, sayi2);
		dortIslem.carp(sayi1, sayi2);

	}

}
//Muhammet Bilgin...@mhmmtbilgin