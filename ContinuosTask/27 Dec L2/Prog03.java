import java.util.Scanner;
 public class Prog03{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st string : ");
		String str1=scan.next();
		System.out.println("Enter 2nd String : ");
		String str2=scan.next();
		
		//int[] arr=new int[str2.length()];
		//int k=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
			for(int i=0;i<str2.length();i++){
				for(int j=0;j<str1.length();j++){
					if(str2.charAt(i)==str1.charAt(j)){
						if(min>j)
							min=j;
						if(max<j)
							max=j;
						break;
					}
				}
			}
		
		
		for(int i=min;i<=max;i++)
			System.out.print(str1.charAt(i));
		
		
	}
}
		
		
	
		
	
