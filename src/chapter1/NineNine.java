package chapter1;

public class NineNine {
	public void display(){
		for(int i = 1;i <= 9;i++){
			for(int j = 1;j <=i;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");	
			}
			System.out.println();
		}
	}
}
