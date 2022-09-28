import java.util.Scanner;
public class RepetitionProb{
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the String : ");
	String sc=s.next();
	System.out.print("Enter the repitition : ");
	int a=s.nextInt();
	for(int i=0;i<a;i++)
		System.out.print(sc);
	
}
}