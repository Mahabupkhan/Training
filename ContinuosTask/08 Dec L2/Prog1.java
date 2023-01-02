import java.util.Scanner;
class Prog1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		int size2;
		if(arr[size-1]==9 && arr[size-2]==9)
			size2=size+1;
		else
			size2=size;
		int[] ans=new int[size2];
		int value=0;
		int n=size-1;
		int i=0;
		while(i<=n){
			value=value*10;
			value+=arr[i];
			i++;
		}
		value+=1;
		//System.out.println(value);
		for(int k=size2-1;k>=0;k--){
			int v=value%10;
			ans[k]=v;
			value=value/10;
		}
		for(int k=0;k<size2;k++)
			System.out.print(ans[k]+" ");
			
	}
}