package huawei;

import java.util.Scanner;
import java.lang.Math;

public class FindZhishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		long a = Long.parseLong(string);
		while(a!=1){
			for(int i = 2;i <= a;i++){
				if(a%i == 0){
					a = a/i;
					System.out.print(i+" ");
					break;
				}
			}
		}
	}

}
