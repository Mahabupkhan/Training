import java.util.Scanner;
class AlphaRev{
public static void main (String[] args)
   {
	System.out.println("Enter a character :");
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
	char[] ch=s.toCharArray();
		
	for(int i=0;i<s.length();i++){

		if(ch[i]<=90)	System.out.print((char)('A'+('Z'-ch[i]))+" ");
			
		else if(ch[i]<=122)   System.out.print((char)('a'+('z'-ch[i]))+" ");
		
		}
	
}
}