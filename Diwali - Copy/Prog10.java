import java.util.*;
public class Prog10{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first array size: ");
		int n1=scan.nextInt();
		System.out.println("Enter the second array size: ");
		int n2=scan.nextInt();
		int arr[]=new int[n1];
		int arr1[]=new int[n2];
		System.out.println("Enter the First array elements..");
		for(int i=0;i<n1;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the Second array elements..");
		for(int i=0;i<n2;i++){
			arr1[i]=scan.nextInt();
		}
		int k=0,j=0;
		for(int i=0;i<n1;i++){
			for(j=0;j<n2;j++)
				if(arr[i]==arr1[j])
					break;
				if(j==n2)
					System.out.print(arr[i]+" ");
		}
		
	}
}