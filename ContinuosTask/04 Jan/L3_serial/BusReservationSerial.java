import java.util.Scanner;
import java.util.ArrayList;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class BusReservationSerial{
	static Object[] seater=new Object[12];
	static Object[] sleeper=new Object[6];
	static Passenger[] passenger=new Passenger[seater.length+sleeper.length];
	static Scanner scan=new Scanner(System.in);
	static int seatercount=12;
	static int sleepercount=6;
	public static void main(String[] args){
		int uc;
		do{
			System.out.println("1.Passenger\n2.Exit");
			uc=scan.nextInt();
			switch(uc){
				case 1:
				PassengerAction.UserOption();
				break;
				case 2:
				PassengerAction.Exit();
				break;
			}
		}while(uc<3);
	}
	static{
		for(int i=0;i<seater.length;i++)
			seater[i]=i+1;
		for(int i=0;i<sleeper.length;i++)
			sleeper[i]="u"+(i+1);
	}
}
class Passenger implements Serializable{
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
	public String toString(){
		return 	name+"\t\t"+age+"\t"+gender+"\t\t"+phno+"\t\t"+mail+"\t\t"+pickup+"\t\t"+drop+"\t"+seatno;
	}
}
class PassengerAction extends BusReservationSerial{
		public static final void Exit(){
			try{
			FileOutputStream fo=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java\\ContinuosTask\\04 Jan\\L3 serial\\PassengerDetail.txt");
			ObjectOutputStream os=new ObjectOutputStream(fo);
			for(int i=0;i<passenger.length;i++){
				if(passenger[i]!=null)
					os.writeObject(passenger[i]);
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		public static final void UserOption(){
		int uc;
		PassengerAction p=new PassengerAction();
		do{
		System.out.println("1.BookTicket\n2.CancelTicket\n3.Exit");
		uc=scan.nextInt();
		if(uc==1){
			p.bookTicket();
		}
		else if(uc==2){
			//p.cancelTicket();
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
		
	}
}