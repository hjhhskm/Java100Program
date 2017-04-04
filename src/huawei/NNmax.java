package huawei;

import java.util.Scanner;

public class NNmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
		int length = scanner.nextInt();
		int[][] Matri = new int[lines][lines];
		for(int i = 0;i < lines;i++){
			for(int j = 0;j < lines;j++){
				Matri[i][j] = scanner.nextInt();
			}
		}
		int maxSum = Matri[0][0];
		int nowSum = 0;
		boolean hor,ver,x;
		for(int i = 0;i < lines;i++){
			ver = ((lines - i) >= length);
			for(int j = 0;j < lines;j++){
				hor = ((lines - j) >= length);
				x = hor&&ver;
				
				if(hor){
					nowSum = 0;
					for(int a = j;a < j+length;a++){
						nowSum +=Matri[i][a];
					}
					if(nowSum > maxSum){
						maxSum = nowSum;
					}
				}
				if(ver){
					nowSum = 0;
					for(int a = i;a < i+length;a++){
						nowSum +=Matri[a][j];
					}
					if(nowSum > maxSum){
						maxSum = nowSum;
					}
				}
				if(x){
					nowSum = 0;
					for(int a = 0;a < length;a++){
						nowSum +=Matri[i+a][j+a];
					}
					if(nowSum > maxSum){
						maxSum = nowSum;
					}
				}
				
			}
		}
		
		System.out.println(maxSum);
		
	}


}
