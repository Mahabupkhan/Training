import java.util.Scanner;
class Prog01{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int[] input=new int[10];
		int[] arr1=new int[5];
		int[] arr2=new int[5];
		System.out.println("Enter elements 10 : ");
		int k=0;
		int m=0;
		for(int i=0;i<10;i++){
			input[i]=scan.nextInt();
			if(i<5)
				arr1[k++]=input[i];
			else if(i>=5)
				arr2[m++]=input[i];
		}
		System.out.println("First array : ");
		for(int i:arr1)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Second array : ");
		for(int i:arr2)
			System.out.print(i+" ");
			
	}
}