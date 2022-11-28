import java.util.*;
public class Prog16{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String array size: ");
		int n=scan.nextInt();
		System.out.println("Enter the Second String array size: ");
		int m=scan.nextInt();
		String arr1[]=new String[n];
		String arr2[]=new String[m];
		for(int i=0;i<n;i++){
			arr1[i]=scan.next();
		}
		for(int i=0;i<m;i++){
			arr2[i]=scan.next();
		}
		String str="";
		String str1="";
		for(int i=0;i<n;i++){
			str+=arr1[i];
		}
		for(int i=0;i<m;i++){
			str1+=arr2[i];
		}
		if(str.equals(str1)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}