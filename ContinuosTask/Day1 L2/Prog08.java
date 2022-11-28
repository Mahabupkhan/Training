import java.util.Scanner;
class Prog08{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=scan.next();
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++){  
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
					if(ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u'){
						char temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
						
					
						
					}
					
				}
				
				
			}
		}
		String result="";
		for(int i=0;i<str.length();i++){
			result+=ch[i];
		}
		System.out.println(result);
	}
}