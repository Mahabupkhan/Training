import java.util.Scanner;
class arrayrotation{
public static void main(String[] args){
	System.out.println("Enter the size of the array : ");
	Scanner scan=new Scanner(System.in);
	int i;
	int l=scan.nextInt();
	int a[]=new int[l];
	for( i=0;i<l;i++)
	{
	System.out.println("Enter n"+(i+1)+" : ");
	a[i]=scan.nextInt();
	}
	for( i =0;i<1;i++)
	{
	int temp = a[l-1];
	for(int j=l-1;j>0;j--)
	{
	a[j]=a[j-1];
	}
	a[0]=temp;
	}
	

	//for(int k=0;k<l;k++)
	//{
		
		System.out.println ("Altered array : "+(a[0]-a[l-1]));
	//}
	
	
}
} 