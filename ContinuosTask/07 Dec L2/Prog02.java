import java.util.Scanner;
class Prog02{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		int max=arr[0];
		for(int i=0;i<size;i++)
			if(arr[i]>max)
				max=arr[i];
		int min=arr[0];
		for(int i=0;i<size;i++)
			if(arr[i]<min)
				min=arr[i];
		int second_min=arr[0];
		for(int i=0;i<size;i++)
			if(arr[i]<second_min && second_min>min)
				second_min=arr[i];
				
		System.out.println("Max difference = "+(max-min));
		System.out.println("Min difference = "+(second_min-min));
	}
}