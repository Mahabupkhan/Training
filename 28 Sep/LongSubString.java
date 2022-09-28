import java.util.Scanner;
class LongSubString{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a String : ");
	String s=scan.next();
	System.out.print("Enter k value : ");
	int k=scan.nextInt();
	int count;
	int count1=0;
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++){
			count=1;
			if(ch[i]!='1'){
		for(int j=i+1;j<s.length();j++){
				if(ch[i]==ch[j]){
					++count;
					ch[j]='1';
					}
					}
					}
		if(count>=k)
			count1+=count;
		}
		
	System.out.println(count1);
}
}