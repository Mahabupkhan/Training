import java.util.Scanner;
class Main2{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter array size : ");
	int size=scan.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<size;i++)
		arr[i]=scan.nextInt();
	
	System.out.println("Enter A monkey position : ");
	int A=scan.nextInt();
	System.out.println("Enter B monkey position : ");
	int B=scan.nextInt();
	
	A=A-1;
	B=B-1;
	
	int min,max=0;
	
	min=arr[A]+arr[B]+(B-A);
	//System.out.println("Minimum distance : "+min);
	int j=0;
	for(int i=B;i<size;i++){
		//max+=arr[i];
		++j;
	}
	for(int i=0;i<A;i++){
		//max+=arr[i];
		++j;
	}
	max=arr[A]+arr[B]+j;   
	if(max<min){
		int temp=max;
		max=min;
		min=temp;
	}
	System.out.println("Minimum distance : "+min);
	System.out.println("Maximum distance : "+max);
	}
}