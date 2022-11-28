import java.util.Scanner;
class Prog2{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		int[] arr2=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
			arr2[i]=arr[i];
		}
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr2[i]>arr2[j]){
					int temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				int greater;
				if(i!=size-1){
				if(arr[i]==arr2[j]){
					System.out.print(arr[i]+" > "+arr2[j+1]+"  ");
				}
				}
				else{
					System.out.print(arr[i]);
					break;
				}
			}
		}
	}
}