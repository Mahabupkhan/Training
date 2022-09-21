import java.util.Scanner;
class CountSentence{
public static void main(String[] args){
	int alphabets=0,space=0,numbers=0,splchar=0;
	System.out.println("Enter a string :");
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	char[] ch=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
	if(ch[i]>=97 && ch[i]<=122 || ch[i]>=65 && ch[i]<=90) alphabets++;

	else if(ch[i]==32) space++;

	else if(ch[i]>=48 && ch[i]<=57) numbers++;

	else splchar++;

	
	}
	System.out.println("Total No.of Alphabets is : "+alphabets);

	System.out.println("Total No.of Spaces is : "+space);

	System.out.println("Total No.of Numbers is : "+numbers);

	System.out.println("Total No.of Special Characters is : "+splchar);
	
}
}