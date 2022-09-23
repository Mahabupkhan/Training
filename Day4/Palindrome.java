import java.util.*;
class Palindrome{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int i;
	System.out.println("Enter the String : ");
	String str=scan.nextLine();
	String str1="";
	for(i=0;i<str.length();i++){
		if(str.charAt(i)>=32 && str.charAt(i)<=64)
			continue;
		else
		str1 += str.charAt(i);
	}	
	String str2="";
		for(i=str1.length()-1;i>=0;i--){
			str2+= str1.charAt(i);
		}
		int count = str2.length()-1;
		int count1=0;
		for(i=0;i<str2.length()-1;i++)
		{
			if(str1.charAt(i) == str2.charAt(i))
				count1++;
		}
		if(count == count1)
			System.out.println("String is Palindrome");
		else
			System.out.println("String Is not a Palindrome");
}	
}