import java.util.Scanner;
class Prog3{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.next();
		System.out.println(PaliSubString(str));
	}
	public static boolean PaliSubString(String str){
		//boolean ans=false;
		String word3="";
		String word4="";
		for(int i=0;i<str.length();i++){
			for(int j=str.length()-1;j>=0;j--){
				String word1="";
				String word2="";
				for(int k=i;k<=j;k++)
					word1+=str.charAt(k);
				for(int m=j+1;m<str.length();m++)
					word2+=str.charAt(m);
				if(Pali(word1) && Pali(word2)){
					word3=word1;
					word4=word2;
					System.out.println(word3+"\n"+word4);
					if(word3.length()+word4.length()==str.length())
					return true;
				}
			}
		}
		
		return false;
	}
	public static boolean Pali(String str){
		if(str.length()==1 || str.length()==0)
			return false;
		for(int i=0,j=str.length()-1;i<str.length()&&j>=0;i++,j--){
			if(str.charAt(i)!=str.charAt(j))
				return false;
		}
		return true;
	}
}