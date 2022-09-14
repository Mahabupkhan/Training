import java.util.Scanner;
class pattern{
public static void main(String[] args){
	int n,i,j;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the N : ");
	n=scan.nextInt();
	for(i=1;i<=n;i++)
	{
	for(j=1;j<=i;j++)
	{
	System.out.print("* ");
	}
	System.out.println("\n");
	}
	
	
}
}