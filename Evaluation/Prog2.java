import java.util.Scanner;

public class prog2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value : ");
		int num=sc.nextInt();
		int n =num;
		  int s=n;
		int l=0;
		int arr[][]= new int[n][n];
        while(num>0){
			//System.out.println(num);
			for(int i=l;i<=n-1;i++){
				for(int j=l;j<=n-1;j++){
					if(i==l ||j==l){
						arr[i][j]=num;
					}
				}
			}
			l++;
			num--;
		}
		for(int i=0;i<s;i++){
			for(int j=0;j<s;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
			
	}
}
