package day12_02;

import java.util.Scanner;

public class exam9 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자?");
		int  num = scanner.nextInt();
		
		String[] animal = {"0따윈 없다.","개","고양이","병아리","도마뱀","까마귀"};
		
		for(int i = 0; i <= animal.length; i++) {
			if(num == 1) {
				System.out.println("개");
			}else if(num == 2) {
				System.out.println("고양이");
			}else if(num == 3) {
				System.out.println("병아리");
			}else if(num == 4) {
				System.out.println("도마뱀");
			}else if(num == 5) {
				System.out.println("까마귀");
			}else {
				System.out.println("그런 숫자에는 동물이 없다!");
			}
			break;
		}

	}
}
