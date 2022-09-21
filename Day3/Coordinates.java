import java.util.Scanner;
class Coordinates{
public static void main(String[] args){
	int size;
	System.out.print("Enter the size of the array : ");
	Scanner s = new Scanner(System.in);
	 size=s.nextInt();
	int[] arr=new int[100];
	int[] arr2=new int[100];
	int k=0;
	for(int i=0;i<size;i++){
		arr[i]=s.nextInt();
	}
	
	for(int i=0;i<size-1;i++){
	
		for(int j=i+1;j<size;j++){
			
		 if(arr[i]>arr[j]){
				arr2[k]=arr[i];
				k++;
				}
			else
				break;
			}
			

		
		}
	for(int i=0;i<k;i++)
		System.out.print(arr2[i]+" ");
	
		
	
}
}