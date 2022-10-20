import java.util.Scanner;
class Prob1{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the size of the array : ");
	int size=scan.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<size;i++)
		arr[i]=scan.nextInt();
	
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
	}
	}
	//for(int i=0;i<size;i++)
		//System.out.print(arr[i]+" ");
	for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(arr[i]==arr[j]){
				System.out.println("Array doesn't contains consecutive integers as "+arr[i]+" is repeated");
				break;
			}
		}
	}
	
	int[] arr2=new int[size];
	int j=0;
	for(int i=0;i<size;i++){
		for(int m=i+1;m<size;m++){
		if(arr[i]-arr[m]==-1 || arr[i]-arr[m]==1){
			arr2[j++]=arr[i];
			break;
		}
		}

	}
	//int k=arr2.length-1;
	//System.out.println("Array contains "+arr2[0]+" to "+arr2[k]);
	for(int i=0;i<arr2.length;i++){
		if(arr2[i]!=0)
			System.out.print(arr2[i]+" ");
	}
	
		
}
}