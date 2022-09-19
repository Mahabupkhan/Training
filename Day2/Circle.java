import java.util.Scanner;
class Circle{
public static void main(String[] args){
	System.out.println("Enter the radius : ");
	double r,a,p,pi=3.14;

	Scanner s= new Scanner(System.in);
	r=s.nextDouble();

	a=pi*r*r;
	p=2*pi*r;

	System.out.println("Area of that circle is : "+a);
	System.out.println("Perimeter of that circle is : "+p);
	
	
}
}