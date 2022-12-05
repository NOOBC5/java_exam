package day12_02;

import java.util.Scanner;

public class exam8 {
	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		int array[] = new int[10];
		for(int z = 0; z < array.length; z++) {
			array[z] = scanner.nextInt();
			
			if(array[z] > 100) {
				System.out.println("이 점수는 없습니다.");
			}else if(array[z] == 100) {
				a = a + 1;
			}else if(array[z] <= 99 && array[z] >= 90) {
				b = b + 1;
			}else if(array[z] <= 89 && array[z] >= 80) {
				c = c + 1;
			}else if(array[z] <= 79 && array[z] >= 70) {
				d = d + 1;
			}else if(array[z] <= 69 && array[z] >= 60) {
				e = e + 1;
			}else if(array[z] <= 59 && array[z] >= 50) {
				f = f + 1;
			}else if(array[z] <= 49 && array[z] >= 40) {
				g = g + 1;
			}else if(array[z] <= 39 && array[z] >= 30) {
				h = h + 1;
			}else if(array[z] <= 29 && array[z] >= 20) {
				i = i + 1;
			}else if(array[z] <= 19 && array[z] >= 1) {
				j = j + 1;
			}else {
				System.out.println("와! 0점");
			}
		}
		if( a > 0) {
		System.out.println("100 : "+a+"명");
		}
		if( b > 0) {
		System.out.println("90 : "+b+"명");
		}
		if( c > 0) {
		System.out.println("80 : "+c+"명");
		}
		if( d > 0) {
		System.out.println("70 : "+d+"명");
		}
		if( e > 0) {
		System.out.println("60 : "+e+"명");
		}
		if( f > 0) {
		System.out.println("50 : "+f+"명");
		}
		if( g > 0) {
		System.out.println("40 : "+g+"명");
		}
		if( h > 0) {
		System.out.println("30 : "+h+"명");
		}
		if( i > 0) {
		System.out.println("20 : "+i+"명");
		}
		if( j > 0) {
		System.out.println("10 : "+j+"명");
		}
	}
}
