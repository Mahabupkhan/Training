import java.util.Scanner;
class Prog2{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=scan.nextInt();
		int rev=0;
		int num1=num;
		while(num!=0){
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		//System.out.println(rev);
		//System.out.println(num1);
		if(findPrime(num1)&&findPrime(rev))
			System.out.println(num1+" and " +rev+" are prime numbers" );
		else if(findPrime(num1)==true && findPrime(rev)==false){
			System.out.println(num1+" is prime number but "+rev+" is not a prime number");
		}
		else if(findPrime(num1)==false && findPrime(rev)==true)
			System.out.println(num1+" is not a prime number but "+rev+" is a prime number");
		else if(findPrime(num1)==false && findPrime(rev)==false)
			System.out.println(num1+" and "+rev+" are not prime numbers");
		
		
	}
	public static boolean findPrime(int n){
		boolean result=true;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				result=false;
				break;
			}
		}
		return result;
	}
}
