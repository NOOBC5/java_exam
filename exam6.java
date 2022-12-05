package day12_02;

import java.util.Scanner;

public class exam6{

	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
		
			for(int i = 0; i < num; i++) {
				int a = 1;
				for(int j = num; j >= 0; j--) {
					if(i < j) {
						System.out.print(" ");
					}else if(i >= j) {
						System.out.print(a);
						a = a + 1;
					}
				}
				System.out.println(" ");
			}

	}

}
