import java.util.Scanner;
//start 6.35 end 7.01
class Prog6{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array Size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=i+1;

		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				int sum=0;
				for(int k=i;k<=j;k++){
					sum+=arr[k];
					if(k!=j)
					System.out.print(arr[k]+" + ");
					else if(k==j)
					System.out.print(arr[k]+" = ");
				}
				System.out.println(sum);
			}
			break;
		}
		
	}
}