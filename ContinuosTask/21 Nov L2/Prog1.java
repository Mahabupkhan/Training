import java.util.Scanner;
class Prog1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		int sum=0;
		for(int i=0;i<size;i++){
			if(i!=0){
			if(arr[i]%2==0){
				sum+=arr[i];
			}
			else if(arr[i]%2!=0){
				if(arr[i-1]%2==0){
					continue;
				}
				else{
					sum+=arr[i];
				}
			}
		}
		else{
			sum+=arr[i];
		}
		}
		System.out.println("sum is : "+sum);
	}
}