import java.util.Scanner;
class Prog07{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		System.out.println("Enter target value : ");
		int k=scan.nextInt();
		int count=0;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]+arr[j]==k)
					count++;
			}
		}
		System.out.println("count is : "+count);
	}
}