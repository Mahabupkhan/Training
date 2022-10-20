import java.util.Scanner;
class Prog3{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		
		System.out.println("Enter the target value : ");
		int target=scan.nextInt();
		int sum=0;
		int count=0;
		for(int i=0;i<size;i++){
			sum=0;
			
			sum=-(arr[i]);
			for(int j=0;j<size;j++){
				if(i!=j)
				sum+=arr[j];
			}
			if(sum==target)
				count++;
		}
		System.out.println(count);
	}
}