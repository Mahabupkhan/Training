import java.util.*;
public class Prog8{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int z=0;
		while(z<n){
			arr[z]=scan.nextInt();
			z++;
		}
		int bg=0,total=0;
		for(int i=1;i<n;i++){
			if(arr[bg]<arr[i]){
				bg=i;
			}
		}
		for(int i=0;i<n;i++){
			if(bg!=n-1){
				total=arr[bg]+arr[n-1]+arr[0];
			}
			else if(bg==n-1) {				
			total=arr[bg]+arr[0];
			}
		}
		System.out.println(total);
		//System.out.println(bg);
	}
}