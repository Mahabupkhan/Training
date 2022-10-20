import java.util.Scanner;
class Prob6{
public static void main(String[] args){
	System.out.println("Enter the string : ");
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	char[] ch=str.toCharArray();
	String s;

	for(int i=0;i<ch.length;i++){
		if(ch[i]!='a' || ch[i]!='e' ch[i]!='i' || ch[i]!='o' || ch[i]!='u' ){
			s+=ch[i];
			continue;
		//if(ch[i]!='a' && ch[i+1]!='a'|| ch[i]!='e' && ch[i+1]!='e' || ch[i]!='i' && ch[i+1]!='i' || ch[i]!='o' && ch[i+1]!='o' || ch[i]!='u' && ch[i]!='u' )
		//	s+=ch[i];
		//else if(ch[i]=='a' && ch[i+1]=='a'|| ch[i]=='e' && ch[i+1]=='e' || ch[i]=='i' && ch[i+1]=='i' || ch[i]=='o' && ch[i+1]=='o' || ch[i]=='u' && ch[i]=='u')
		//	s+=ch[i];
		if(ch[i]=='a' && ch[i+1]!='a'|| ch[i]=='e' && ch[i+1]!='e'|| ch[i]=='i' && ch[i+1]!='i'|| ch[i]=='o' && ch[i]!='o'|| ch[i]=='u' && ch[i]!='u'){
			continue;
			}
	for(int i=0;i<ch1.length;i++)
		System.out.print(ch1[i]);
}
}