package CSP;

import java.util.Scanner;

public class Fuckit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nums = scanner.nextInt();
		int[] list = new int[nums];
		
		int ready;
		int max = 0,min = 2147483647;
		int maxNum = 0,minNum = 0;
		for(int i = 0;i < nums;i++){
			ready = scanner.nextInt();
			if(ready >= max){
				if(ready == max){
					maxNum++;
				}else{
					max = ready;
				}
			}else if(ready <= min){
				if(ready == min){
					minNum++;
				}else{
					min = ready;
				}
			}
			
			System.out.println();
		}
	
	
	}

}
