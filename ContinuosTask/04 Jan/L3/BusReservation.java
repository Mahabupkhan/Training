import java.util.Scanner;
class BusReservation{
	static Object[] seater=new Object[12];
	static Object[] sleeper=new Object[6];
	static Passenger[] passenger=new Passenger[seater.length+sleeper.length];
	static Scanner scan=new Scanner(System.in);
	static int seatercount=12;
	static int sleepercount=6;
	public static void main(String[] args){
		int uc;
		do{
	System.out.println("1.Admin\n2.Passenger\n3.Exit");
		uc=scan.nextInt();
		if(uc==1){
			Admin.SignIn();
		}
		else if(uc==2){
			Passenger.UserOption();
		}
		else if(uc==3){
			return;
		}
		else{
			System.out.println("Wrong option!!!");
		}
		}while(uc!=3);
	}
	static{
		for(int i=0;i<seater.length;i++)
			seater[i]=i+1;
		for(int i=0;i<sleeper.length;i++)
			sleeper[i]="u"+(i+1);
	}
}
class Admin extends BusReservation{
	private static String name="Mahmood123";
	private static String pass="12345";
	public static void viewReservation(){
		System.out.println("Name\tAge\tGender\t\tphone no\t\tMail\t\tPickup\tDrop\tSeatNo");
		for(int i=0;i<passenger.length;i++){	
			System.out.println(passenger[i]);
		}
	}
	public static void SignIn(){
		System.out.println("Enter name : ");
		String n=scan.next();
		System.out.println("Enter password : ");
		String pass1=scan.next();
		if(n.equals(name) && pass1.equals(pass)){
			System.out.println("1.View reservation deatails\n2.Exit");
			int uc=scan.nextInt();
			if(uc==1){
				viewReservation();
			}
			else if(uc==2){
				return;
			}
		}
		else{
			System.out.println("user name and password mismatch!!!");
		}
	}
}
class Passenger extends BusReservation{
	static Scanner scan=new Scanner(System.in);
	String name;
	int age;
	char gender;
	String phno;
	String mail;
	String pickup;
	String drop;
	Object seatno;
    Passenger(String name,int age,char gender,String phno,String mail,String pickup,String drop,Object seatno){
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.phno=phno;
	this.mail=mail;
	this.pickup=pickup;
	this.drop=drop;
	this.seatno=seatno;
	}
	Passenger(){}
	public String toString(){
		return name+"\t\t"+age+"\t"+gender+"\t\t"+phno+"\t\t"+mail+"\t\t"+pickup+"\t\t"+drop+"\t"+seatno;
	}
	public static final void UserOption(){
		int uc;
		Passenger p=new Passenger();
		do{
		System.out.println("1.BookTicket\n2.CancelTicket\n3.Exit");
		uc=scan.nextInt();
		if(uc==1){
			p.bookTicket();
		}
		else if(uc==2){
			p.cancelTicket();
		}
		else if(uc==3){
			return;
		}
		else{
			System.out.println("Wrong Option!!!");
		}
		}while(uc!=3);
	}
	public void bookTicket(){
		if(seatercount>0 || sleepercount>0){
		System.out.print("Enter name : ");
		String name=scan.next();
		System.out.print("Enter age : ");
		int age=scan.nextInt();
		System.out.print("Enter gender(M/F) : ");
		char gender=scan.next().charAt(0);
		System.out.print("Enter phn no : ");
		String phno=scan.next();
		System.out.print("Enter Mail Id : ");
		String mail=scan.next();
		System.out.print("Enter pickup location : ");
		String pickup=scan.next();
		System.out.print("Enter drop location : ");
		String drop=scan.next();
		System.out.print("Enter sleeper/seater : \n1.sleeper\n2.Seater");
		int uc=scan.nextInt();
		System.out.println("Available seats : ");
		if(uc==1){
			if(sleepercount>0){
			for(int i=0;i<sleeper.length;i++){
				System.out.print(sleeper[i]+"\t");
			if((i+1)%2==0)
				System.out.println();
			}
			System.out.println("Enter seat no : ");
			String seatno=scan.next();
			for(int i=0;i<sleeper.length;i++){
				if(sleeper[i].equals(seatno)){
					sleeper[i]=" ";
					passenger[seater.length+(i)]=new Passenger(name,age,gender,phno,mail,pickup,drop,seatno);
					System.out.println("Ticket Booked successfully.....");
					sleepercount--;
				}
			}
			}
			else{
				System.out.println("Sorryyy No sleeper available");
			}
		}
		else if(uc==2){
			if(seatercount>0){
			for(int i=0;i<seater.length;i++){
				System.out.print(seater[i]+"\t");
			if((i+1)%2==0)
				System.out.println();
			}
			System.out.println("Enter seat no : ");
			int seatno1=scan.nextInt();
			seater[(int)seatno1-1]=" ";
			passenger[(int)seatno1-1]=new Passenger(name,age,gender,phno,mail,pickup,drop,seatno1);
			System.out.println("Ticket Booked Successfully....");
			seatercount--;
			}
			else{
				System.out.println("Sorrryyy No seater available");
			}
		}
		else{
			System.out.println("Wrong Option!!!!!");
		}
	}
	else {
		System.out.println("Sorrryyy!!! No seats available");
	}
	}
	public void cancelTicket(){
		System.out.println("Enter name : ");
		String name=scan.next();
		boolean exist=false;
		int i;
		for(i=0;i<passenger.length;i++){
			if(passenger[i]!=null){
				if(passenger[i].name.equals(name)){
					exist=true;
					break;
				}
			}
		}
		if(exist){
		System.out.println("Enter phn no to confirm : ");
		String phnno=scan.next();
		if((passenger[i].phno).equals(phnno)){
			
			if(i<=12){
				seater[i]=i+1;
				passenger[i]=null;
			}
			else if(i>12){		
				i=i-12;
				sleeper[i]="u"+(i);
				passenger[i]=null;
			}
		}
		}
		else{
			System.out.println("Sorryyy you are not booked yet....");
		}
		
	}
}