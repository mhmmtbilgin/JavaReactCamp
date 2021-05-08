package mukemmelSayi;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int bolenlerToplamı=0;
		System.out.println("Mükemmelliğini sorgulayacağınız bir sayı giriniz: ");
		int mukemmelSayi=reader.nextInt();
		for (int i = 1; i <mukemmelSayi; i++) {
			if (mukemmelSayi % i == 0) {
				
				bolenlerToplamı +=i;
				
			}
			
		}
		if (mukemmelSayi==bolenlerToplamı) {
			System.out.println(mukemmelSayi +" Sayısı Mükemmel Sayıdır... ");
		}else {
			System.out.println(mukemmelSayi +" Sayısı Mükemmel Sayı Değildir... ");
		}
		
		
	}

}
