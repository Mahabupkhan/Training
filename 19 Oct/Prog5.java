import java.util.Scanner;
class Prog5{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		int k=0;
		while(k<size){
			arr[k]=scan.nextInt();
			k++;
		}
		//for(int j=0;j<size;j++)
			//System.out.print(arr[j]+" ");
		
		int[] c=new int[11];
		int count=0;
		for(int i=0;i<size;i++){
			count=1;
			if(arr[i]!='_'){
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					count++;
					arr[j]='_';
				}
			}
			c[arr[i]]=count;
			
			}
		}
		for(int i=0;i<11;i++)
			System.out.print(i+" ");
		System.out.println();
		
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
		
		int max=c[0];
		int index=0;
		
		for(int i=0;i<c.length;i++){
			if(max<c[i]){
				max=c[i];
				index=i;
			}
		}
		System.out.println();
		System.out.println("Mode : "+index);
		
		
		
	}
}