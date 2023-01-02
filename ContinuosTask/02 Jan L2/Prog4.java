import java.util.Scanner;
class Prog4{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.next();
		System.out.println(sizeOfLongSubString(str));
	}
	public static int sizeOfLongSubString(String str){
			int ret=Integer.MIN_VALUE;
			String word="";
			for(int i=0;i<str.length();i++){		
				for(int j=str.length()-1;j>=0;j--){
					String pass="";
					for(int k=i;k<=j;k++){
						pass+=str.charAt(k);
					}
					if(repOrNot(pass)){
						if(pass.length()>ret){
							ret=pass.length();
						word=pass;
						}
					}
					
				}
			}
			System.out.println(word);
			return ret;
	}
	public static boolean repOrNot(String str){
		
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j))
					return false;
			}
		}
		return true;
	}
}