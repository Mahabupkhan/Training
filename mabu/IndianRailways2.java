import java.util.Scanner;
public class IndianRailways2{

	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int a;
		do
		{
		System.out.println("Welcome to Indian Railways\n1.Available Ticket\n2.Book Ticket\n3.Cancel Ticket\n4.Tickets Booked\n5.Exit");
		 a=scan.nextInt();
		switch(a)
		{
			case 1:
		    AvailableTicket At=new AvailableTicket();
			At.showDetails();
			break;
			case 2:
			BookTicket Bt=new BookTicket();
			Bt.BookTickets();
			break;
			case 3:
			CancelTickets ct=new CancelTickets();
			ct.Cancel();
			break;
			case 4:
			BookedTicket Bdt=new BookedTicket();
			Bdt.showTicket();
			break;
			
		}
		}while(a!=5);
		System.out.println("Thank you by Indian Railways");
		
	}
}
class passengerDetails
{
       Scanner scan=new Scanner(System.in);
	 
	 static   int upper=2;
	 static  int lower=2;
	 static int middle=2;
	  static int Rac=2;
	 static  int wl=2;
	 static int totalseat=upper+lower+middle;
	
		static String Pnr[]=new String[10];
		static String Name[]=new String[10];
		static int Age[]=new int[10];
	    static int Seatno[]=new int[10];
	    static String Gender[]=new String[10];
		static int Fare[]=new int[10];
		static String Berth[]=new String[10];
		 static int count=0;
	
}
class BookTicket extends passengerDetails
{
	 static  int pvalue=1;
	 static String pnr;
	
	 static int sno=1;
	 static BookTicket obj=new BookTicket();
	void BookTickets()
	{
		System.out.print("Enter no of tickets : ");
		int n=scan.nextInt();
		if(n<=totalseat+Rac+wl){
		if(sno<=6)
		{
			pnr="000"+Integer.toString(pvalue);
	    obj.setTicket(n,pnr);
		}
		else if(sno>6 && sno<=8)
		{
			pnr="000"+Integer.toString(pvalue);
			obj.setTicket(n,pnr);
			
			
		}
		else if(sno>8 && sno<=10)
		{
			pnr="000"+Integer.toString(pvalue);
			obj.setTicket(n,pnr);
		}
		else
			System.out.println("No ticket available");
		}
		else
			System.out.println("Only "+(totalseat+Rac+wl)+" seat availabe");
	}
	void setTicket(int n,String pnr)
	{
			for(int i=0;i<n;i++)
		{
			Pnr[count]=pnr;
			System.out.println("Enter the Passenger Name :");
			String name=scan.next();
			Name[count]=name;
			System.out.println("Enter the Passenger Age :");
		    int age=scan.nextInt();
			Age[count]=age;
			if(age>5)
			Seatno[count]=++sno;
		   else 
			   Seatno[count]=0;
			System.out.println("Enter the Passenger Gender :");
			String gender=scan.next();
			Gender[count]=gender;
			if(lower==0 && middle==0 && upper==0 && Rac==0){
				Berth[count]="WL";
				--wl;
			}
			else if(lower==0 && middle==0 && upper==0){
				Berth[count]="RAC";
				--Rac;
			}
			if(age>5)
				Fare[count]=400;
			else
				Fare[count]=200;
			boolean check=false;
			if(totalseat>0)
			{
			if(age>60)
			{
			 check=lower!=0?true:false;
			if(check==true)
			{
				Berth[count]="Lower";
				--lower;
				--totalseat;
			}
			else
			{
			System.out.println("No Lower Available");
             obj.berthPreference(count);			 
			}
			}
			else
			{
			if(age>5)
			{
			obj.berthPreference(count);
			}
			else
				Berth[count]="no Berth";
			}
			}
			++count;
			
		}
		++pvalue;
		System.out.println("Ticket Booked Sucessfully");
	}
	
	void berthPreference(int count)
	{
		System.out.println("Enter the Berth Preference as 1.Lower 2.Middle 3.Upper ");
			int uc=scan.nextInt();
			--totalseat;
			switch(uc)
			{
				case 1:
				obj.lowerBerth(count);
				break;
				case 2:
				obj.middleBerth(count);
				break;
				case 3:
				obj.upperBerth(count);
				break;
			
				
			}
	}
	void lowerBerth(int count)
	{
		if(lower!=0)
		{
			Berth[count]="Lower";
          --lower;
		}
		else
			obj.upperBerth(count);
	}
     	void upperBerth(int count)
	{
		if(upper!=0)
		{
			Berth[count]="Upper";
		--upper;
		}
		else 
			obj.middleBerth(count);
	}	
    void middleBerth(int count)
	{
		if(middle!=0)
		{
			Berth[count]="Middle";
		--middle;
		}
		else
			obj.lowerBerth(count);
	}
}

class BookedTicket extends passengerDetails
{
	void showTicket()
	{
		System.out.print("Pnr\tName\tAge\tSeatno\tGender\tFare\tBerth\n");
		for(int i=0;i<Name.length;i++)
		{	
		if(Fare[i]!=0)
		{
		System.out.print(Pnr[i]+"\t"+Name[i]+"\t"+Age[i]+"\t"+Seatno[i]+"\t"+Gender[i]+"\t"+Fare[i]+"\t"+Berth[i]+"\n");
        }
		}
	}
}

class AvailableTicket extends passengerDetails
{
	void showDetails()
	{
	 System.out.println("No.of.Lower No.of.Upper No.of.Middle Total seats");
	 System.out.println("    "+lower+"\t        "+upper+"\t    "+middle+"\t\t"+totalseat);
	}
}
class CancelTickets extends passengerDetails{
	void Cancel() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the PNR no : ");
		String p=scan.next();
		System.out.print("Pnr\tName\tAge\tSeatno\tGender\tFare\tBerth\n");
		for(int i=0;i<Pnr.length;i++){
			if(p.equals(Pnr[i]))
				System.out.print(Pnr[i]+"\t"+Name[i]+"\t"+Age[i]+"\t"+Seatno[i]+"\t"+Gender[i]+"\t"+Fare[i]+"\t"+Berth[i]+"\n");
		}
		System.out.println("Enter the person name to cancel : ");
		String person=scan.next();
		for(int i=0;i<Pnr.length;i++){
			if(person.equals(Name[i])){
				System.out.println("Ticket cancelled for "+Name[i]+ "\nThank You!!!");
				if(Berth[i].equals("Upper"))
					++upper;
				else if(Berth[i].equals("Lower"))
					++lower;
				else
					++middle;
				--count;
				
				Pnr[i]=Pnr[6];
				Name[i]=Name[6];
				Age[i]=Age[6];
				Gender[i]=Gender[6];
				Fare[i]=Fare[6];
				
				Pnr[6]=Pnr[7];
				Name[6]=Name[7];
				Age[6]=Age[7];
				Gender[6]=Gender[7];
				Fare[6]=Fare[7];
				
				Pnr[7]=Pnr[8];
				Name[7]=Name[8];
				Age[7]=Age[8];
				Gender[7]=Gender[8];
				Fare[7]=Fare[8];
				
				Pnr[8]=Pnr[9];
				Name[8]=Name[9];
				Age[8]=Age[9];
				Gender[8]=Gender[9];
				Fare[8]=Fare[9];
				
				Pnr[9]=null;
				Name[9]=null;
				Age[9]=0;
				Gender[9]=null;
				Fare[9]=0;
				
				++totalseat;
				
				
				
				
				break;
			}
			
		}
		
		
		
	}
}
