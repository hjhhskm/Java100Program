package chapter2;

public class BalanceQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b1=0,b2=0,b3=0,b4=0;
		boolean flag = false;
		for(b1 = 1;b1 < 40&&(!flag);b1++){
			for(b2 = b1+1;b2 < 40&&(!flag);b2++){
				for(b3 = b2+1;b3 < 40&&(!flag);b3++){
					if((b4 =40-( b1+b2+b3))>b3){
						flag = true;
						for(int num = 1;num <= 40;num++){
							boolean thf = false;
							for(int a1 = 1;a1>-2&&(!thf);a1--){
								for(int a2 = 1;a2>-2&&(!thf);a2--){
									for(int a3 = 1;a3>-2&&(!thf);a3--){
										for(int a4 = 1;a4 > -2&&(!thf);a4--){
											if(num==(b1*a1)+(b2*a2)+(b3*a3)+(b4*a4)){
												thf = true;
											}
										}	
									}
								}
							}
							if(!thf){
								flag = false;
								break;
							}
						}
						
					}
				}
			}
		}
		b1 -=1;
		b2 -=1;
		b3 -=1;
		System.out.println("Java got the answer as following:\n"+b1+" "+b2+" "+b3+" "+b4+"\nand the process as follows");
		for(int num = 1;num <= 40;num++){
			boolean thf = false;
			for(int a1 = 1;a1>-2&&(!thf);a1--){
				for(int a2 = 1;a2>-2&&(!thf);a2--){
					for(int a3 = 1;a3>-2&&(!thf);a3--){
						for(int a4 = 1;a4 > -2&&(!thf);a4--){
							if(num==(b1*a1)+(b2*a2)+(b3*a3)+(b4*a4)){
								String result = num+"=";
								switch (a1) {
								case -1:
									result = b1+"+"+result;
									break;
								case 1:
									result +="+"+b1;
								default:
									break;
								}
								switch (a2) {
								case -1:
									result = b2+"+"+result;
									break;
								case 1:
									result +="+"+b2;
								default:
									break;
								}
								switch (a3) {
								case -1:
									result = b3+"+"+result;
									break;
								case 1:
									result +="+"+b3;
								default:
									break;
								}
								switch (a4) {
								case -1:
									result = b4+"+"+result;
									break;
								case 1:
									result +="+"+b4;
								default:
									break;
								}
								int delete = result.indexOf('=')+1;
								result = result.substring(0,delete)+result.substring(delete+1);
								System.out.println(num+":"+result);
							}
						}	
					}
				}
			}
		}
		
	}
}