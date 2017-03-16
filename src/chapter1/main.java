package chapter1;

import java.awt.Graphics;
import java.time.format.TextStyle;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Triangle triangle = new Triangle();
//		triangle.display(5);
//		NineNine nn = new NineNine();
//		nn.display();
//		Cos cos = new Cos();
		
		int[] i = new int[2];
		int k = i.length;
		  int A[] = {1,2};
		  String string;
		  string = "abcda";
		  System.out.println(string.indexOf("a"));
//		  System.out.println(lengthOfLongestSubstring("zznieckitkhwynawcgdfjzgmqmrygbaicpqiudqpnylnnoksupzdofphuifcjhk"));
	}

public static int lengthOfLongestSubstring(String s) {
    int result = 0;
    String now = "";
    long count = 0;
    
    for(int i = 0;i < s.length();i++){
        for(int j = i;j < s.length();j++,count++){
            if(now.indexOf(s.charAt(j)) == -1){
                now += s.charAt(j);
                if(now.length() > result){
                	System.out.println(now+j);
                    result = now.length();
                }
            }else{
                    now = "";
            }
        }
        now = "";
    }
    System.out.println(count);
    return result;
}
}
