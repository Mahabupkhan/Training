import java.util.Scanner;
class Prog06{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<size;i++){
			if(checkFibo(arr[i]))
				System.out.print(arr[i]+" ");
			else 
				continue;
		}
		
	}
	public static boolean checkFibo(int n){  
		//double squareN=Math.pow(n,n);
		if(checkSquare(((5*Math.pow(n,n))-4)) )
			return true;
		else 
			return false;
			
	}
	public static boolean checkSquare(double n){
		boolean result=false;
		for(int i=1;i<=1000;i++){
			if(i*i==n){
				result=true;
				break;
			}
			
			
		}
		return result;
	}
}