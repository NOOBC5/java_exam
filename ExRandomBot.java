package day12_06;

import java.util.Random;
import java.util.Scanner;

public class ExRandomBot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 3;
		Random random = new Random();
		int j = 0;
		
		for(int i = 0; i < 30; i++) {
				if(j < 31) {
					int num = scanner.nextInt();
					
					if(num <= 3) {
					j = j + num;
					System.out.println("내가 입력한값"+  num);
				}else {
					System.out.println("1, 2, 3에서 선택하세요.");
				}
			}else {
				System.out.println("사람의 승리!");
				break;
			}
				
				if(j < 31) {
					int randomNumber1 = random.nextInt(a)+1;
					
					if(randomNumber1 <= 3) {
						j = j + randomNumber1;
						System.out.println("봇이 입력한값"+  randomNumber1);
						}
					System.out.println("합산" + j);
				}else {
					System.out.println("봇의 승리!");
					break;
				}
		}
	}
}
