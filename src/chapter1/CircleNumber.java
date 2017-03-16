package chapter1;

import java.util.Scanner;

public class CircleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int next = scanner.nextInt();
		printCircle(next);
	}

	public static void printCircle(int num){
		int[][] a = new int[num][num];
		
		int i = 0,j = 0;
		int dir = 0,now = 0,max = num;
		boolean iseven = true;
		for(int size = 1;size<=num*num;size++){
			a[i][j]=size;
			now++;
			if(now >= max){
				dir = (dir+1)%4;
				now = 0;
				if(iseven){
					max = max - 1;
					iseven = false;
				}else{
					iseven = true;
				}
			}
			switch(dir){
			case 0:
				j++;	//left
				break;
			case 1:
				i++;	//down
				break;
			case 2:
				j--;	//right
				break;
			case 3:
				i--;		//up
				break;
			default:
				System.out.println("fuck error");
				break;
			}
		}
		System.out.println("come on here");
		for(int col = 0;col< num;col++){
			for(int rem = 0;rem < num;rem++){
				System.out.print(a[col][rem]+"\t");
			}
			System.out.println();
		}
	}

}
