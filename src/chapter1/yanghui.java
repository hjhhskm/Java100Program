package chapter1;

import java.util.Scanner;

public class yanghui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
		printRec(lines);

	}

	public static void printRec(int line) {
		int lines = line + 1;
		int a[][] = new int[lines][lines];
		for (int i = 0; i < lines; i++) {
			a[i] = new int[lines];
			for (int j = 0; j < lines; j++) {
				a[i][j] = 0;
			}
		}
		// System.out.println(a[0].length);
		for (int total = 0; total < lines; total++) {
			for (int nowline = 0; nowline < total; nowline++) {
				if (nowline == 0 || nowline == total) {
					a[total][nowline] = 1;
				} else {
					a[total][nowline] = a[total - 1][nowline - 1] + a[total - 1][nowline];
				}
			}
		}

		// print
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < lines; i++) {
			int k = i;
			while ((lines - k) / 2 > 0) {
				System.out.print("  ");
				k++;
			}
			for (int j = 0; j < i; j++) {
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}
	}
}
