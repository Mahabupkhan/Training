import java.util.*;
public class Main{
	public static void main(String[] args){
		
	}
}
class User{
	ArrayList<String> trans=new ArrayList<String>();
	private String name;
	private String mail;
	private String mobno;
	private String H_ID;
	private String password;
	private double rc=0;
	private double zcoin=0;
	private boolean approval=false;
	private int zid;
	public User(String name,String mail,String mobno,String H_ID,String password,double rc){
		this.name=name;
		this.mail=mail;
		this.mobno=mobno;
		this.H_ID=H_ID;
		this.password=password;
		this.rc=rc;
	}
	public void setZid(int n){
		zid=n;
	}
	public int getZid(){
		return zid;
	}
	public String getName(){
		return name;
	}
	public void setRc(double d){
		rc+=d;
	}
	public double getRc(){
		return rc;
	}
	public void setZcoin(double d){
		zcoin+=d;
	}
	public double getZcoin(){
		return zcoin;
	}
	public void setApproval(boolean b){
		approval=b;
	}
	public boolean getApproval(){
		return approval;
	}
	public String getMail(){
		return mail;
	}

	public String toString(){
		return name+"\t"+mail;
	}
}
class Head{
	static ArrayList<User> users=new ArrayList<User>();
	static ArrayList<ArrayList> usertrans=new ArrayList<ArrayList>();
	static ArrayList<User> waiting=new ArrayList<User>();
}
class ZEmployee extends Head{
	Scanner scan=new Scanner(System.in);
	String mail="mabu123@gmail.com";
	String password="mabu@123";
	public void AdminLogin(){
		System.out.println("Enter Mail id : ");
		String id=scan.next();
		System.out.println("Enter password : ");
		String pass=scan.next();
		if(id.equals(mail) && pass.equals(password)){
			ZEmployee e=new ZEmployee();
			e.adminRedirect();
		}
		else{
			System.out.println("Mail id and password mismatch!!!");
		}
	}
	public void adminRedirect(){
		int uc;
		ZEmployee e=new ZEmployee();
		do{
			System.out.println("1.Approve/Reject User\n2.View User Transaction\n3.Exit");
			uc=scan.nextInt();
			switch(uc){
				
				case 1:
					e.ApproveOrReject();
					break;
				case 2:
					e.viewUserTrans();
					break;
				case 3:
					break;
				default:
					System.out.println("Wrong option!!!");	
			}
		}while(uc!=3);
	}
	public void ApproveOrReject(){
		 int nzid=12345;
		System.out.println("Name\tMail");
		for(int i=0;i<waiting.size();i++){
			System.out.println(waiting.get(i));
		}
		System.out.println("Enter name to approve\reject : ");
		String name=scan.next();
		System.out.println("1.Approve\n2.Reject");
		int uc=scan.nextInt();
			int k=-1;
			for(int i=0;i<users.size();i++){
				if(users.get(i).getName()==name){
					k=i;
					break;
				}
			}
				int m=-1;
			for(int i=0;i<waiting.size();i++){
				if(waiting.get(i).getName()==name){
					m=i;
					break;
				}
			}
		if(uc==1){	
			users.get(k).setApproval(true);
			users.get(k).setZid(nzid);
			waiting.remove(m);
			nzid++;
			
		}
		else if(uc==2){
			waiting.remove(m);
			users.remove(k);
		}
		else{
			System.out.println("Wrong option !!!!");
		}
		
	}
	public void viewUserTrans(){
		
	}
}
	

class UserActions extends Head{
	Scanner scan=new Scanner(System.in);
	public void createAccount(){
		System.out.println("Enter your full name : ");
		String name=scan.next();
		System.out.println("Enter your mail id : ");
		String mail=scan.next();
		System.out.println("Enter mobile number : ");
		String mobno=scan.next();
		System.out.println("Enter your govt id : ");
		String id=scan.next();
		String password;
		boolean strong;
		do{
		System.out.println("Enter strong password : ");
		password=scan.next();
		if(password.length()>=8){
			int num=0;
			int spl=0;
			for(int i=0;i<password.length();i++){
				if(password.charAt(i)>=33 && password.charAt(i)<= 57)
					spl++;
				else if(password.charAt(i)>=60 && password.charAt(i)<=70)
					num++;
			}
			
			if(num>=3 && spl>=2){
				strong=true;
			}
			else {
				strong =false;
				System.out.println("Enter atleast 3 numbers and 2 spl characters!!!!!");
			}
		}
		else{
			strong=false;
			System.out.println("Password length too short!!!!");
		}
		
		}while(strong==false);
		System.out.println("Enter initial Real currency deposit amount : ");
		double rc=scan.nextDouble();
		User u=new User(name,mail,mobno,id,password,rc);
		users.add(u);
		waiting.add(u);
		System.out.println("Your account is waiting for admin approval");
	}
	static int ind;
	public void userLogin(){
		System.out.println("Enter your mail id : ");
		String usermail=scan.next();
		int k=-1;
		for(int i=0;i<users.size();i++){
			if(users.get(i).getMail()==usermail){
				k=i;
				break;
			}
		}
		if(k==-1){
			System.out.println("Sorry your request is rejected!!!!");
			return;
		}
		ind=k;
		if(users.get(ind).getApproval()==true){
			
		}
		else{
			System.out.println("Your request is in pending....");
		}
	}
}






















