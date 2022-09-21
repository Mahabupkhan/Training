import java.util.Scanner;
public class TwistedPrime{
public static void main(String[] args){
	System.out.println("Enter a number : ");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int rem=0;
	int rev=0;
	int a=n;
	while(n>0){
		rem=n%10;
		rev=(rev*10)+rem;
		 n=n/10;
		}
	int small=0;
	if(a<rev)
	small=a;
	else
	small=rev;
	System.out.println("Reverse is "+rev);
	boolean flag=false;
	
	for(int i=2;i<=small/2;i++){
	if(a%i==0 && rev%i==0){
	flag=true;
	break;
	}
}
	if(flag==false)
	System.out.println(a +" and "+rev+" are prime numbers...");
	else
	System.out.println(a +" and "+rev+" are not prime numbers...");
	

	
}
}