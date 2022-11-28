import java.util.Scanner;
class Prog05{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=scan.next();
		//int j=str.length()-1;
		String str2="";
		for(int i=0,j=str.length()-1;i<str.length()&&j>=0;i++,j--){
			//System.out.println(i+""+j);
			if(str.charAt(i)==str.charAt(j)){
				
			//System.out.println(i+""+j);
				for(int k=i+1;k<j;k++)
					str2+=str.charAt(k);
				break;
			}
			else{
				if(j==0){
					j=str.length()-1;
					i++;
				}
				else
				i--;
			}
		}
		System.out.println(str2+"\n"+str2.length());
	}
	
}