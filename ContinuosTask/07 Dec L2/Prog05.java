import java.util.Scanner;
class Prog05{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		int last=arr[size-1];
		for(int i=size-1;i>0;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+ " ");
	}
}