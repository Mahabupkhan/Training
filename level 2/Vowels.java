import java.util.Scanner;
class Vowels{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the string : ");
	String str=scan.next();
	char[] c=str.toCharArray();
	
	for(int i=0;i<c.length;i++){
		if(c[i]=='a' || c[i]=='e' || c[i]=='i'|| c[i]=='o' || c[i]=='u' ){
			if(c[i+1]=='a' || c[i+1]=='e'|| c[i+1]=='i'|| c[i+1]=='o'|| c[i+1]=='u'){
				i++;
				continue;
					
			}		
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'){
				c[i]='0';
				}
		}
			}
		for(int i=0;i<c.length;i++){
		if(c[i]!='0')
			System.out.print(c[i]);
		}
}
}