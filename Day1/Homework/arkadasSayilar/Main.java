package arkadasSayilar;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println( " Birinci Sayıyı gir: ");
		int birinciSayi= reader.nextInt();
		System.out.println( " İkinci Sayıyı gir: ");
		int ikinciSayi= reader.nextInt();
		int birinciToplam=0;
		int ikinciToplam=0;
		for (int i = 1; i <birinciSayi; i++) {
			if (birinciSayi % i == 0) {
				
				birinciToplam +=i;
				
			}
			
		}for (int j = 1; j <ikinciSayi; j++) {
			if (ikinciSayi % j == 0) {
				
				ikinciToplam +=j;
				
			}
			
		}
		if (birinciToplam == ikinciSayi && ikinciToplam == birinciSayi) {
			
			System.out.println(birinciSayi+" = " +ikinciSayi + " Arkadaş Sayılardır. ");
			
		}else {
			System.out.println(birinciSayi+" != " +ikinciSayi + " Arkadaş Sayı Değildirler. ");
		}
	}

}


//Muhammet Bilgin.....@mhmmtbilgin