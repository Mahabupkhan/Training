import java.util.Scanner;
class Main3{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("1.Rectangle\n2.Square");
	int uc=scan.nextInt();
	if(uc==1){
		System.out.print("Enter the length : ");
		int length=scan.nextInt();
		
		System.out.print("Enter the breadth : ");
		int breadth=scan.nextInt();
		
		Rectangle R=new Rectangle(length,breadth);
		R.printArea();
		R.printPerimeter();
	}
	else if(uc==2){
		System.out.print("Enter the side : ");
		int side=scan.nextInt();
		Square S=new Square(side);
		S.printSqArea();
		S.printSqPerimeter();
	}
	else{
		System.out.println("Wrong option...");
		main(args);
	}
}
}
class Rectangle{
	int length;
	int breadth;
	//int side;
	void printArea(){
		System.out.println("Area is : "+(length*breadth));
	}
	void printPerimeter(){
		System.out.println("Perimeter is : "+(2*(length+breadth)));
	}
	void printSqArea(){
		System.out.println("Area is : "+(length*length));
	}
	void printSqPerimeter(){
		System.out.println("Perimeter is : "+(4*length));
	}
	public Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public Rectangle(int length){
		this.length=length;
	}
	
}
class Square extends Rectangle{
	public Square(int length){
		super(length);
	}
}
