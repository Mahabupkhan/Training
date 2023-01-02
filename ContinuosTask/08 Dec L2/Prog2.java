import java.util.Scanner;
class Prog2{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		for(int i=0;i<size;i++){
			if(arr[i]!='-'){
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j])
					arr[j]='-';
			}
			}
		}
		for(int i=0;i<size;i++){
			if(arr[i]!='-')
				System.out.print(arr[i]+",");
		}
		for(int i=0;i<size;i++)
			if(arr[i]=='-')
				System.out.print("-,");
		}
	}
