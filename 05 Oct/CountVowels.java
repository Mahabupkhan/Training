import java.util.Scanner;
class CountVowels{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the string : ");
	String str=scan.nextLine();
	CountVowels c=new CountVowels();
	System.out.println("No.of vowels : "+c.Count(str));
	
}
public int Count(String str){
	char[] ch=str.toCharArray();
	int count=0;
	for(int i=0;i<ch.length;i++){
	if(ch[i]=='a' || ch[i]=='A' || ch[i]=='e' || ch[i]=='E' || ch[i]=='i' || ch[i]=='I' || ch[i]=='o' || ch[i]=='O' || ch[i]=='u' || ch[i]=='U')
		count++;
	}
	return count;
}
}