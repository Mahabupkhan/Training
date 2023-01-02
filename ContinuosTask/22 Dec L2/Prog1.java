import java.util.Scanner;
class Prog1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		System.out.println("Enter array elements : ");
		int[] arr=new int[size];
		int sum=0;
		
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
			if(i%2==0)
				sum+=arr[i];
		}
		System.out.println("Total robbery : "+sum);
		
	}
}