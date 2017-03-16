package chapter2;

public class SaveMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMoney(48, 0);

	}
	
	public static float getMoney(int month,float money){
		float now = (float)((money*(1-(0.0171/12)))+1000);
		System.out.println("第"+month+"月剩余存款为："+now);
		if(month == 1){
			return now; 
		}else{
			return getMoney(month-1, now);
		}
	}
}
