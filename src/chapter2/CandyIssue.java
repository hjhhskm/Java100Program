package chapter2;

public class CandyIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] child = {10, 2, 8, 22, 16, 4, 10, 6, 14, 20};
		System.out.println("一共需要："+issue(child,0));
	}

	public static int issue(int[] child, int nums) {
		boolean isEqual = true;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("第"+(i+1)+"孩:"+child[i]+" ");
		}
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			if (child[i] != child[i - 1]) {
				isEqual = false;
				break;
			}
		}
		if (isEqual) {
			return nums;
		} else {
			int sa = 0, sb = 0;
			boolean child0 = false;
			for (int i = 0;i < 10;i++) {
				sa = child[i]/2;
				child[i] = child[i] - sa + sb;
				if (child[i] % 2 != 0) {
					if(i == 0){
						child0 = true;
					}
					child[i] += 1;
				}
				sb = sa;
			}
			if(child0){
				child[0] += sb -1;
			}else{
				child[0] +=sb;
			}
			if(child[0]%2!=0){
				child[0]+=1;
			}
			return issue(child, nums + 1);
		}
	}
}
