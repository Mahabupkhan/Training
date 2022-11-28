import java.util.Scanner;
class Que5{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.next();
		if(findDiff(str))
			System.out.println("Equal Difference");	
		else
			System.out.println("Unequal Difference");
		
		
	}
	public static boolean findDiff(String str){
		char[] ch=str.toCharArray();
		int result=0;
		boolean returning=true;
		int diff=ch[0]-ch[1];
		for(int i=0;i<ch.length;i++){
			int flag=0;
			for(int j=i+1;j<ch.length;j++){
			if(ch[i]-ch[j]==diff)
				break;
			else{
				returning=false;
				flag=1;
				break;
			}
			}
			if(flag==1)
				break;
		}
		return returning;
			
		
			
}
}