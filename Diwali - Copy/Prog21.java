import java.util.*;
public class Prog21{
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(int i=0;i<n;i++){
			if(i==0){
			 System.out.print(arr[i]+" ");	
			}
			else if(arr[i]>arr[i-1]){
			System.out.print(arr[i]+" ");
			}
		}
	}
}