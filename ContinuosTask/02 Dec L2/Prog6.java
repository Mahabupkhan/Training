import java.util.*;
public class Prog6{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter String: ");
		char ch[]=scan.next().toCharArray();
		ArrayList<Character> Ans=new ArrayList<Character>();
		Check(ch,0,Ans);
	}
	public static void Check(char[] ch,int temp,ArrayList<Character> Ans){
		System.out.print(Ans+" ");
		for(int i=temp;i<ch.length;i++){
			if(i>temp&&ch[i]==ch[i-1]){
				continue;
			}
			Ans.add(ch[i]);
			Check(ch,i+1,Ans);
			Ans.remove(Ans.size()-1);
		}
	}
}