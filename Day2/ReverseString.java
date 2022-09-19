import java.util.Scanner;
class ReverseString{
public static void main(String[] args){

	System.out.println("Enter the string : ");

	Scanner s = new Scanner(System.in);
	String str=s.nextLine();

	int l=str.length();
	char[] ch=str.toCharArray();
	
	for(int i=l-1;i>=0;i--)
		System.out.print(ch[i]);
	
}
}