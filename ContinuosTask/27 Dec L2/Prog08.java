import java.util.Scanner;
class Prog08{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.nextLine();
		boolean result=true;
		//int j=str.length()-1;
		
				for(int j=str.length()-1,i=0;j>=0 && i<str.length();){
					if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z'){
						if(str.charAt(j)>='A' && str.charAt(j)<='Z' || str.charAt(j)>='a' && str.charAt(j)<='z'){
							if(str.charAt(i)==str.charAt(j)){
								i++;
								j--;
								continue;
							}
							else{
								result=false;
								break;
							}
						}
						else
							j--;
					}
					else
						i++;
				}
		
		if(result)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
	}
}