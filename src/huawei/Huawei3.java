package huawei;

import java.util.Scanner;
import java.util.Stack;

public class Huawei3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string;
		string = scanner.nextLine();
		
		
		System.out.println(postfixCalc(string));
	}
	
	public static int postfixCalc(String string){
		Stack<Integer> stack = new Stack<>();
		char now;
		int a,b;
		int result = 0;
		Integer cal;
		for(int i = 0;i < string.length();i++){
			now = string.charAt(i);
			cal = check(now);
			if(cal == -1){
				b = stack.pop();
				a = stack.pop();
				if(now =='+'){
					result =a+b;
					stack.push(result);
				}else if(now == '-'){
					result =a-b;
					stack.push(result);
				}else if(now == '*'){
					result =a*b;
					stack.push(result);
				}
			}else{
				stack.push(cal);
			}
			
		}
		return stack.pop();
	}
	public static int check(char a){
		if(a == '0'){
			return 0;
		}else if(a == '1'){
			return 1;
		}else if(a == '2'){
			return 2;
		}else if(a == '3'){
			return 3;
		}else if(a == '4') {
			 return 4;
		}else if(a == '5') {
			 return 5;
		}else if(a == '6') {
			 return 6;
		}else if(a == '7') {
			 return 7;
		}else if(a == '8') {
			 return 8;
		}else if(a == '9') {
			 return 9;
		}else if(a == 'A') {
			 return 10;
		}else if(a == 'B'){
			return 11;
		}else if(a == 'C') {
			 return 12;
		}else if(a == 'D') {
			 return 13;
		}else if(a == 'E') {
			 return 14;
		}else if(a == 'F') {
			 return 15;
		}
		
		return -1;
	}

}
