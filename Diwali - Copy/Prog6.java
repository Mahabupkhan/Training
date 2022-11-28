import java.util.*;
public class Prog6{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first array size: ");
		int n1=scan.nextInt();
		//System.out.println("Enter the second array size: ");
		//int n2=scan.nextInt();
		int arr[]=new int[n1];
		int arr1[]=new int[n1-1];
		System.out.println("Enter the First array elements..");
		for(int i=0;i<n1;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the Second array elements..");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=scan.nextInt();
		}
		int index=0;
		for(int i=0;i<n1;i++){
			if(arr[i]!=arr1[i]){
				index=i;
				break;
			}
		}
		System.out.println("The miss index is: "+index);
	}
}