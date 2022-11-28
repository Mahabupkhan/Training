import java.util.Scanner;
class Main3{
	public static void main(String[] args){
		
	}
}
class Option{
	Scanner scan=new Scanner(System.in);
	public static void Choice(){
		int uc;
		do{
			System.out.println("1.Admin\n2.User");
			uc=scan.nextInt();
			switch(uc){
				case 1:
				case 2:
			}
		}
	}
}
class Details{
	String[] taxi={"Taxi 1","Taxi 2","Taxi 3","Taxi 4"};
	static int[] earnings={0,0,0,0};
	static char[] currpos={'A','A','A','A'};
	char[] points={'A','B','C','D','E','F'};
	static int[] time={0,0,0,0};
	
	
}
class User extends Details{
	Scanner scan=new Scanner(System.in);
	static char pickUp;
	static char drop;
	static int time;
	public void bookTaxi(){
		System.out.println("Enter pick up point : ");
		pickUp=scan.next().charAt(0);
		System.out.println("Enter drop point : ");
		drop=scan.next().charAt(0);
		System.out.println("Enter pickUp time : ");
		time=scan.nextInt();
		
	}
}
class Admin extends Details{
	static int totalDistance=0;
	static int totalcost=0;
	
	public void CalDistance(char pickUp,char drop){
		for(int i)
	}
}