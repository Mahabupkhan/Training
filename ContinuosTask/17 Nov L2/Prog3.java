import java.util.Scanner;
class Prog3{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		System.out.println("26%1 = "+(26%1));
		System.out.println("1%26 = "+(28%26));
		System.out.println("26%26 = "+(26%26));
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter sum value : ");
		int sum=scan.nextInt();
		int[] temp=new int[size];
		int k;
		int count;
		for(int i=0;i<size;i++){
			k=0;
			count=0;
			for(int j=i;j<size;j++){
				temp[k++]=arr[j];
				count++;
			}
			checkLong(temp,count,sum);
			
		}
}
static int length=0;
static int[] ans;
public static void checkLong(int[] arr,int size,int sum){
	int total=0;
	//int tempcount=0;
	for(int i=0;i<size;i++){
		total+=arr[i];
	}
	ans=new int[size];
	if(total==sum){
		if(size>length){
			length=size;
			for(int i=0;i<size;i++){
				ans[i]=arr[i];
			}
		}
	}
	
}
}