package huawei;

import java.awt.Checkbox;
import java.lang.Math;
import java.util.Scanner;

public class Changejinzhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String lines = scanner.nextLine();
		int result = 0;
		for(int i = 0;i < lines.length();i++){
			result += check(lines.charAt(i))*getDex(lines.length() - i);
		}
		System.out.println(result);
	}
	
	public static int getDex(int i){
		int result = 1;
		for(int k = 0;k < i;k++){
			result *= 16;
		}
		return result;
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
		}else if(a == 'a') {
			 return 10;
		}else if(a == 'b'){
			return 11;
		}else if(a == 'c') {
			 return 12;
		}else if(a == 'd') {
			 return 13;
		}else if(a == 'e') {
			 return 14;
		}else if(a == 'f') {
			 return 15;
		}
		
		return -1;
	}
}
