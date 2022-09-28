import java.util.Scanner;
class LargestNum{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array size : ");
	int size=scan.nextInt();
	String[] arr=new String[size];
	for(int i=0;i<size;i++)
		arr[i]=scan.next();
	/*for(int i=0;i<size;i++)
		System.out.print(arr[i]+" ");*/
		String[] ch=new String[100];
		int j=0;
		int count=0;
		for(int i=0;i<size;i++){
			count++;
			ch[j++]=arr[i].toCharArray();	
				}
		for(int i=0;i<count;i++)
			System.out.println(ch[i]);

}
}