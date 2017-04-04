package SourceTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import SourceTest.MethodTest.InnerDo2.Inner2;

public class MethodTest {

	static int nodeA = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Child child = new Child();
//		Father father = child;
//		father.getLetter();
//		child.getLetter();
//		Car car = new Car();
//		Auto auto = car;
//		auto.getDrive();
//		car.getDrive();
		
		new Second();
		InnerDo2 a = new InnerDo2();
		int b = new InnerDo2().cont(1).getInner().cont(2).getInner().cont(3).getA();
		Inner2 c = new InnerDo2().new Inner2();
		System.out.println(b);
		System.out.println(c.k);
		System.out.println(new A1().new A2().new A3().getA());
		String array = new String();
		array = "123";
		Stack<Integer> stack = new Stack<>();
		
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i < 10;i++){
			list.add(new Integer((int)(Math.random()*100)));
		}
		Iterator e = list.iterator();
		while(e.hasNext()){
			System.out.println(e.next().toString());
		}
		
		
	}
	
	public static class A1{
		class A2{
			class A3{
				public int getA(){
					return 2;
				}
			}
		}
	}
	
	interface ImpDo2{
		int a1();
		interface Imp2_1{
			int a11();
		}
	}
	
	public static class Conte{
		public int getA() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		public InnerDo2 getInner(){
			return null;}
		
	}
	
	public static class InnerDo2{
		public class Inner2{
			public int k = 1;
		}
		public InnerDo2(){}
		public Conte cont(final int k){
			return new Conte(){
				public int a = k;
				public int getA(){
					return a;
				}
				public InnerDo2 getInner(){
					return new InnerDo2();
				}
			};
		}
	}
	
	public static class ClaDo implements ImpDo2{

			void TestIt(){
				class TestPrint{
					Printit a = new Printit("do fuck");
				}
			}
		@Override
		public int a1() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	interface ImpDo{
		int c();
		int d();
	}
	interface ImpDo1 extends ImpDo{
	
		int e();
	}
	
	public abstract class AbsDo{
		abstract int a();
		abstract int b();
	}
	
	public final class InitDo extends AbsDo implements ImpDo,ImpDo1{
		int a(){
			return 1;
		}
		int b(){
			return 2;
		}
		@Override
		public int c() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public int d() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int e(){
			return 0;
		};
	}
	
	public static class Printit{
		public Printit(String k) {
			// TODO Auto-generated constructor stub
			System.out.println(k+":"+nodeA);
			nodeA++;
		}
	}
	
	public static class First{
		Printit aPrintit =new Printit("First");
		public First() {
			// TODO Auto-generated constructor stub
			Printit aPrintit2 = new Printit("First2");
		}
	}
	
	public static class Second extends First{
		Printit bPrintit = new Printit("Second");
		public Second(){
			// TODO Auto-generated constructor stub
			super();
			Printit bPrintit2 = new Printit("Second2");
		}
	}
	
	public static class This{
		
		int arr[] = new int[20];
		
		public This(int a) {
			arr[0] =a;
		}
		
		public void print(){
			
		}
	}
	
	static public class Father{
		private void getLetter(){
			System.out.println("Letter from father");
		}
	}
	
	static public class Child extends Father{
		public void getLetter(){
			System.out.println("Letter from Child");
		}
	}
	
	static public class Auto{
		private final int a = 0;
		
		public void getDrive() {
			System.out.println("drive auto");
		}
	}
	
	static public class Car extends Auto{
		public void getDrive(){
			System.out.println("drive car");
		}
	}

}
