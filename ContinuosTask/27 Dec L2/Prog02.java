import java.util.Scanner;
class Prog02{
	public static void main(String[] args){
		System.out.println("Enter the string : ");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int strong=0;
		int spl=0;
		int num=0;
		int caps=0;
		int norm=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				caps++;
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
				num++;
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
				norm++;
			if(str.charAt(i)>=33 && str.charAt(i)<=47 || str.charAt(i)>=58 && str.charAt(i)<=64)
				spl++;
			 
		} 
		System.out.println("Caps : "+caps+"\nnums : "+num+"\nnorm : "+norm+"\nspl : "+spl);
		if(caps>=1)
			strong++;
		if(num>=3)
			strong++;
		if(spl>=1)
			strong++;
		if(str.length()>=6)
			strong++;
		switch(strong){
			case 1 :
				System.out.println("Weak");
				break;
			case 2:
				System.out.println("Medium");
				break;
			case 3:
				System.out.println("Good");
				break;
			case 4:
				System.out.println("Strong");
			
		}
	}
}