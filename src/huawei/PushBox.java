package huawei;

import java.util.Scanner;

public class PushBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		String lines;
		char[][] Matrix = new char[row][column];
		for(int i = 0;i < row;i++){
			lines = scanner.nextLine();
			for(int j = 0;j < column;j++){
				Matrix[i][j] = lines.charAt(j);
			}
		}
		
		int min;
		
	}
	
	public static boolean push(char[][] mat,int step){
		
		return true;
	}
	
}
