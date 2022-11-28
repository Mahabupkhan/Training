import java.util.*;
public class Prog9{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first array size: ");
		int n1=scan.nextInt();
		System.out.println("Enter the second array size: ");
		int n2=scan.nextInt();
		int arr[]=new int[n1];
		int arr1[]=new int[n2];
		System.out.println("Enter the First array elements..");
		for(int i=0;i<n1;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the Second array elements..");
		for(int i=0;i<n2;i++){
			arr1[i]=scan.nextInt();
		}
		
		int a[]=new int[n1+n2];
		for(int i=0;i<(n1+n2);i++){
			if(i<n1){
				a[i]=arr[i];
			}
			else {
				a[i]=arr1[i-n1];
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length;j++){
				if(a[j-1]>a[j]){
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		int f=a.length%2,k=a.length/2;
		float f1,f2=a[k-1],f3=a[k];
		if(f==1){
			System.out.println("Median is: "+a[k]);
		}
		else{
			f1=(f2+f3)/2;
			System.out.println("Median is: "+f1);
		}
	}
}