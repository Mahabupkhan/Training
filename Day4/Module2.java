

import java.util.Scanner;

public class Module2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int userchoice;
	System.out.println("1.Admin\n2.User");
	//System.out.println("2.User");
	userchoice=scan.nextInt();
	switch(userchoice){
	case 1:
		Admin.SignUp();
		break;
	case 2:
		User.SignUp();
		break;
	default:
		System.out.println("Wrong Choice...");}
			  

					}

public class Admin{
public static void SignUp(){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your name : ");
	String name=scan.nextLine();
	System.out.println("Enter Strong password : ");
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
		System.out.println("Enter a valid passsword...!!!");
		Admin.SignUp();
		break;
	}
	}
	
	
	
	if(password.equals(password1)){
		System.out.println("Welcome "+name+" !!!"+"\nSigned up successfully...");
	System.out.println("Do you want to sign in..?");
	System.out.println("1.Yes\n2.No");
	//System.out.println("2.No");
	int use=scan.nextInt();
	switch(use) {
	case 1:
			Admin.SignIn(name,password1);
			break;
	case 2:
		System.out.println("Thank you !!!");
		break;
	default:
		System.out.println("Wrong choice...");
		}
		
}
	else{
		System.out.println("Password Mismatch...");
		Admin.SignUp();
}
		
		
}

public static void SignIn(String name,String password1) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter username : ");
	String signinuser=scan.nextLine();
	System.out.println("Enter password : ");
	String signinpass=scan.nextLine();
	if(signinuser.equals(name) && signinpass.equals(password1))
		System.out.println("Successfully signed in...");
	else {
		System.out.println("User name or password mismatch...!!!");
			Admin.SignIn(name,password1);
}
}
}
public class User{
	public static void SignUp() {
		Scanner scan=new Scanner(System.in);
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
				User.SignUp();
				break;
				}
			}
		
		if(password.equals(password1)){
			System.out.println("Welcome "+Username+" !!! "+"\nSigned up successfully...");
		System.out.println("Do you want to sign in..?");
		System.out.println("1.Yes\n2.No");
		//System.out.println("2.No");
		int use=scan.nextInt();
		switch(use) {
		case 1:
				User.SignIn(Username,password1);
				break;
		case 2:
			System.out.println("Thank you !!!");
		default :
			System.out.println("Wrong choice !!!");
		}}
						
			else{
			System.out.println("Password Mismatch...!!!");
			User.SignUp();
			
}
	
}

public static void SignIn(String Username,String password1) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter username : ");
	String signinuser=scan.nextLine();
	System.out.println("Enter password : ");
	String signinpass=scan.nextLine();
	if(signinuser.equals(Username) && signinpass.equals(password1))
		System.out.println("Successfully signed in...");
	else {
		System.out.println("User name or password mismatch...!!!");
			User.SignIn(Username,password1);
}}}}