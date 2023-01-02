import java.util.Scanner;
class Prog3{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i,size;i++)
			arr[i]=scan.nextInt();
	}
	public static boolean CheckArray(ArrayList<Integer> arr){
		boolean result=true;
		for(int i=0;i<arr.size;i++){
			for(int j=i+1;j<arr.size;j++){
				if(arr[i]!=arr[j]){
					result=false;
					break;
				}
			}
		}
		return result;
	}
	public static void FindMono(int[] arr){
		
	}
}