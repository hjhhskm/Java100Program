package Dynamic;

public class Tencent2016_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] kStrings = getGray(8);
		for(String s : kStrings){
			System.out.println(s);
		}
	}
	    public static String[] getGray(int n) {
	        // write code here
	    	if(n == 1){
	    		return new String[]{"0","1"};
	    	}else{
	    		String[] now = getGray(n-1);
	    		boolean flag = false;
	    		String[] result = new String[(now.length*2)]; 
	    		for(int i = 0;i < now.length;i++){
	    			result[i*2] = new String();
    				result[((i*2)+1)] = new String();
	    			if(flag){
	    				result[i*2] +=now[i]+"0";
	    				result[((i*2)+1)] +=now[i]+"1";
	    			}else{
	    				result[i*2] +=now[i]+"1";
	    				result[((i*2)+1)] +=now[i]+"0";
	    			}
	    			flag = !flag;
	    		}
	    		return result;
	    	}
	    	
	    }

}
