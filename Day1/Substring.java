import java.util.Scanner;
class Substring{
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a string : ");
	String st=s.next();
	System.out.println("Enter starting : ");
	int start =s.nextInt();
	System.out.println("Enter ending : ");
	int end =s.nextInt();
	char b[]=st.toCharArray();
	System.out.print("Splitted Array : ");
	for(int i=start-1;i<end+1;i++)
		System.out.print(b[i]);
}

}