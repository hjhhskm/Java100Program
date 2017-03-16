
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String line = "fuck fuck2 fuck3";
//		Fuck[] fucks = new Fuck[2];
//		fucks[0] = new Fuck();
//		fucks[0].setNum(2);
//		System.out.println(fucks[0].getNum());
		
		int i = 0,j = 0,k = 0;
		for(i = 0;i < 2;i++,System.out.println("1")){
			f:for(j = 0;j < 3;j++,System.out.println("2")){
				for(k = 0;k < 4;k++,System.out.println("3")){
					if(k == 3){
						break f;
					}
				}
			}
		}
		System.out.println(i+" "+j+" "+k);
		
	}
	
	public static class Fuck{
		private int num;
		
		public void setNum(int num){
			this.num = num;
		}
		
		public int getNum(){
			return num;
		}
	}

}
