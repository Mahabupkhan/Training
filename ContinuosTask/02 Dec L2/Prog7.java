import java.util.Scanner;
class Prog7{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		FindMaxProfit(arr,0,0);
	}
	public static void FindMaxProfit(int[] arr,int index,int profit){
		if(index==arr.length){
			System.out.println("Total profit is : "+profit);
			return;
		}
		int small=0;
		int big=0;
		for(int i=index+1;i<arr.length;i++){
			if(arr[index]<=arr[i])
				small=arr[index];
		}
		int j;
		for(int j=index+1;i<arr.length;i++){
			if()
		}
	
		
		profit+=(big-small);
		FindMaxProfit(arr,index,profit);
		
		
	}
}