import java.util.Scanner;
class Prog5{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array size : ");
	int size=scan.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<size;i++)
		arr[i]=scan.nextInt();
	
	for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(arr[i]<arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	/*for(int i=0;i<size;i++){
		System.out.print(arr[i]+" ");
	}*/
	
	System.out.println("Mulplication of "+arr[0]+" "+arr[1]+" "+arr[2]+" is : "+(arr[0]*arr[1]*arr[2]));
}
}