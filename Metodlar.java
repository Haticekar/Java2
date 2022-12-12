package youtube2;

import java.util.Scanner;

public class Metodlar {

	public static void main(String[] args) {
		sayiBulmaca();
		
		
		
	}
	public static void sayiBulmaca() {
		int[] sayilar=new int[] {1,2,3,4,5,6,};
		System.out.println("Enter the found number: ");
		int aranacak=new Scanner(System.in).nextInt();
		boolean varMi=false;
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
				
			}
		}
		if(varMi) {
			mesajVer("Sayi mevcuttur " +aranacak);
		}else {
			mesajVer("Sayi mevcut değildir. " +aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}

}
