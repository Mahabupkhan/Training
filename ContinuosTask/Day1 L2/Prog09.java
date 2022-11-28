import java.util.Scanner;
class Prog09{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a positive integer : ");
		int n=scan.nextInt();
		System.out.println(findPerfectNum(n));
	}
	public static boolean findPerfectNum(int n){
		int sum=0;
		//boolean result=false;
		for(int i=n-1;i>0;i--){
			if(n%i==0){
				sum+=i;
			}
		}
		if(sum==n)
			return true;
		else
			return false;
	}
}