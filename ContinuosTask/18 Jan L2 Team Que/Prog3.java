import java.util.Scanner;
import java.util.ArrayList;
class Prog3{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String arraySize : ");
		int size=scan.nextInt();
		String[] strs=new String[size];
		for(int i=0;i<size;i++){
			strs[i]=scan.next();
		}
		ArrayList<ArrayList> arr=new ArrayList<ArrayList>();
		for(int i=0;i<size;i++){
			if(!strs[i].equals("000000"))
			arr.add(Anagram(strs,strs[i],i));
		}
		System.out.println(arr);
	}
	public static ArrayList<String> Anagram(String[] str,String input,int index){
		ArrayList<String> ans=new ArrayList<String>();
		
		int sum=addAscii(input);
		ans.add(input);
			for(int j=index+1;j<str.length;j++){
				if(!str[j].equals("000000")){
				int sum2=addAscii(str[j]);
				if(sum==sum2){
					ans.add(str[j]);
					str[j]="000000";
				}
				}
			}
		
		return ans;
	}
	public static int addAscii(String str){
		int sum=0;
		for(int i=0;i<str.length();i++)
			sum+=str.charAt(i);
		return sum;
	}
}