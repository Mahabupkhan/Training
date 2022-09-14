import java.util.Scanner;
class patternNo{
public static void main(String[] args){
	int n,i,j;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the N : ");
	n=scan.nextInt();
	int num=1;
	for(i=1;i<=n;i++)
	{
	for(j=1;j<=i;j++)
	{
	System.out.print(num+" ");
	num++;
	}
	System.out.println();
	}
	
	
}
}