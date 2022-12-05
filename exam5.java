package day12_02;

import java.util.Scanner;

public class exam5{

	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			int star = scanner.nextInt();
		
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < star; j++) {
				if(i <= j) {
					System.out.print("*");
				}else if(i > j) {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
			
		}

	}

}
