import java.util.Scanner;
class Brackets2{
public static void main(String[] args){
	System.out.println("Enter brackets :");
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	char[] ch=str.toCharArray();
	int flag=0;
	for(int i=0;i<str.length()-1;i++){
			
		if(ch[i]==40 && ch[i+1]!=41 || ch[i]==91 && ch[i+1]!=93 || ch[i]==123 && ch[i+1]!=125 ){
			flag++;
			++i;
				}
		
		
					}
	if(flag>0)
		System.out.println("False");
	else if(flag==0)
		System.out.println("True");
}
}