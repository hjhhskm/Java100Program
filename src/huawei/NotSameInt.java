package huawei;

import java.util.Scanner;

public class NotSameInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaneer = new Scanner(System.in);
		String line =scaneer.nextLine();
		boolean[] list = new boolean[10];
		for(int i = 0;i < 10;i++){
			list[i] = false;
		}
		
		int stack;
		String now;
		String result = "";
		for(int i = line.length()-1;i >=0 ;i--){
			now = "";
			now += line.charAt(i);
			stack = Integer.parseInt(now);
			if(list[stack]){
				continue;
			}
			list[Integer.parseInt(now)] = true;
			result +=now;
		}
		System.out.println(result);
	}

}
