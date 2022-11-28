import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
	Customer c=new Customer();
	
	int uc=0;
	do{
		System.out.println("1.addCustomer\n2.Print Info\n3.Customer Login");
		uc=scan.nextInt();
		switch(uc){
			case 1:
				c.addCustomer();
				break;
			case 2:
				c.Printinfo();
				break;
			case 3:
				Authentication au=new Authentication();
				au.CusLogIn();
				break;
				
		}
	}while(uc<=2);
	
	
	}
}

public class Customer{
	Scanner scan=new Scanner(System.in);
	static int[] Cid={11,12,13,14};
	static int[] Ano={10001,10002,10003,10004};
	String[] name={"Kumar","Madhu","Rahul","Robin"};
	int[] balance={10000,20000,30000,40000};
	String[] password={"123456789","223456789","323456789","423456789"};
	static int[] Cid2=new int[20];
	static int[] Ano2=new int[20];
	static String[] name2=new String[20];
	static int[] balance2=new int[20];
	static String[] password2=new String[20];
	static String[] NonEncpass=new String[20];
	static int cc=0;
	static int AccNo=10005;
	static int CustId=15;
	
	
	public void Printinfo(){
		System.out.println("CustId\tAcc No\tname\tbalance\tPassword\tNon Encrypt");
		for(int i=0;i<4;i++){
			System.out.println(Cid[i]+"\t"+Ano[i]+"\t"+name[i]+"\t"+balance[i]+"\t"+password[i]);
		}
		for(int i=0;i<cc;i++){
			System.out.println(Cid2[i]+"\t"+Ano2[i]+"\t"+name2[i]+"\t"+balance2[i]+"\t"+password2[i]+"\t\t"+NonEncpass[i]);
		}
	}
	
	public void addCustomer(){
		System.out.println("Enter Customer name : ");
		name2[cc]=scan.next();
		System.out.println("Enter Strong password : ");
		String pass=scan.next();
		if(pass.length()>=6){
			System.out.println("Re enter password : ");
			String pass2=scan.next();
			if(pass.equals(pass2)){
				NonEncpass[cc]=pass;
				char[] ch=pass.toCharArray();
				String EncPass="";
				for(int i=0;i<ch.length;i++){
					//System.out.println(ch[i]);
					EncPass+=(char)(ch[i]+1);
				}
				password2[cc]=EncPass;
				balance2[cc]=10000;
				Ano2[cc]=AccNo++;
				Cid2[cc]=CustId++;
				System.out.println(name2[cc]+" added successfully!!!");
				cc++;
				}
				else{
					System.out.println("Password Mismatch!!!");
					addCustomer();
				}
				
		}
		else{
			System.out.println("Enter atleast 6 or above length");
			addCustomer();
		}
		//System.out.println("cc = "+cc);
		
	}
}
class Authentication extends Customer{
	Scanner scan=new Scanner(System.in);
	static int i;
	
	public void CusLogIn(){
		System.out.println("Enter choice\n1.Log in\n2.Exit");
		int uc=scan.nextInt();
		if(uc==1){
		System.out.println("Please enter your name : ");
		String Cusname=scan.next();
		System.out.println("Enter Your password : ");
		String password=scan.next();
		
		//boolean available=false;
		int flag=0;
		
		
		//System.out.println("cc = "+cc);
		for(int k=0;k<cc;k++){
			if(Cusname.equals(name2[k])){
				flag=1;
					i=k;
				break;
			
			}
		}
		System.out.println(i);
		
		//System.out.println(flag);
		if(flag==1){
			if(NonEncpass[i].equals(password)){
				System.out.println("Welcome Mr./Mrs. "+Cusname);
				Authentication a=new Authentication();
				a.Redirect();
			}
			else{
				System.out.println("password mismatch");
				CusLogIn();
			}
		}
		else{
			System.out.println("You are not added yet");
		}
		}
		else if(uc==2){
			Main.main(null);
		}
	}
	public void Redirect(){
		int uc;
		CustomerActions ca=new CustomerActions();
		do{
			System.out.println("1.ATM withdrawal\n2.CashDeposit\n3.Account Transfer\n4.Exit");
			uc=scan.nextInt();
			switch(uc){
				case 1:
				ca.ATMwithdrawal();
				break;
				case 2:
				ca.CashDeposit();
				case 3:
				ca.Transfer();
				break;
				case 4:
				Authentication au2=new Authentication();
				au2.CusLogIn();
				break;
				default:
				System.out.println("wrong option!!!");
					
			}
		}while(uc<=4);
	}
}
interface CustomerCan{
	public void ATMwithdrawal();
	public void CashDeposit();
	public void Transfer();
	
}
class CustomerActions extends Authentication implements CustomerCan{
	public void ATMwithdrawal(){
		System.out.println("How much you want to withdraw : ");
		int withdraw=scan.nextInt();
		balance2[i]-=withdraw;
	}
	public void CashDeposit(){
		System.out.println("How much you want to deposit : ");
		int deposit=scan.nextInt();
		balance2[i]+=deposit;
		
	}
	public void Transfer(){
		System.out.println("Enter receiver acc no : ");
		int accno=scan.nextInt();
		System.out.println("How much you want to transfer : ");
		int transfer=scan.nextInt();
		int j;
		for(j=0;j<cc;j++){
			if(Ano2[j]==accno){
				break;
			}
		}
		balance2[j]+=transfer;
		balance2[i]-=transfer;
	}
}