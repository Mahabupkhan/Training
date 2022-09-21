import java.util.Scanner;
class PairOfSum{
public static void main(String[] args){
	System.out.println("Enter the size of the array : ");
	Scanner scan=new Scanner(System.in);
	int size=scan.nextInt();
	int[] a=new int[100];	
	for(int i = 0;i<size;i++)
		a[i]=scan.nextInt();
	System.out.println("Enter the sum :");
	int sum=scan.nextInt();
	int diff=0;
	for(int i = 0;i<size;i++){
			diff=sum-a[i];
			for(int j = i+1;j<size;j++){
		if(sum>a[i] && a[j]==diff){
				System.out.println(a[i]+" "+a[j]);
						
			}
			}
		
		}
	
}
}