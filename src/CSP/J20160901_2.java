package CSP;

import java.util.Scanner;

public class J20160901_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] ticket = new boolean[100];
		int[] nums = new int[20];
		for(int i = 0;i < 100;i++){
			ticket[i] = false;
		}
		for(int i = 0;i < 20;i++){
			nums[i] = 5;
		}
		
		Scanner scanner = new Scanner(System.in);
		int con = scanner.nextInt();
		int[] command = new int[con];
		
		for(int i = 0;i < con;i++){
			command[i] = scanner.nextInt();
		}
		
		for(int i = 0;i < con;i++){
			if(checkTicket(ticket, nums, command[i])){
				forceTicket(ticket, nums, command[i]);
			}
			System.out.println();
		}
	}
	
	public static boolean checkTicket(boolean[] ticket,int[] nums,int getNum){
		boolean soft = true;
		for(int i = 0;i < nums.length;i++){
			if(nums[i] >= getNum){
				for(int j = 0;j < getNum;j++){
					ticket[(i*5)+5-nums[i]+j] = true;
					System.out.print(((i*5)+5-nums[i]+j+1)+" ");
				}
				nums[i] -=getNum;
				soft = false;
				break;
			}
		}
		return soft;
	}
	
	public static void forceTicket(boolean[] ticket,int[] nums,int getNum){
		int fullReq = getNum;
		for(int i = 0;i < nums.length;i++){
			if(fullReq == 0){
				break;
			}
			if(nums[i]!=0){
				if(nums[i] >= fullReq){
					for(int j = 0;j < fullReq;j++){
					ticket[(i*5)+5-nums[i]+j] = true;
					System.out.print(((i*5)+5-nums[i]+j+1)+" ");
				}
					nums[i] -= fullReq;
				}else{
					for(int j = 0;j < nums[i];j++){
						ticket[(i*5)+5-nums[i]+j] = true;
						System.out.print(((i*5)+5-nums[i]+j+1)+" ");
					}
					fullReq -= nums[i];
					nums[i] = 0;
				}
			}
		}
	}

}
