package chapter1;

public class Triangle {
	public void display(int lines){
		int i,j;
		for(i = 1;i <= lines;i++){
			for(j = 0;j < lines-i;j++){
				System.out.print("  ");	
			}
			System.out.print("⭐️");
			for(j = 1;j <i;j++){
				System.out.print("⭐️⭐️");	
			}
			System.out.println();
		}
	}
}
