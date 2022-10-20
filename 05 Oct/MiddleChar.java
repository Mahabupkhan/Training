import java.util.Scanner;
class MiddleChar{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a String : ");
	String str=scan.next();
	//int l=str.length();
	MiddleChar m=new MiddleChar();
	System.out.println(m.FindMid(str));
}


public String FindMid(String str){
	char[] ch=str.toCharArray();
	int l=ch.length;
	//System.out.println(l);
	int mid;
	String str2="";
	if(l%2==1){
		mid=(l/2)+1;
		str2+=ch[mid-1];
		return str2;
	}
	else{
		mid=l/2;
		str2+=ch[mid-1];
		str2+=ch[mid];
		return str2;
	}
}
}