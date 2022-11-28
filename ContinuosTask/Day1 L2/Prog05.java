import java.util.Scanner;
class Prog05{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		int[] occ=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		
		int occur=0;
		int k=0;
		for(int i=0;i<size;i++){
			occur=0;
			if(arr[i]!='-'){
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					occur++;
					arr[j]='-';
				}
			}
			if(occur%2!=1){
				occ[k++]=arr[i];
			}
			}
		}
		for(int i=0;i<k;i++){
				for(int j=i+1;j<size;j++){
					if(occ[i]<occ[j]){
						int temp=occ[i];
						occ[i]=occ[j];
						occ[j]=temp;
					}
				}
		}
		for(int i=0;i<k;i++)
			if(occ[i]!=0)
			System.out.print(occ[i]+" ");
	}
}