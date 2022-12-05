package day12_02;

import java.util.Scanner;

public class exam10 {
		public static void main(String[] args) {
			int array[] = new int[10];
			
			int a = 1;
		    int b = 0;
		    
			for(int i = 0; i < array.length; i++) {
			    Scanner scanner = new Scanner(System.in);
			    array[i] = scanner.nextInt();
			    
			    if(array[i] == 1) {
			    	a = a + 1;
			    	System.out.println("현재 층 수 : "+a+"층 "+"인원 수"+ b+"명");
			    }else if(array[i] == 2) {
			    	a = a - 1;
			    	System.out.println("현재 층 수 : "+a+"층 "+"인원 수"+ b+"명");
			    }else if(array[i] == 3) {
			    	b = b + 1;
			    	System.out.println("현재 층 수 : "+a+"층 "+"인원 수"+ b+"명");
			    }else if(array[i] == 4) {
			    	b = b - 1;
			    	System.out.println("현재 층 수 : "+a+"층 "+"인원 수"+ b+"명");
			    }else {
			    	System.out.println("1, 2, 3, 4중에 선택 하십시오.");
			    	break;
			    }
			}
		}
}
