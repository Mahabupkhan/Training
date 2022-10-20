import java.util.Scanner;
class Closest{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		
		System.out.println("Enter the target value : ");
		int target=scan.nextInt();
		int m=1;
		for(int i=0;i<size;i++){
			int flag1=0;
			for(int j=i+1;j<size;j++){
				int flag2=0;
				for(int k=j+1;k<size;k++){
					
					if(arr[i]+arr[j]+arr[k]==target+(m) || arr[i]+arr[j]+arr[k]==target-(m)){
						System.out.println("Sum is : "+(arr[i]+arr[j]+arr[k]));
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						flag1=1;
						flag2=1;
						break;
						
					}
					
					
				}
				if(flag2==1){
					break;
					}
			}
			m++;
			if(flag1==1){
				break;
			}
			if(flag1==0)
			i--;
		}
		
		
	}
}