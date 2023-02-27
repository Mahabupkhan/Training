import java.util.Scanner;
//start : 5.40 end : 5.52
class Prog1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(i<size/2){
					if(arr[i]>arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				else if(i>=size/2){
					if(arr[i]<arr[j]){
						int t=arr[i];
						arr[i]=arr[j];
						arr[j]=t;
					}
				}
			}
		}
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}
}