import java.util.Scanner;
class HugeNumbers{
public static void main(String[] args){

Scanner scan=new Scanner(System.in);
	System.out.println("enter the number of digits : ");
	int digit1=scan.nextInt();
	System.out.println("enter the number : ");
	long num1=scan.nextLong();
	System.out.println("enter the number of digits : ");
	int digit2=scan.nextInt();
	System.out.println("enter the number : ");
	long num2=scan.nextLong();
	int[] a1=new int[100];
	int[] a2=new int[100];
	int[] Total=new int[100];
	for(int i=digit1-1;i>=0;i--){
		a1[i]=num1%10;
		num1=num1/10;	
		}
	for(int i=digit2-1;i>=0;i--){
		a2[i]=num1%10;
		num2=num2/10;	
		}
	long sum=num1+num2;
	for(int i=digit1-1;i>=0;i--){
		Total[i]=sum%10;
		sum=sum/10;	}
	for(int i=0;i<digit1-1;i--)
		System.out.print(Total[i]);
	
	
		
		

}
}