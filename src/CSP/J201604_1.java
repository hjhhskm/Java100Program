package CSP;

import java.util.Scanner;

public class J201604_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int now,before;
		int rigNum = 0;
		before  = scanner.nextInt();
		boolean ok = false,flag = false;
		for(int i = 1;i < num;i++){
			now = scanner.nextInt();
			if(!ok){
				ok = true;
				flag = ((now-before) > 0);
			}else {
				if((((now-before)>0)==flag)){
				}else{
					rigNum++;
					flag = ((now-before)>0);
				}
			}
			before = now;
		}
		System.out.println(rigNum);
	}

}
