import java.util.Scanner;
class Prog2{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.next();
		long start=System.currentTimeMillis();
		System.out.println(Occurence(str));
		System.out.println(System.currentTimeMillis()-start);
	}
	public static String Occurence(String str){
		String ans="";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '){
			int count=1;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					count++;
					ch[j]=' ';
				}
			}
			ans+=""+ch[i]+""+count;
			}
		}
		return ans;
	}
}