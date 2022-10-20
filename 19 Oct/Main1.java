import java.util.Scanner;
class Main1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the width : ");
		int width=scan.nextInt();
		System.out.print("Enter the height : ");
		int height=scan.nextInt();
		//Rectangle R=new Rectangle(width,height);
		//R.display();
		//RectangleArea RA=new RectangleArea(width,height);
		//RA.display();
		
		Shapes s=new Shapes();
		s.shape=new Rectangle(width,height);
		s.shape.display();
		s.RA=new RectangleArea(width,height);
		s.RA.display();
		
	}
}
class Shapes{
	Rectangle shape;
	RectangleArea RA;
}
class Rectangle{
	int width;
	int height;
	public Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	
	public void display(){
		System.out.println(width+" "+height);
	}
}
class RectangleArea extends Rectangle{
	public RectangleArea(int width,int height){
		super(width,height);
	}
	
	public void read_input(){
		
	}
	public void display(){
		System.out.println("Area : "+(width*height));
	}
}