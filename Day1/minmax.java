import java.util.Scanner;
class minmax{
public static void main(String[] args){
	int a[]=new int[100];
	int l,i,temp;
	System.out.println("Enter the length : ");
	Scanner sc = new Scanner(System.in);
	l=sc.nextInt();
	for(i=0;i<l;i++){
	a[i]=sc.nextInt();
		}
	for(i=0;i<l;i++){

	if(a[i]>a[i+1]){
			temp = a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			}
		}
		int min = a[l-1];
		int max=a[0];
		System.out.println("Min no : "+min +" Max no :"+max);

}


}