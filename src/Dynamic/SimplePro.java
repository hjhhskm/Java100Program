package Dynamic;

import java.util.Scanner;

public class SimplePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
		int[][] Matr= new int[lines][lines];
		for(int i = 0;i <lines;i++){
			for(int j = 0;j <= i;j++){
				Matr[i][j] = scanner.nextInt();
			}
		}
		int[] Max = new int[lines];
		for(int i = 0;i < lines;i++){
			Max[i] = Matr[lines-1][i];
		}
		
		for(int i = lines-2;i >=0;i--){
			for(int j = 0;j <= i;j++){
				if((Max[j]+Matr[i][j])>(Max[j+1]+Matr[i][j])){
					Max[j] = Max[j]+Matr[i][j];
				}else {
					Max[j] = Max[j+1]+Matr[i][j];
				}
			}
		}
//		7 3 8 8 1 0 2 7 4 4 4 5 2 6 5
		System.out.println(Max[0]);
		
	}
	
}
