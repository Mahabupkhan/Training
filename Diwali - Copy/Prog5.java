import java.util.*;
import java.io.*;
public class Prog5{
	public static void main(String[] args){
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter the array size: ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int z=0;
		while(z<n){
			arr[z]=scan.nextInt();
			z++;
		}
		System.out.println("Enter the sum value: ");
		int k=scan.nextInt();
		int i=0,j=0,total=0;
		int len = Integer.MIN_VALUE;;
		while(i<n){
			total+=arr[i];
			if(total<k){
				i++;
			}
			else if(total == k){
				len=Math.max(len, i-j+1);
				i++;
			}
			else if(total>k){
				while(total>k){
					total-=arr[j];
					j++;
				}
				if(total==k){
					len = Math.max(len,i-j+1);
				}
				i++;
			}
		}
		System.out.println("output: "+len);
	}
}