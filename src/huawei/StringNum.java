package huawei;

import java.util.Scanner;

public class StringNum {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String result = "";
		int num = 1;
		char nowC = input.charAt(0);
		for(int i = 1;i < input.length();i++){
			if(input.charAt(i) == nowC){
				num++;
			}else{
				result +=Integer.toString(num);
				result +=nowC;
				num = 1;
				nowC = input.charAt(i);
			}
		}
		if(input.length() > 0){
			result +=Integer.toString(num);
			result +=nowC;
		}
		System.out.println(result);
		
	}

}
