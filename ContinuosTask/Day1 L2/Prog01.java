import java.util.Scanner;
class Prog01{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		//int[] arr2=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		for(int i=0;i<size;i++){
			if(i!=size-1){
			if(arr[i]<arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				i++;
			}
				
			}
			else
				break;
		}
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		
	}
}