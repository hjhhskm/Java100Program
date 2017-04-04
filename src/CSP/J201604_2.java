package CSP;

import java.util.Scanner;

public class J201604_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean[][] Matr = new boolean[15][10];
		int n;
		for(int i = 0;i < 15;i++){
			for(int j = 0;j < 10;j++){
				n = scanner.nextInt();
				Matr[i][j] = (n == 1);
			}
		}
		
		boolean[][] shade = new boolean[4][4];
		for(int i = 0;i < 4;i++){
			for(int j = 0;j < 4;j++){
				n = scanner.nextInt();
				shade[i][j] = (n==1);
			}
		}
		
		int ignore = 0;
		boolean flag;
		for(int i = 0;i < 4;i++){
			flag = false;
			for(int j = 0;j < 4;j++){
				if(shade[j][i] == true){
					flag = true;
					break;
				}
			}
			if(flag){
				ignore++;
			}else {
				break;
			}
		}
		
		
		
		int prima = scanner.nextInt();
		
		for(int i = prima;i < 10;i++){
			
		}
	}

}
