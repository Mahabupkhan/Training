import java.util.Scanner;
public class OccurProb{
public static void main(String[] args){
	System.out.println("Enter the size of array : ");
	Scanner s = new Scanner(System.in);
	int size=s.nextInt();
	int[] a =new int[100];
	for(int i=0;i<size;i++){
		a[i]=s.nextInt();
		}
	
		for(int i=0;i<size;i++){
				int occur=1;	
			for(int j=i+1;j<size;j++){
					 if(a[i]==a[j]){
					occur++;
					a[j]=-1;
					} 
					
				
				}
				if(a[i]!=-1)
			System.out.println(a[i]+" "+occur);
				}

}
}