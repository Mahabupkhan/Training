import java.util.Scanner;
class Prog1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String tr=scan.nextLine();
		System.out.println("Enter Odd/Even : ");
		String oe=scan.next();
		System.out.println(ReverseSent(tr,oe));
	}
	public static String ReverseSent(String str,String oe){
		int size=1;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==' ')
				size++;
		String[] words=new String[size];
		for(int i=0;i<size;i++){
			words[i]="";
		}
		int k=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' ')
				words[k]+=str.charAt(i);
			else
				k++;
		}
		//for(int i=0;i<words.length;i++)
			//System.out.print(words[i]+" ");
		
		int checker;
		if(oe.equals("odd")){
			checker=1;
		}
		else{
			checker=0;
		}
			for(int i=0;i<words.length;i++){
				if((i+1)%2==checker){
					words[i]=reverse(words[i]);
				}
			}
			String ans="";
			for(int i=0;i<words.length;i++)
				ans+=words[i]+" ";
		
		return ans;
	}
	public static String reverse(String str){
		String ans="";
		for(int i=str.length()-1;i>=0;i--)
			ans+=str.charAt(i);
		return ans;
	}
}