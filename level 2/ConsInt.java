import java.util.Scanner;
class ConsInt{
public static void main(String[] args){
	System.out.println("Enter the array size : ");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int[] arr=new int[n];
	int temp=0;
	for(int i=0;i<n;i++)
		arr[i]=scan.nextInt();

	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
	
					}
	
			}
	
		}
	//for(int i=0;i<n;i++)
		//System.out.print(arr[i]+" ");
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(arr[i]==arr[j])
				System.out.println("Array doesn't contain consecutive integers as element "+arr[i]+" is repeated");
				
	
				}
	
		}
	int flag=0;
	outerloop:
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(arr[i]-arr[j]==1 || arr[i]-arr[j]==-1){
				flag=1;
				break;}
			else if(arr[i]-arr[j]!=1 || arr[i]-arr[j]!=-1){
				flag=0;	
				break outerloop;}
				
}
}
	if(flag==1)
		System.out.println("Array contains consecutive integers from "+arr[0] +"to "+arr[n-1]);
	else
		System.out.println("Array doesn't contain consecutive integers");
}
}