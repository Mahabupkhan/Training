import java.util.Scanner;
class SmallestNum{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter three nos : ");
	float a=scan.nextFloat();
	float b=scan.nextFloat();
	float c=scan.nextFloat();
	SmallestNum n=new SmallestNum();
	System.out.println("Smallest number is : "+n.FindSmall(a,b,c));
	
}
public float FindSmall(float a,float b,float c){
	
	if(a<b && a<c)
		return a;
	else if(b<a && b<c)
		return b;
	else
		return c;
}
}