
import java.util.Scanner;

public class FindMid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int nums[] = new int[length];
		for(int i = 0;i < length;i++){
			nums[i] = scanner.nextInt();
		}
		getInsertSort(nums);
		int times = 0,mid = nums[length/2];
		for(int i : nums){
			if(i == mid){
				times++;
			}
		}
		if(length%2 == times%2){
			System.out.println(mid);
		}else{
			System.out.println("-1");
		}	
	}

	public static void getInsertSort(int[] nums){
		for(int i = 1;i < nums.length;i++){
			for(int j = 0;j < i;j++){
				if(nums[i] < nums[j]){
					insertTo(nums,j,i);
				}
			}
		}
	}
		
	public static void insertTo(int[] nums,int doPos,int endPos){
		int stack = nums[endPos];
		for(int i = endPos;i > doPos;i--){
			nums[i] = nums[i-1];
		}
		nums[doPos] = stack;
	}
}
