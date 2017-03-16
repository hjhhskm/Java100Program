import java.util.Scanner;

public class CalcIncome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int before = scanner.nextInt();
		double after = before - 3500;
		if(after<=0){
			System.out.println(before);
		}else{
			int[] reList = {45,300,900,6500,6000,8750};
			double[] taxList={0.03,0.1,0.2,0.25,0.30,0.35,0.45};
			int[] incomeList={0,1455,4155,7755,27255,51255,57505,100000};
			double incre = 0;
			int level = 0;
			
			for(int i = 0;i < incomeList.length;i++){
				if(after < incomeList[i]){
					level = i-1;
					break;
				}
			}
			
			incre = after-incomeList[level];
			after += incre/(1-taxList[level]);
			after -=incre;
			for(int i = 0;i < level;i++){
				after +=reList[i];
			}
			System.out.println((int)after+3500);
	}
		
	}

}
