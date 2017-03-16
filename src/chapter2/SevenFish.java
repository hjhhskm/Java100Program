package chapter2;

public class SevenFish {
	public static void main(String[] args) {
		float[][] man = new float[3][3];

		float a, b, c, d, e, f;

		for (int i = 1; i <= 7; i++) {
			a = man[0][0] = i;
			b = man[0][1] = (float) ((3.5 - i) * 2);
			c = man[0][2] = 7 - a - b;
			if (a<0||b<0||c < 0) {
				continue;
			}
			
			for (int j = 1; j <= 7; j++) {
				d = man[1][0] = j;
				e = man[1][1] = (float) ((3.5 - j) * 2);
				f = man[1][2] = 7 - c - d - e;
				if(d<0||e<0||f < 0){
					continue;
				}
				if((7-a-d)<0){
					continue;
				}
				man[2][0] = 7-a-d;
				if((7-b-e)<0){
					continue;
				}
				man[2][1] = 7-b-e;
				man[2][2] = 7-c-f;
				for(int full = 0;full < 3;full++){
					System.out.println("man"+(full+1)+"\tfull"+man[full][0]+"\tmid"+man[full][1]+"\tempty"+man[full][2]);	
				}
				System.out.println();
			}
		}
	}

}