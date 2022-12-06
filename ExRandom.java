package day12_06;

import java.util.Random;
import java.util.Scanner;

public class ExRandom {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("게임 난이도를 선택하세요. 1: hard, 2: easy, 3:설명");
		int gameStage = scanner.nextInt();
		if(gameStage == 1) {
			System.out.println("시도할 횟수를 적으세요.");
			int num = scanner.nextInt();
			
			String[] arr = new String[num];
			
			int i = 10;
			int j = 10000000;
			for(int a = 0; a < arr.length; a++){
				System.out.println("점수를 적으세요 ex) 2 3");
				Random random = new Random();
				int randomNumber1 = random.nextInt(i);
				int randomNumber2 = random.nextInt(i);
				// 0 0~ 10 10 100
				for(int b = 0; b < 10; b++) {
					int number1 = scanner.nextInt();
					int number2 = scanner.nextInt();
					
					if(randomNumber1 == number1 && randomNumber2 == number2) {
						System.out.println("맞췄습니다!");
						j = j * 5;
						break;
					}else if(randomNumber1 != number1 && randomNumber2 == number2 || randomNumber1 == number1 && randomNumber2 != number2) {
						System.out.println("하나만 틀렸습니다!");
						j = j * 1;
					}else if(randomNumber1 != number1 && randomNumber2 != number2 || randomNumber1 != number1 && randomNumber2 != number2){
						System.out.println("둘다 틀렸습니다.");
						j = j / 2;
					}else {
						System.out.println("숫자가 0~10을 넘어갔습니다.");
						break;
					}
				}
				if(j < 1 ) {
					System.out.println(j+"원 남으셨습니다.");
					System.out.println("파산하셨습니다.");
					break;
				}
					System.out.println("정답은 " + randomNumber1 + " : " + randomNumber2 + "이거 였습니다!");
					System.out.println(j);
			}
			
		}
		
		
		if(gameStage == 2) {
		System.out.println("시도할 횟수를 적으세요.");
		int num = scanner.nextInt();
		
		String[] arr = new String[num];
		
		int i = 10;
		int j = 100000;
		
		System.out.println("1팀이 점수가 높다: 1, 2팀이 점수가 높다: 2, 동점이다: 3");
		for(int a = 0; a < arr.length; a++) {
			Random random1 = new Random();
			int randomNumber1 = random1.nextInt(i);
			
			Random random2 = new Random();
			int rancomnumber2 = random2.nextInt(i);
			
			int number = scanner.nextInt();
		if(number == 1) {
			if(randomNumber1 > rancomnumber2) {
				j = j * 2;
			}else if(randomNumber1 == rancomnumber2) {
				j = j / 2;
			}else {
				j = j / 2;
			}
		}else if(number == 2) {
			if(randomNumber1 < rancomnumber2) {
				j = j * 2;
			}else if(randomNumber1 == rancomnumber2) {
				j = j / 2;
			}else {
				j = j / 2;
			}
		}else if(number == 3) {
			if(randomNumber1 > rancomnumber2) {
				j = j / 2;
			}else if(randomNumber1 == rancomnumber2) {
				j = j * 2;
			}else {
				j = j / 2;
			}
		}else {
			System.out.println("1, 2, 3 중에서 고르세요.");
			break;
		}
		
		if(j < 1 ) {
			System.out.println(j+"원 남으셨습니다.");
			System.out.println("파산하셨습니다.");
			break;
		}
		System.out.println(randomNumber1 +" : "+ rancomnumber2);
		System.out.println(j);
		}
		}
		if(gameStage == 3) {
			System.out.println("게임 난이도 easy는 알아서 더 높은 점수일 것같은 팀만 맞추면 됩니다.");
			System.out.println("게임 난이도 hard는 본인이 점수와 누가 이길 것같은지 까지 맞춰야합니다. 대신 hard모드에선 10번의 기회가 생깁니다.");
			System.out.println("모든난이도 공통으로 점수는 0점부터 10점까지 있으며 파산하면 그 즉시 게임이 끝납니다 또한 다른 선택지를 고를 경우에도 게임이 끝납니다.");
			System.out.println("easy모드는 돈을 기본적으로 100,000원을 드리며 맞추면 2배, 완전 틀리면 가진돈에 50%를 잃고 점수가 동점인경우에도 50%를 잃습니다.");
			System.out.println("hard모드는 맞추기 어려운 대신 기본돈 10,000,000원 맞추면 5배 하나라도 맞추면 손해는 없고 전부 다 틀리면 50%를 잃습니다.");
		}if(gameStage != 1 && gameStage != 2 && gameStage != 3) {
			System.out.println("다른 숫자를 선택하였습니다.");
		}
	}
}
