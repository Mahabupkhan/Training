import java.util.Scanner;
class SplitArray{

	public static void main(String[] args){
	SplitArray s=new SplitArray();
	s.Split();
	}
	int[] arr;
	//int size;
	//int half;
	void Split(){
		
	Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the size of the array : ");
	 int size=scan.nextInt();
	this.arr=new int[size];
	 int arr[]=new int[(size/2)];
	 int arr2[]=new int[(size/2)];
	 for(int i=0;i<size;i++)
		 this.arr[i]=scan.nextInt();
	 /*for(int i=0;i<size;i++)
		 System.out.print(arr[i]+" ");*/
	 
	 int j=0;
	 for(int i=0;i<(size/2);i++)
		 arr[j++]=this.arr[i];
	 j=0;
	 for(int i=size/2;i<size;i++)
		 arr2[j++]=this.arr[i];
	 
	 for(int i=0;i<size/2;i++){
		 System.out.print(arr[i]+" ");
	 }
	 System.out.println();
	 for(int i=0;i<size/2;i++)
		 System.out.print(arr2[i]+" ");

	}
}