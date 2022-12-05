package day12_02;

import java.util.Scanner;

public class exam7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[][] firstArray = new int[2][3];
		int[][] secondArray =new int[2][3];
		
		int[][] plusArray  = new int[2][3];
		
		System.out.println("한줄로 6가지의 숫자를 쓰세요 EX) 1 2 3");
		for(int i = 0; i < firstArray.length; i++) {
			for(int j = 0; j < firstArray[i].length; j++) {
				 firstArray[i][j] = scanner.nextInt();
				
				System.out.print(firstArray[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("한줄로 6가지의 숫자를 쓰세요 EX) 1 2 3");
		for(int i = 0; i < secondArray.length; i++) {
			for(int j = 0; j < secondArray[i].length; j++) {
				 secondArray[i][j] = scanner.nextInt();
				
				System.out.print(secondArray[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("출력");
		for(int i = 0; i < plusArray.length; i++) {
			for(int j = 0; j < plusArray[i].length; j++) {
				 plusArray[i][j] = firstArray[i][j] * secondArray[i][j];
				
				System.out.print(plusArray[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
