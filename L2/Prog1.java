import java.util.Scanner;
class Prog1{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the integer : ");
	int num=scan.nextInt();
	
	num=num+1;
	int num2=0;
	int size=0;
	while(num!=0){
		int rem=num%10;
		num2=(num2*10)+rem;
		num=num/10;
		size++;
		
	}
	System.out.println(num2);
	System.out.println(size);
	
	int[] arr=new int[size];
	for(int i=0;i<size;i++){
		arr[i]=num2%10;
		num2=num2/10;
		System.out.print(arr[i]+" ");
	}
	
	
	
	
	
	
}
}