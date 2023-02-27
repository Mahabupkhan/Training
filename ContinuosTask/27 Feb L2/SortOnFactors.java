import java.util.Scanner;
//start : 11.35
class SortOnFactors{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(FindFactors(arr[i])<FindFactors(arr[j])){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}
	public static int FindFactors(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
				count++;
		}
		return count;
	}
	//end : 11.50
}