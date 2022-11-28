import java.util.Scanner;
import java.lang.*;
class Eh{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args){
		
		try{
			met1();
		}
		catch(Exception e){
			
			met1();
		}
		System.out.println("program continues....");
	}
	public static void met1(){
		System.out.println("Enter a number");
		int value=scan.nextInt();
	}
}