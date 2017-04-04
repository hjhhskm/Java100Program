package Dynamic;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class AlibabaTest {

	/*请完成下面这个函数，实现题目要求的功能*/
	/*当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ */
	/******************************开始写代码******************************/
	public static boolean partition(int[] n){
		int sum = 0;
		LinkedList<Integer> list = new LinkedList<>();
		for(int i : n){
			sum +=i;
			list.add(i);
		}
		if(sum%2 != 0){
			return false;
		}
	
		
		Stack<Integer> stack = new Stack<>();
		
		int half = sum/2;
		
		int firstAdd = -1;
		boolean hasAdd = false;
		int now = 0,doNow = 0,result = 0;
		while(firstAdd != list.get(0)){
			now = list.poll();
			if(result+now <half){
				result+=n[now];
				stack.push(now);
			}else if(result+now == half){
				return true;
			}else{
				for(int k : stack){
					if(result-k+now == half){
						return true;
					}else{
						if(!hasAdd){
							firstAdd = stack.pop();
							list.addLast(firstAdd);
						}else{
							list.addLast(stack.pop());
						}
						
					}
				}
			}
		}
	     return  false;
	}

	/******************************结束写代码******************************/


	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        String[]  input = in.nextLine().split(",");
	        int[] n = new int[input.length];
	        for(int i = 0;i < input.length;i++){
	        	n[i] = Integer.parseInt(input[i]);
	        }

	        boolean  result =  partition (n);
	        System.out.println(result);    

	    }
}

