import java.util.Scanner;
import java.util.Arrays;
class DoubleValue{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int size,i,j;
	System.out.println("Enter the array size");
	size = scan.nextInt();
	int arr[] = new int[size];
	for(i=0;i<size;i++){
		arr[i]=scan.nextInt();
	}
	for(i=0;i<size-1;i++){
	if(arr[i]==arr[i+1]){
			arr[i]=arr[i]*2;
			arr[i+1]=0;
		}
	}
	int arr2[] = new int[size];
	j=0;
	for(i=0;i<=size-1;i++){
		if(arr[i]>0){
		arr2[j++]=arr[i];
		}
	}
	for(i=0;i<=size-1;i++){
		System.out.print(arr2[i]+ " ");
	}
}	
}