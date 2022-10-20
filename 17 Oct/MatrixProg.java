import java.util.Scanner;
class MatixProg{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the row and column : ");
		int n=scan.nextInt();
		int[][] arr=new int[n][n];
		System.out.println("Enter matrix vlaues : ");
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=scan.nextInt();
				
			}
		}
		
		for(int j=0;j<n;j++){
			for(int i=0;i<n;i++){
				arr[i][j]=arr[j][i];
				
			}
			
		}
		System.out.println(arr.length);
		
	}
}