import java.util.Scanner;
class AverageOfNo{
public static void main(String [] args){
	System.out.println("Enter three numbers : ");
	Scanner s=new Scanner(System.in);
	float a=s.nextFloat();
	float b=s.nextFloat();
	float c=s.nextFloat();
	float average =((a+b+c)/3);
	System.out.format("Average is : %.2f",average);
	
}
}