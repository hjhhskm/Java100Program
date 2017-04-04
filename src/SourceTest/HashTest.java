 package SourceTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HashTest {
	public static void main(String[] args){
		HashMap<Integer, String> good = new HashMap<>();
		good.put(0, "litao");
		good.put(1, "cuijianghui");
		good.put(0, "wangbiaoyu");
		String aString = good.get(0);
		System.out.println(aString);
		System.out.println(good.size());
		
		HashSet<String> bad = new HashSet<>();
		bad.add("how");
		bad.add("what");
		try {
			bad.add("how");
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(bad);
	}
}
