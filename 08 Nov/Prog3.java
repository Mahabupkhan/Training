import java.util.Scanner;
class Prog3{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] a=new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++)
			a[i]=scan.nextInt();
		System.out.println("Enter another array size : ");
		int size2=scan.nextInt();
		int[] b=new int[size2];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size2;i++)
			b[i]=scan.nextInt();
		if(a.length>b.length)
			Prog3.extraElement(a,b);
		else
			Prog3.extraElement(b,a);
		
	}
	public static void extraElement(int a[],int b[]){
		int flag=0;
		for(int i=0;i<a.length;i++){
			flag=0;
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					flag=1;
				}
			}
			if(flag==0)
				System.out.println("Extra element : "+a[i]+"\tIndex : "+i);
		}
	}
}