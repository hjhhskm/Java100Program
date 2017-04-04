package huawei;

import java.util.Scanner;

public class Huawei2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] list = new int[5];
		for(int i = 0;i < 5;i++){
			list[i] = 0;
		}
		StringBuffer lines = new StringBuffer();
		boolean flag = true;
		while(scanner.hasNext()){
			lines.append(scanner.nextLine());
			lines.append(" ");
		}
		String[] line = lines.toString().split(" ");
		for(int j = 0;j < line.length;j++){
			
			for(int i = 0;i < 5;i++){
				if(line[j].charAt(i)=='1'){
					list[i]+=1;
				}
			}
		}
		int k = list[0];
		for(int i = 1;i < list.length;i++){
			if(list[i] < k){
				k = list[i];
			}
		}
		
		System.out.println(k);
		
	}

}
