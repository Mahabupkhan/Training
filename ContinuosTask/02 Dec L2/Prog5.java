import java.util.*;
public class Prog5{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the m and n Size: ");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=scan.nextInt();
			}
		}
		PrintRoute(arr,0,0,0,m,n);
	}
	public static void PrintRoute(int arr[][],int i,int j,int count,int m,int n){
		if(count>=n){
			return;
		}
		for(int a=i;a<=count;a++){
			for(int b=a;b<=count;b++){
				System.out.print(arr[a][b]+" ");
			}
			break;
		}
		for(int a=1;a<m;a++){
			for(int b=count;b<=count;b++){
				System.out.print(arr[a][b]+" ");
			}
			if(a==m-1){
				for(int d=count+1;d<n;d++){
					System.out.print(arr[a][d]+" ");
				}
			}
		}
		System.out.println();
		count++;
		PrintRoute(arr,i,j,count,m,n);
	}
}