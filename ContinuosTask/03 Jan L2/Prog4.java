import java.util.Scanner;
//start : 6.45 end : 6.55
class Prog4{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=scan.nextLine();
		int l=0,r=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='(')
				l++;
			if(str.charAt(i)==')')
				r++;
		}
		if(l==r)
			System.out.println("0");
		else
			System.out.println("1");
	}
}