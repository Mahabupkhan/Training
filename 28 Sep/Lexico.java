import java.util.Scanner;
class Lexico{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string : ");
	String s=scan.next();
	char[] ch=s.toCharArray();
	//String s1="";

	for(int i=0;i<s.length();i++){
			if(ch[i]!='1'){
			for(int j=i+1;j<s.length();j++){
				 if(ch[i]==ch[j]){
					ch[j]='1';
				}
			
					}
	
	
				}}

		for(int i=0;i<ch.length;i++){
			if(ch[i]!='1')
				System.out.print(ch[i]);
	
					}
			
	
}
}