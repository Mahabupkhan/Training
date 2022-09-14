import java.util.Scanner;
class minmax{
public static void main(String[] args){
	
	int l,i;
	System.out.println("Enter the length : ");
	Scanner sc = new Scanner(System.in);
	l=sc.nextInt();
	int a[]=new int[l];
	for(i=0;i<l;i++){
	a[i]=sc.nextInt();
		}
	int min = a[0],max = a[0];

	for(i=1;i<l;i++){
		if(a[i]>max)
			max = a[i];
		
		else if (a[i]<min)
			min = a[i];
		
			}
		System.out.println("Max value : "+max); 
		System.out.println("Min value : "+min);
}


}