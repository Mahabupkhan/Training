import java.util.Scanner;
class Prob3{
public static void main(String[] args){
	System.out.println("Enter the size of the array : ");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=scan.nextInt();
	System.out.println("Enter the target value : ");
	int target=scan.nextInt();

	int diff;
	for(int i=0;i<n;i++){
		
		diff=target-arr[irrr];
		for(int j=i+1;j<n;j++){
			if(arr[j]==diff)
				System.out.println("{ "+arr[i]+","+arr[j]+" }");
	
				}
	
		}
}
}