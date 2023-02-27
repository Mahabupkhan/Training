import java.util.Scanner;
class Prog2{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.next();
		System.out.println(dup(str));
	}
	public static boolean dup(String str){
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();i++){
				if(str.charAt(i)==str.charAt(j))
					return false;
				if(str.charAt(i)>=65 && str.charAt(i)<=90){
					if(str.charAt(i)+32==str.charAt(j))
						return false;
				}
				if(str.charAt(i)>=97 && str.charAt(i)<=122){
					if(str.charAt(i)-32==str.charAt(j))
						return false;
				}
			}
		}
		return true;
	}
}