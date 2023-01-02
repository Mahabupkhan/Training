import java.util.Scanner;
class Prog08{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<size;i++){
			int sum=arr[i];
			if(sum==0){
				flag=true;
				break;
			}
				
		   for(int j=0;j<=i;j++){
			   sum+=arr[j];
		   }
		   if(sum==0){
			   flag=true;
			   break;
		   }
		}
		System.out.println(flag);

}
}