import java.util.Scanner;
class Prog09{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		int count=0;
		for(int i=0;i<size;){
			i+=arr[i];
			count++;
		}
		System.out.println(count);
	}
}