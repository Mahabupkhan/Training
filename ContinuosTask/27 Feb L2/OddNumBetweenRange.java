import java.util.Scanner;
//start : 11.10
class OddNumBetweenRange{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Num 1 : ");
		int n1=scan.nextInt();
		System.out.println("Enter Num 2 :");
		int n2=scan.nextInt();
		for(int i=n1;i<n2;i++){
			if(i%2==1)
				System.out.print(i+" ");
		}
		//End : 11.13	
	}
}