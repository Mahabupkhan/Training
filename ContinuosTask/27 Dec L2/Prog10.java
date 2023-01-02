import java.util.Scanner;
class Prog10{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		System.out.println("Enter target : ");
		int k=scan.nextInt();
		for(int i=0;i<size;i++){
			int t=k-arr[i];
			for(int j=i+1;j<size;j++){
				if(t==arr[j]){
					System.out.println("{"+arr[i]+" , "+arr[j]+"}");
				}   
			}
		}
	}
}