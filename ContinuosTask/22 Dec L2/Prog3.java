import java.util.Scanner;
class Prog3{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=scan.next();
		long start=System.currentTimeMillis();
		if(checkPali(str)){
			System.out.println(str);
			System.out.println("Time taken : "+(System.currentTimeMillis()-start));
			return;
		}
		String nonpali="";
		//long start=System.currentTimeMillis();
		for(int i=0;i<str.length();i++){
			int flag=0;
			for(int j=str.length()-1;j>i;j--){
				String str2="";
				for(int k=i;k<j;k++){
					str2+=str.charAt(k);
				}
				if(checkPali(str2)){
					for(int m=j;m<str.length();m++){
						nonpali+=str.charAt(m);
					}
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		System.out.println(nonpali);
		String nonpaliRev="";
		for(int i=nonpali.length()-1;i>=0;i--)
			nonpaliRev+=nonpali.charAt(i);
		System.out.println(nonpaliRev+str);
		System.out.println("Time Taken : "+(System.currentTimeMillis()-start));
	}
	public static boolean checkPali(String str){
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
			str2+=str.charAt(i);
		if(str.equals(str2))
			return true;
		else
			return false;
	}  
}