import java.util.Scanner;
class Prog04{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter 1st Array size : ");
		int size1=scan.nextInt();
		int[] arr1=new int[size1];
		for(int i=0;i<size1;i++)
			arr1[i]=scan.nextInt();
		System.out.print("Enter 2nd array size : ");
		int size2=scan.nextInt();
		int[] arr2=new int[size2];
		for(int i=0;i<size2;i++)
			arr2[i]=scan.nextInt();
		for(int i=0;i<size1;i++){
			for(int j=0;j<size2;j++){
				if(arr1[i]==arr2[j])
					arr2[j]='-';
			}
		}
		for(int i=0;i<size1;i++)
			System.out.print(arr1[i]+" ");
		int count=0;
		for(int j=0;j<size2;j++)
			if(arr2[j]!='-'){
			System.out.print(arr2[j]+" ");
			count++;
			}
		System.out.println("\ncount is : "+(size1+count));
		
	}
}