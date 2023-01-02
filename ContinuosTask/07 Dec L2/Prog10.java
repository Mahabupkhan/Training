import java.util.Scanner;
class Prog10{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2d array size : ");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				arr[i][j]=scan.nextInt();
		}
		int row=-1;
		int check=0;
		for(int i=0;i<m;i++){
			int count=0;
			for(int j=0;j<n;j++){
				if(arr[i][j]==1)
					count++;
			}
			if(count>check){
				check=count;
				row=i;
			}
		}
		if(row==-1)
			System.out.println("No rows contains 1");
		else
		System.out.println("row : "+row);
	}
}