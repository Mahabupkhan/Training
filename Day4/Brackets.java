import java.util.Scanner;
class Brackets{
public static void main(String[] args){
	System.out.println("Enter brackets :");
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	char[] ch=str.toCharArray();
	int flag=1;
	for(int i=0;i<str.length()-1;i++){
			flag=1;
		if(ch[i]==40 && ch[i+1]==41){
			flag=0;
			++i;}
		else if(ch[i]==91 && ch[i]==93){
			flag=0;
			++i;}
		else if(ch[i]==123 && ch[i]==125){
			flag=0;
			++i;}
		else
			flag=1;
		
					}
	if(flag==0)
		System.out.println("True");
	else
		System.out.println("False");
}
}