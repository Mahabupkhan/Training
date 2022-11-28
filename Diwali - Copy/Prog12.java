import java.util.*;
public class Prog12{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String str1=scan.next();
		System.out.println("Enter the Second String: ");
		String str2=scan.next();
		int[] temp = new int[str2.length()+1];
        temp[0] = 1;
		int min;
        for(int i=1;i<=str1.length();i++) {
		   if(i<str2.length()){
			   min=i;
		   }
		   else{
			   min=str2.length();
		   }
            for(int j=min;j>=1;j--) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    temp[j] += temp[j-1];
                }
            }
		}
		System.out.println("output: "+temp[str2.length()]);
	}
}