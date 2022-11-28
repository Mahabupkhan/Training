import java.util.Scanner;
class Que3{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of Strings : ");
		int n=scan.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
			arr[i]=scan.next();
		for(int i=0;i<n;i++){
			System.out.print("String "+(i+1)+" : ");
			ArrangeOrder(arr[i]);
		}
		
	}
	public static void ArrangeOrder(String str){
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if((int)ch[i]<(int)ch[j]){
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]);
		System.out.println();
	}
}