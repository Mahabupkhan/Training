import java.util.Scanner;
class Prog5{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first array size : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter second array size : ");
		int size2=scan.nextInt();
		int[] arr2=new int[size2];
		for(int i=0;i<size2;i++){
			arr2[i]=scan.nextInt();
		}
		if(size>size2)
			findExtraElement(arr,arr2);
		else if(size2>=size)
			findExtraElement(arr2,arr);
		
	}
	public static void findExtraElement(int[] big,int[] small){
		boolean exist;
		for(int i=0;i<big.length;i++){
			exist=false;
			for(int j=0;j<small.length;j++){
				if(big[i]==small[j]){
					exist=true;
					break;
				}		
				}
				if(exist==false)
					System.out.println(big[i]+" is extra element at index "+i);
				
		}
	}
}