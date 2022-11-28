import java.util.Scanner;
class Prog06{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string with parentheses : ");
		String str=scan.next();
		char[] ch=str.toCharArray();
		String str2="";
		for(int i=0;i<str.length();i++){
			str2="";
			if(ch[i]=='(' || ch[i]==')'){
			for(int j=0;j<str.length();j++){
				if(i!=j){
					str2+=ch[j];
				}
			}
			checkParentheses(str2);
			//System.out.println(str2);
			}
		}
		
		
	}
	public static void checkParentheses(String str){
		char[] ch=str.toCharArray();
		int open=0;
		int close=0;
		for(int i=0;i<str.length();i++){
			if(ch[i]=='(')
				open++;
			else if(ch[i]==')')
				close++;
			else
				continue;
		}
		if(open==close)
			System.out.print(str+" ");
	}
}