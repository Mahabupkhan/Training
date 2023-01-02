import java.util.Scanner;
class Prog09{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<size-1;i++){
			if(arr[i]==arr[i+1]){
				arr[i]=arr[i]*2;
				arr[i+1]=0;
			}
		}
		for(int i=0;i<size;i++){
			if(arr[i]!=0)
					System.out.print(arr[i]+" ");
		}
		for(int i=0;i<size;i++){
			if(arr[i]==0)
				System.out.print(arr[i]+" ");
		}
	}
}