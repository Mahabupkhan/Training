import java.util.Scanner;
class Magical{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	String s="1221121221221121122";
	char ch[]=s.toCharArray();
	System.out.print("Enter N value : ");
	int n=scan.nextInt();
	int count=0;
	for(int i=0;i<n;i++){
		if(ch[i]=='1')
			++count;	
	
				}

		System.out.println("Number of 1 is : "+count);		
}
}