package day12_02;
import java.util.Arrays;
import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("100보다 크거나 500보다 작은 수를 3개 적으세요.");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();

		
		if(number1 > 100 && number1 < 500 && number2 > 100 && number2 < 500 && number3 > 100 && number3 < 500) {
			int multiplication = number1 * number2 * number3;
			
			String str = Integer.toString(multiplication);
			
			char[] charMu = str.toCharArray();
			
			for(int z = 0; z < charMu.length; z++) {
				
				if(charMu[z] == '0') {
					a = a + 1;
				}else if(charMu[z] == '1') {
					b = b + 1;
				}else if(charMu[z] == '2') {
					c = c + 1;
				}else if(charMu[z] == '3') {
					d = d + 1;
				}else if(charMu[z] == '4') {
					e = e + 1;
				}else if(charMu[z] == '5') {
					f = f + 1;
				}else if(charMu[z] == '6') {
					g = g + 1;
				}else if(charMu[z] == '7') {
					h = h + 1;
				}else if(charMu[z] == '8') {
					i = i + 1;
				}else if(charMu[z] == '9') {
					j = j + 1;
				}
			}
			System.out.println(str);
			System.out.println("0의 개수: "+a);
			System.out.println("1의 개수: "+b);
			System.out.println("2의 개수: "+c);
			System.out.println("3의 개수: "+d);
			System.out.println("4의 개수: "+e);
			System.out.println("5의 개수: "+f);
			System.out.println("6의 개수: "+g);
			System.out.println("7의 개수: "+h);
			System.out.println("8의 개수: "+i);
			System.out.println("9의 개수: "+j);
		
		}else {
			System.out.println("입력한 값이 100이하 또는 500보다 큽니다.");
		}
		
	}

}
