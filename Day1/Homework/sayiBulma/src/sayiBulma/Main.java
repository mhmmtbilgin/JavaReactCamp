package sayiBulma;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int[] sayilar= new int[]{1,2,3,5,6,7,8,9,0};
		System.out.println(" Aranacak sayıyı gir: ");
		int sayi = reader.nextInt();
		boolean varMi =false;
		
		for (int i : sayilar) {
			if (i==sayi) {
				varMi = true;
				break;
			}
		}
		if (varMi==true) {
			System.out.println(sayi+ " Rakamdır. ");
		}else {
			System.out.println(sayi+ " Rakam Değildir. ");
		}
	}

}
