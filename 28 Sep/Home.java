import java.util.Scanner;
class Home{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
  	String AdminId="Mabu123";
	String password="Mabu123";
	Admin a=new Admin();
	User u=new User();
	//Admin.login(AdminId,password);
	System.out.println("Welcome !!!\n1.Admin\n2.User");
	int userchoice=scan.nextInt();
	switch(userchoice){
		case 1:
			a.login(AdminId,password);
			break;
		case 2:
			//User u=new User();
			u.signup();
			break;
		default:
			System.out.println("You entered wrong option !!!!");
			
	
			}
	
	}

}
abstract class Books{
	public abstract void addbook();
		
			
	public static void viewbook(){
		
		int[] sno={0001,0002,0003};
		String[] names={"Ponniselva","Thirukural","purananuru"};
		String[] auth={"kalkibro","Thirubro","Author"};
		int[] stock={20,50,30};
		System.out.println("SerialNo\tBook\t\tauthor\t\tstocks");
		for(int i=0;i<3;i++)
			System.out.println(sno[i]+"\t\t"+names[i]+"\t"+auth[i]+"\t\t"+stock[i]);
			
			}
			
	//public abstract void update();
}

class Admin extends Books{
	Scanner scan = new Scanner(System.in);
	public void login(String AdminId,String password){
		Admin a=new Admin();
		System.out.print("Enter Admin ID : ");
		String name=scan.next();
		System.out.print("Enter password : " );
		String password1=scan.next();

		if(AdminId.equals(name) && password.equals(password1)){
			System.out.println("welcome Sir/Madam....");
			
			a.choice();
					}
		else{
			System.out.println("AdminId or password mismatch...\nLog in again !!!");
			a.login(AdminId,password);
					}

		
			}
	public void choice(){
		Scanner scan=new Scanner(System.in);
		System.out.println("1.Add books\n2.View books\n3.Update books\n4.Delete books\nEnter your choice : ");
		int choice=scan.nextInt();
		switch(choice){
			case 1:
				addbook();
				break;
			case 2:
				viewbook();
				break;
			
			default:
				System.out.println("Wrong choice...!!!");
				choice();
				}
		
		
	}
	public void addbook(){
		
		System.out.println("How many books you want to add ? ");
		int add=scan.nextInt();
		int[] sno=new int[add];
		String[] names=new String[add];
		String[] auth=new String[add];
		int[] stock=new int[add];
		for(int i=0;i<add;i++){
			System.out.println("Enter the serial no of book "+(i+1)+" : ");
			sno[i]=scan.nextInt();
			System.out.println("Enter the book name  of the book "+(i+1)+" : ");
			names[i]=scan.next();
			System.out.println("Enter the author name  of the book "+(i+1)+" : ");
			auth[i]=scan.next();
			System.out.println("Enter the stock of book no "+(i+1)+" : ");
			stock[i]=scan.nextInt();
			}

}
}

class User{
	Scanner scan=new Scanner(System.in);
	public void signup(){
		User u=new User();
		System.out.println("Enter your name : ");
		String Username=scan.nextLine();
		System.out.println("Entet Strong password : ");
		String password=scan.nextLine();
		char ch[]=password.toCharArray();
		String password1=null;
		for(int i=0;i<password.length();i++){
			if(password.length()>=8 && ch[i]>=65 || ch[i]<=90 && ch[i]==42 && ch[i]==64 ){
				System.out.println("Re enter password");
				password1=scan.nextLine();
				break;
				}
			else{
				System.out.println("Enter a valid password...!!!");
				
				u.signup();
				break;
				}
			}
		
		if(password.equals(password1)){
			System.out.println("Welcome "+Username+" !!! "+"\nSigned up successfully...");
		System.out.println("Do you want to sign in..?");
		System.out.println("1.Yes\n2.No");
		
		int use=scan.nextInt();
		switch(use) {
		case 1:
				u.login(Username,password1);
				break;
		case 2:
			System.out.println("Thank you !!!");
			break;
		default :
			System.out.println("Wrong choice !!!");
		}}
						
			else{
			System.out.println("Password Mismatch...!!!");
			u.signup();
			
                       }
	}
	public void login(String username,String password1){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter username : ");
		String signinuser=scan.nextLine();
		System.out.println("Enter password : ");
		String signinpass=scan.nextLine();
		if(signinuser.equals(username) && signinpass.equals(password1)){
			System.out.println("Successfully signed in...");
			System.out.println("1.View books\n2.Buy books");
			int userchoice =scan.nextInt();
			switch(userchoice){
				case 1:
					//Books b=new Books();
					Books.viewbook();
					break;
				//case 2:
					//break;
			
				default:
					System.out.println("Wrong choice !!!");
		
					}}
		else {
			System.out.println("User name or password mismatch...!!!");
				login(username,password1);

	
		}
			}
}

