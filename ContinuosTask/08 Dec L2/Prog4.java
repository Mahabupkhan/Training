import java.util.Scanner;
class Prog4{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array size : ");
	int size=scan.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<size;i++)
		arr[i]=scan.nextInt();
	
	System.out.println("Enter the sum value : ");
	int k=scan.nextInt();
	int diff=0;
	for(int i=0;i<size;i++){
		
		for(int j=i+1;j<size;j++){
			if(arr[i]>0)
				diff=k-arr[i];
			else if(arr[i]==0)
				diff=k;
			else if(arr[i]<0){
			diff=-(arr[i]-k);
			}
			if(arr[j]==diff){
				System.out.println("("+arr[i]+","+arr[j]+")");
				
			}
		}
		}
			
	}
}
