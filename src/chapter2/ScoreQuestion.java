package chapter2;

import java.util.Scanner;

public class ScoreQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入选手姓名");
		String name = scanner.nextLine();
		doCompare(name);
	}

	public static void doCompare(String name) {
		int[] nums = new int[10];
		int k = 1;
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 100);
			System.out.println("评委" + k + "打分为:\t" + nums[i]);
			k++;
		}

		int high = 0, low = 100;
		int highNum, lowNum;
		float ave = 0;
		for (int score : nums) {
			if (score > high) {
				high = score;
			} else if (score < low) {
				low = score;
			} else {
				ave += score;
			}
		}
		ave = ave / 8;
		System.out.println("去掉一个最高分:\t" + high + "分");
		System.out.println("去掉一个最低分:\t" + low + "分");
		System.out.println(name + "平均得分为:\t" + ave + "分");
	}

}
