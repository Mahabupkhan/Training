import java.util.Scanner;
class Prog1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=scan.next();
		System.out.println("Enter the pattern : ");
		String p=scan.next();
		
		char[] ch=p.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='*'){
				ch[i]=ch[i-1];
			}
		}
		if()
	}
}