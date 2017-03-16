package chapter2;

import java.util.Scanner;

public class TaxCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的每月税前收入");
		double income = scanner.nextDouble();
		calTax(income);
	}
	
	public static void calTax(double income){
		int[] taxNum = {0,500,2000 ,5000,20000,40000,60000,80000,100000};
		int[] percent = {5,10,15,20,25,30,35,40,45};
		double[] subList = new double[9];
		int level = 0;
		subList[0] = 0;
		for(int i = 1;i < 9;i++){
			subList[i] = ((double)(percent[i] - percent[i-1])/100)*taxNum[i]+subList[i-1];
			System.out.println(subList[i]);
		}
		for(;level < 9;level++){
			System.out.println((income-3500)<taxNum[level]);
			if((income-3500)<taxNum[level]){
				break;
			}
		}
		double tax = 0;
		System.out.println("应缴个人所得税为"+tax);
		System.out.println("实际收入为："+(income-(income-3500)*(percent[level]/100)-subList[level]));
	}

}
