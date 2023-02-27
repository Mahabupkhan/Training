import java.util.Scanner;
class Prog1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter Target value : ");
		int k=scan.nextInt();
		int count=0;
		int sum;
		for(int i=0;i<size;i++){
			sum=-1*arr[i];
			for(int j=0;j<size;j++){
				if(i!=j){
					sum+=arr[j];
				}
			}
			if(sum==k)
				count++;
		}
		
		System.out.println("Count is : "+count);
	}
}