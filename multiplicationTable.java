package day12_13;

import java.util.Scanner;
import java.util.Random;

public class multiplicationTable {
    public static void main(String[] args) throws Exception {
    	Scanner scanner = new Scanner(System.in);
    	Random random = new Random();
    	int money = 10000;
    	System.out.println("게임시작 : 1, 설명 : 2");
    	int gameStart = scanner.nextInt();
    	switch (gameStart) {
		case 1: 
			System.out.println("난이도 선택");
			System.out.println("상 : 1, 하 : 2");
			int gameStage = scanner.nextInt();
			switch (gameStage) {
			case 1:
				while(true) {
					int randomNumber1 = random.nextInt(20);
					int randomNumber2 = random.nextInt(20);
					long start = System.currentTimeMillis();
					System.out.println(randomNumber1 + " X " + randomNumber2 + " =  ?");
					int randomNumber = randomNumber1 * randomNumber2;
					int setNumber = scanner.nextInt();
					long end = System.currentTimeMillis();
					long Times = (end - start)/1000;
					if(Times >= 5) {
						System.out.println("땡!");
						System.out.println(Times + "초가 지났습니다");
						money = money / 2;
						System.out.println("당신의 자산"+ money);
						break;
					}else if(randomNumber == setNumber){
						money = money * 2;
						System.out.println("정답!");
						System.out.println("당신의 자산"+ money);
					}else {
						System.out.println("땡!");
						money = money / 2;
						System.out.println("당신의 자산"+ money);
						break;
					}
					System.out.println("당신의 자산"+ money);
				}
				System.out.println("당신의 자산"+ money);
				break;
			case 2:
				while(true) {
					int randomNumber1 = random.nextInt(10);
					int randomNumber2 = random.nextInt(10);
					long start = System.currentTimeMillis();
					System.out.println(randomNumber1 + " X " + randomNumber2 + " =  ?");
					int randomNumber = randomNumber1 * randomNumber2;
					int setNumber = scanner.nextInt();
					long end = System.currentTimeMillis();
					long Times = (end - start)/1000;
					if(Times >= 3) {
						System.out.println("땡!");
						System.out.println(Times + "초가 지났습니다");
						money = money / 2;
						break;
					}else if(randomNumber == setNumber){
						money = money + 1000;
						System.out.println("정답!");
						System.out.println("당신의 자산"+ money);
					}else {
						System.out.println("땡!");
						money = money / 2;
						break;
					}
			}
			System.out.println("당신의 자산"+ money);
			break;
		}
			break;
		case 2:
			System.out.println("난이도 상은 5초안에 난이도 하는 3초안에 대답하면 성공 대답 못하면 실패입니다. 기초 자금은 10000원이며 난이도에 따라 10의자리 곱셈도 나옵니다.");
			System.out.println("성공시 난이도 하는 상금이 1000원이며 난이도 상은 상금이 2배입니다. 하지만 틀릴시 자금의 절반이 날아갑니다.");
			break;
		}
    }
}