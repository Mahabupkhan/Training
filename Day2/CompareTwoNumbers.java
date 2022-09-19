import java.util.Scanner;
class CompareTwoNumbers{
public static void main(String[] args){
	System.out.println("Enter two numbers : ");
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b=s.nextInt();
	
	
	if(a==b)
		System.out.println(a+" = "+b);
	if(a!=b)
		System.out.println(a+" != "+b);
	if(a>=b){
		if(a>b)
		System.out.println(a+" > "+b);
		if(a>=b)
		System.out.println(a+" >= "+b);
		}
	if(a<=b){
		if(a<b)
		System.out.println(a+" < "+b);
		if(a<=b)
		System.out.println(a+" <= "+b);
		
		}
		

}
}