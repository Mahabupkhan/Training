import java.util.*;
public class Prog3{
static int count(int arr[],int n,int sum){
	if (n <= 0)
        return 0;
	else if (sum < 0)
        return 0;
	else if(sum==0)
		return 1;
	 return count(arr, n - 1, sum) + count(arr, n, sum - arr[n - 1]);
}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the arr size: ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int k=0;
		while(k<n){
			arr[k]=scan.nextInt();
			k++;
		}
		System.out.println("Enter the sum: ");
		int sum=scan.nextInt();
		System.out.println(count(arr,n,sum));
	}
}