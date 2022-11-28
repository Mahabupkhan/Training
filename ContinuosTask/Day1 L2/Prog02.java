 import java.util.Scanner;
 class Prog02{
	 public static void main(String[] args){
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter array size : ");
		 int size=scan.nextInt();
		 int[] arr=new int[size];
		 for(int i=0;i<size;i++)
			 arr[i]=scan.nextInt();
		 
		 int count=0;
		 for(int i=0;i<size;i++){
			 if(arr[i]==0)
				 count++;
		 }
		 int sum=0;
		 for(int i=0;i<size;i++){
			//int sum=0;
			 for(int j=i+1;j<size;j++){
				 sum=0;
				for(int k=i;k<=j;k++){
					sum+=arr[k];
					//System.out.print(sum+" ");
				}
				if(sum==0)
					count++;
			 }
		 }
		 System.out.println(count);
	 }
 }