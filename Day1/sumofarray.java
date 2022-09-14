import java.util.Scanner;
class sumofarray{
public static void main(String[] args)
{
	int l;

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array : ");
		l=scan.nextInt();
		int a[]=new int[1000];
		int sum=0; 
	for(int i=0;i<l;i++){
		System.out.println("Enter n"+(i+1));
		a[i]=scan.nextInt();
	
		}
		for(int j=0;j<l;j++){
			sum+=a[j];
		}
	System.out.println("Sum of the array = "+sum);

	
}
}