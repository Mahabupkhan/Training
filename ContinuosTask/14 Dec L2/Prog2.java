import java.util.Scanner;
class Prog2{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=scan.next();
		int size=0;
		int ans=FindLongSubstring(str);
		System.out.println(ans  );
	}
	public static int FindLongSubstring(String str){
		char[] ch=str.toCharArray();
		int n=0;
		for(int i=0;i<ch.length;i++){
			String ans="";	
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					for(int k=i;k<j;k++){
						ans+=ch[k];					
					}
					if(ans.length()>n){
					n=ans.length();
					}
				}
			
			}
		}
		return n;
	}
}