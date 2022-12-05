package day12_02;

import java.util.Scanner;
import java.util.ArrayList;

public class exam3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		ArrayList<Integer> divisor1 = new ArrayList<Integer>();
		ArrayList<Integer> divisor2 = new ArrayList<Integer>();
		ArrayList<Integer> sameDivisor = new ArrayList<Integer>();
		
		for(int i = 1; i <= num1; i++) {
			if((num1 % i) == 0) {
				divisor1.add(i);
			}
		}
		
		for(int j = 1; j <= num2; j++) {
			if((num2 % j) == 0) {
				divisor2.add(j);
			}
		}
		
		 for(Integer a : divisor1) {
	            boolean isEqualsDivisor = false;
	            
	            for(Integer b : divisor2) {
	                if(a.equals(b)) {
	                    isEqualsDivisor = true;
	                }
	            }
	            if(isEqualsDivisor) {
	                sameDivisor.add(a);
	            }
	        } 
		 System.out.println(sameDivisor);
	}
}
