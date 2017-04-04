package CSP;

import java.util.Scanner;

public class J20160901_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] list = new int[num];
		for(int i = 0;i < num;i++){
			list[i] = scanner.nextInt();
		}
		
		int min = 0;
		int now;
		for(int i = 0;i < num-1;i++){
			if(list[i+1]-list[i] > 0){
				now = list[i+1]-list[i];
			}else{
				now = list[i]-list[i+1];
			}
			if(now > min){
				min = now;
			}
		}
		System.out.println(min);
	}

}
