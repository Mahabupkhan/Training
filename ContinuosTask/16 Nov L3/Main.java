import java.util.Scanner;
class Main{
	
	public static void main(String[] args){
		Option o=new Option();
		o.Choice();
	}
}
class Option{
	public void Choice(){
		Scanner scan=new Scanner(System.in);
		int uc;
		
		do{
			System.out.println("1.Admin\n2.Customer\n3.Exit");
			uc=scan.nextInt();
		switch(uc){
			case 1:
				Admin a=new Admin();
				a.signIn();
				break;
			case 2:
				User u=new User();
				u.bookTaxi();
				break;  
			default:
				System.out.println("Thank you!!!");
		}
		}while(uc!=3);
	}
}
class Details{
	Scanner scan=new Scanner(System.in);
	String[] taxis={"taxi 1","taxi 2","taxi 3","taxi 4"};
	static char[] taxiposition={'A','A','A','A'};
	char[] points={'A','B','C','D','E','F'};
	static int[] earnings={0,0,0,0}; 
	
}
class Admin extends Details{
	Scanner scan=new Scanner(System.in);
	String userId="Mabu@123";
	String password="12345";
	public void signIn(){
		System.out.println("Enter user id : ");
		String userId=scan.next();
		System.out.println("Enter password : ");
		String password=scan.next();
		if(password.equals(this.password) && userId.equals(this.userId)){
			System.out.println("Welcome Admin!!!");
			int ac;
			
			do{
				System.out.println("1.view taxi details\n2.exit");
				ac=scan.nextInt();
				switch(ac){
					case 1:
						Admin a=new Admin();
						a.viewDetails();
						break;
					case 2:
					   Option o=new Option();
					 o.Choice();
					 break;
					 default : 
					 System.out.println("wrong choice !!!");
				}
			}while(ac<3);
		}
		else{
			System.out.println("Wrong password or userId!!!");
			signIn();
		}
	}
	public void viewDetails(){
		System.out.println("Taxi\tcurrent location\tearnings");
		for(int i=0;i<4;i++){
		System.out.println(taxis[i]+"\t\t"+taxiposition[i]+"\t\t"+earnings[i]);
		}
	}
}
class User extends Details{
	Scanner scan=new Scanner(System.in);
	static int cusId=1;
	static char pickUp;
	static char drop;
	static int time;
	static int cost;
	static int assignedTaxi;
	public void bookTaxi(){
		System.out.println("Enter pick up point : ");
		pickUp=scan.next().charAt(0);
		System.out.println("Enter Drop point : ");
		drop=scan.next().charAt(0);
		System.out.println("Enter pickup time : ");
		cusId++;
		time=scan.nextInt();
		User u=new User();
		u.allocateTaxi();
	}
	public void allocateTaxi(){
		int pickupPoint=0;
		int dropPoint=0;
		for(int i=0;i<4;i++){
			if(points[i]==pickUp){
				pickupPoint=i;	
			}
			else if(points[i]==drop)
				dropPoint=i;
		}
		
		int taxino=0;
		for(taxino=0;taxino<4;taxino++){
			if(pickUp==taxiposition[taxino]){
				break;
			}
		}
		taxiposition[taxino]=drop;
		System.out.println(taxis[taxino]+" is allotted");
		int distance;
		if(dropPoint>pickupPoint)
			distance=(dropPoint-pickupPoint)*15;  
		else
			distance=(pickupPoint-dropPoint)*15;
		    cost=100+((distance-5)*10);
		  //System.out.println(cost);
		  earnings[taxino]+=cost;
			
		
		
	}
}  