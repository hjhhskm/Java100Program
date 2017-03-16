import java.util.Scanner;

public class PrivilegeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String lines;
		lines = scanner.nextLine();
		int priNum = Integer.parseInt(lines);
		Privilege[] nowP = new Privilege[priNum];
		for (int i = 0; i < priNum; i++) {
			lines = scanner.nextLine();
			String s[] = lines.split(":");
			nowP[i] = new Privilege();
			nowP[i].setName(s[0]);
			if (s.length > 1) {
				nowP[i].setLevel(Integer.parseInt(s[1]));
			}
		}
		lines = scanner.nextLine();
		Integer jobNum = 0;
		try {
			jobNum = Integer.parseInt(lines);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
		
		Job[] nowJ = new Job[jobNum];
		for (int i = 0; i < jobNum; i++) {
			lines = scanner.nextLine();
			String s[] = lines.split(" ");
			nowJ[i] = new Job();
			nowJ[i].setName(s[0]);
			int pNum = Integer.parseInt(s[1]);
			nowJ[i].setpNum(pNum);
			for(int j = 0;j < pNum;j++){
				String s2[] = s[j+2].split(":");
				nowJ[i].list[j] = new Privilege();
				nowJ[i].list[j].setName(s2[0]);
				if(s2.length > 1){
					nowJ[i].list[j].setLevel(Integer.parseInt(s2[1]));
				}
			}
		}

		lines = scanner.nextLine();
		int rNum = 0;
		try {
			rNum = Integer.parseInt(lines);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Person[] nowR = new Person[rNum];
		for(int i = 0; i < rNum;i++){
			lines = scanner.nextLine();
			String[] s = lines.split(" ");
			nowR[i] = new Person();
			nowR[i].name = s[0];
			int jbnum = Integer.parseInt(s[1]);
			nowR[i].setNum(jbnum);
			for(int j = 0;j < jbnum;j++){
				nowR[i].jobs[j] = new Job();
				nowR[i].jobs[j].setName(s[j+2]);
			}
		}
		
		lines = scanner.nextLine();
		int fNum = 0;
		try {
			fNum = Integer.parseInt(lines);
		} catch (Exception e) {
			// TODO: handle exception
		}
		for(int i = 0;i < fNum;i++){
			lines = scanner.nextLine();
			String[] ist = lines.split(" ");
			Privilege priv = new Privilege();
			String[] p = ist[1].split(":");
			priv.setName(p[0]);
			if(p.length > 1){
				int number = checkPri2(ist[0], nowR, nowJ, priv);
				if(number == -2){
					System.out.println(false);
				}else{
					System.out.println(number);
				}
			}else{
				System.out.println(checkPri(ist[0], nowR, nowJ, priv));
			}
			
			
		}
		
	}
	
	public static int checkPri2(String name,Person[] manL,Job[] jbL,Privilege pri){
		int i;
		for(i = 0;i < manL.length;i++){
			if(manL[i].getName().equals(name)){
				break;
			}
		}
		
		for(Job job : jbL){
			for(Job manjob : manL[i].getJobs()){
				if(manjob.getName().equals(job.getName())){
					for(Privilege privilege : job.getList()){
						if(privilege.equal(pri)){
							return privilege.getLevel();
						}
					}
				}
			}
		}
		return -2;
	}
	
	public static boolean checkPri(String name,Person[] manL,Job[] jbL,Privilege pri){
		int i;
		for(i = 0;i < manL.length;i++){
			if(manL[i].getName().equals(name)){
				break;
			}
		}
		for(Job job : jbL){
			for(Job manjob : manL[i].getJobs()){
				if(manjob.getName().equals(job.getName())){
					for(Privilege privilege : job.getList()){
						if(privilege.equal(pri)){
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	private static class Privilege {
		private String name = new String();
		private int level = -1;

		public Privilege() {
		}

		public boolean equal(Privilege p){
			if(p.getName().equals(name)){
				if(p.getLevel()>=level){
					return true;
				}
			}
			return false;
		}
		public String getName() {
			return name;
		}

		public void setName(String name2) {
			this.name = name2;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}
	}

	public static class Job {

		private String name;
		private int pNum;
		public Privilege[] list;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void setName2(String name) {
			this.name = name;
		}

		public int getpNum() {
			return pNum;
		}

		public void setpNum(int pNum) {
			this.pNum = pNum;
			list = new Privilege[pNum];
		}

		public Privilege[] getList() {
			return list;
		}

		public void setList(Privilege[] list) {
			this.list = list;
		}
	}

	public static class Person{
		
		private String name;
		private int num;
		public Job[] jobs;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
			jobs = new Job[num];
		}
		public Job[] getJobs() {
			return jobs;
		}
		public void setJobs(Job[] jobs) {
			this.jobs = jobs;
		}
		
		
		
	}
}
