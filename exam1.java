package day12_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class exam1 {
	public static int[] stack  = null;
	public static int size = 0;
	
	public static int empty() {
		if(size == 0){
			return 1;
		}else {
			return 0;
		}
	}
	
	public static void push(int x) {
		stack[size] = x;
		size++;
	}
	
	public static int pop() {
		if(empty() == 1) {
			return -1;
		}else {
			size--;
			return stack[size];
		}
	}
	
	public static int top() {
		if(empty() == 1) {
			return -1;
		}else {
			return stack[size - 1];
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		stack = new int[n];
		
		while(n-- >0) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			String inst = st.nextToken();
			
			switch (inst) {
			case "i":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "o":
				bw.write(String.valueOf(pop()) + "\n");
				break;
			case "c":
				bw.write(String.valueOf(size) + "\n");
				break;
			case "top":
				bw.write(String.valueOf(top()) + "\n");
				break;
			case "empty":
				bw.write(String.valueOf(empty()) + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}

}
