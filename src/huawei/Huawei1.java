package huawei;

import java.util.Scanner;

public class Huawei1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String lines = scanner.nextLine();
		StringBuffer result = new StringBuffer();
		for(int i = 0;i < lines.length();i++){
			char now = lines.charAt(i);
			if(now>=65&&now<=90){
				now +=32;
				result.append(now);
			}else if(now>=97&&now<=122){
				result.append(now);
			}
		}
		System.out.println(result.toString());
	}

}
