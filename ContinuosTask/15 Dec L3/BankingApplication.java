import java.util.*;
class BankingApplication{
	
	public static void main(String[] args){
	Admin b=new Admin();
	//b.initialize();
		Option();
	}
	public static void Option(){
		
				Scanner scan=new Scanner(System.in);
		Admin a=new Admin();
			
		int uc;
		do{
		System.out.println("1.addCustomer\n2.Print Info\n3.Customer Login");
		uc=scan.nextInt();
		switch(uc){
			case 1:
				a.addNewCustomer();
				break;
			case 2:
				a.ShowCustomerList();
				break;
			case 3:
				a.customerLogIn();
		}
	}while(uc<=3);
	}
}
class Customer{
	int custId;
	int accno;
	String name;
	int balance;
	String Encpwd;
	String pwd;
	Customer(int custId,int accno,String name,int balance,String pwd,String Encpwd){
		this.custId=custId;
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		this.pwd=pwd;
		this.Encpwd=Encpwd;
	}
	public String toString(){
		return custId+"		"+accno+"		"+name+"		"+balance+"		"+Encpwd;
	}
}
class Admin{
	static ArrayList<Customer> c=new ArrayList<Customer>();
	Scanner scan=new Scanner(System.in);
	static int custId=45;
	static int accno=44045;
	public void ShowCustomerList(){
		System.out.println("CustId\t\tAccNo\t\tName\t\tBalance\t\tEncPassword");
		for(int i=0;i<c.size();i++){
			System.out.println(c.get(i));
		}
	}
	static{
		c.add(new Customer(11,11011,"Kumar",10000,"123456","234567"));
		c.add(new Customer(12,22022,"mahesh",20000,"123456","234567"));
		c.add(new Customer(13,33033,"dinesh",30000,"123456","234567"));
		c.add(new Customer(14,44044,"ganesh",40000,"123456","234567"));
	}
	public void addNewCustomer(){
		System.out.println("Enter customer name : ");
		String name=scan.next();
		System.out.println("Enter password : ");
		String pwd=scan.next();
		if(pwd.length()>=6){
			System.out.println("Re enter password : ");
			String pwd2=scan.next();
			if(pwd.equals(pwd2)){
				String Encpwd="";
				for(int i=0;i<pwd.length();i++){
					//System.out.println(ch[i]);
					if(pwd.charAt(i)!='z' && pwd.charAt(i)!='Z' && pwd.charAt(i)!='9')
					Encpwd+=(char)(pwd.charAt(i)+1);
					else{
						if(pwd.charAt(i)=='z')
						Encpwd+='a';
						else if(pwd.charAt(i)=='Z')
							Encpwd+='A';
						else if(pwd.charAt(i)=='9')
						Encpwd+='0';
					}
				}
				c.add(new Customer(custId,accno,name,10000,pwd,Encpwd));
				custId++;
				accno++;
			}
			else{
				System.out.println("Password Mismatch \ntry Again...");
				addNewCustomer();
			}
		}
		else{
			System.out.println("Password Length too Short\nEnter password with 6 or more characters...");
			addNewCustomer();
		}
		//   ShowCustomerList();
	}
	public void customerLogIn(){
		//ShowCustomerList();
		System.out.println("1.Log In\n2.Exit");
		int uc=scan.nextInt();
		if(uc==1){
			//ShowCustomerList();
		System.out.println("Enter your name : ");
		String name1=scan.next();
		int cc=0;
		for(int i=0;i<c.size();i++){
			if(c.get(i).name.equals(name1)){
				cc=i;
				break;
			}
		}
		index=cc;
		//System.out.println("CC = "+cc);
		System.out.println("Enter Your password : ");
		String pwd1=scan.next();
		if(c.get(cc).pwd.equals(pwd1)){
			System.out.println("Successfully logged in...");
			customerRedirect();
		}
		else{
			System.out.println("Password Mismatch...");
		}
		}
		else if(uc==2){
			//ShowCustomerList();
			BankingApplication.Option();
		}
		else{
			System.out.println("Wrong option....");
			customerLogIn();
		}
		 
	}
	static int index;
	public void customerRedirect(){
		int uc;
		do{
		System.out.println("1.ATM withdrawal\n2.Cash Deposit\n3.Account Transfer\n4.Exit");
		uc=scan.nextInt();
		switch(uc){
			case 1:
				atmWithdrawal();
				break;
			case 2:
				cashDeposit();
				break;
			case 3:
				accountTransfer();
				break;
			case 4:
				customerLogIn();
			default:
			  System.out.println("Wrong option...");
			  customerRedirect();
			
		}
		}while(uc<=4);
	}
	public void atmWithdrawal(){
		System.out.println("How much money you want to withdraw ?");
		int withdraw=scan.nextInt();
		if(c.get(index).balance>=withdraw){
		c.get(index).balance=c.get(index).balance-withdraw;
		System.out.println("Available balance is : "+c.get(index).balance);
		}
		else
			System.out.println("insufficient fund....");
	}
	public void cashDeposit(){
		System.out.println("How much you want deposit ?");
		int deposit=0;
		try{
		deposit=scan.nextInt();
			c.get(index).balance=c.get(index).balance+deposit;
		System.out.println("Your balance is : "+c.get(index).balance);
		}
		catch(InputMismatchException i){
			System.out.println("Enter only numbers...");
		}
	
	}
	public void accountTransfer(){
		System.out.println("Enter reciever Acc No : ");
		int a=scan.nextInt();
		int recindex=0;
		for(int i=0;i<c.size();i++){
			if(c.get(i).accno==a){
				recindex=i;
			}
		}
		System.out.println("Receiver name is : "+c.get(recindex).name+"\n");
		System.out.println("How Much you want to Transfer : ");
		int transfer=scan.nextInt();
		if(c.get(index).balance>=transfer){
			c.get(index).balance=c.get(index).balance-transfer;
			c.get(recindex).balance+=transfer;
			System.out.println("Your available balance is : "+c.get(index).balance);
		}
		else {
			System.out.println("Insufficient Fund....");
		}
	}
}