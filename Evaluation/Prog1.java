import java.util.Scanner;
class Prog1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		for(int i=0;i<size;i++){
			int greater=-1;
			int check=Integer.MAX_VALUE;
			for(int j=i+1;j<size;j++){
				if(arr[j]>arr[i]){
					
					if(greater<check){
						greater=arr[j];
						check=greater;
					}
				}
			}
			System.out.print(greater+" ");
		}
	}
}