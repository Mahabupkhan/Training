import java.util.*;
public class Prog2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n= scan.nextInt();
		int arr[] = new int[n];
		int z=0;
		while(z<n){
			arr[z]=scan.nextInt();
			z++;
		}
		for(int i=0;i<n-1;i++){
			if(arr[i]<= arr[i+1]){
				//System.out.println("I");
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				i++;
			}
		}
		for(int j=0;j<n;j++)
			System.out.print(arr[j]+" ");
	}
}