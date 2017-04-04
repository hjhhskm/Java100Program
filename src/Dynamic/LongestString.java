package Dynamic;

import java.util.Scanner;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int row,column;
//		String rowString = scanner.nextLine();
		String rowString = "xyxxzxyzxy";
		
//		String colString = scanner.nextLine();
		String colString = "zxzyyzxxyxxz";
		row = rowString.length();
		column = colString.length();
		int[][] Mart = new int[2][column+1];
		for(int i = 0;i < column+1;i++){
			Mart[0][i] = 0;
		}
		Mart[1][0] = 0;
		StringBuilder sb = new StringBuilder();
		int k = 1;
		char now = ' ';
		for(int j = 0;j < row;j++){
			for(int i = 1;i < column+1;i++){
					if(rowString.charAt(j) == colString.charAt(i-1)){
						Mart[k][i] = Mart[((k+1)%2)][i-1] + 1;
						now = rowString.charAt(j);
						sb.append(now);
					}else{
						Mart[k][i] = max(Mart[((k+1)%2)][i],Mart[k][i-1]);
					}
			}
			k =((k+1)%2);
		}
		System.out.println(sb);
		System.out.println(Mart[((k+1)%2)][column]);
//		xyxxzxyzxy
//		zxzyyzxxyxxz
	}
	
	public static int max(int a,int b){
		return a>b?a:b;
	}

}
