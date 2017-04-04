package Dynamic;

import java.util.ArrayList;

public class Tencent2016_2 {

	    public int getValue(int[] gifts, int n) {
	        // write code here
	    	if(n == 1){
	    		return gifts[0];
	    	}else if(n == 2){
	    		if(gifts[0] == gifts[1]){
	    			return gifts[0];
	    		}else{
	    			return 0;
	    		}
	    	}
	    	
	    	ArrayList<Integer> list = new ArrayList<>();
	    	for(int k : gifts){
	    		list.add(k);
	    	}
	    	int result = -1;
	    	boolean doRm;
	    	while(list.size()==1){
	    		int now = list.get(0);
	    		int another;
	    		doRm = false;
	    		for(int i = 1;i < list.size();i++){
	    			another = list.get(i);
	    			if(now != another){
	    				list.remove(0);
	    				list.remove(i);
	    				doRm = true;
	    			}
	    		}
	    		if(!doRm){
	    			break;
	    		}
	    	}
	    	result = list.get(0);
	    	int num = 0;
	    	for(int k : gifts){
	    		if(num == k){
	    			num++;
	    		}
	    	}
	    	if(num > (n/2)){
	    		return result;
	    	}else{
	    		return 0;
	    	}
	    	
	    }
}
