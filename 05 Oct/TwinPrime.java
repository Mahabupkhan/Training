import java.util.Scanner;
class TwinPrime{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	TwinPrime p=new TwinPrime();
	System.out.println("Enter the ranges");
	System.out.println("----------------");
	System.out.println("Enter the starting : ");
	int start=scan.nextInt();
	System.out.println("Enter the ending : ");
	int end=scan.nextInt();
	for(int i=start;i<=end;i++){
		if(p.checkprime(i) && p.checkprime((i+2)))
			System.out.println("{"+i+","+(i+2)+"}");
	}
	
}
boolean checkprime(int n){
	
	
	if(n==0 || n==1)
		return false;
	else{
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
					}
		return true;
	}
	
}
}