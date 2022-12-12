package youtube2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the first number");
		int number1=new Scanner(System.in).nextInt();
		
		System.out.println("Enter the second number");
		int number2=new Scanner(System.in).nextInt();
		
		DortIslem dortIslem=new DortIslem();
		System.out.println(dortIslem.topla(number1, number2));
		
		
		
		
		
		}

}
