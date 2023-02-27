import java.util.Scanner;
//start : 6.20 end : 6.30
class Prog5{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			if(i%3==0 && i%5==0){
				System.out.print("FizzBuzz , ");
			}
			else if(i%3==0)
				System.out.print("Fizz , ");
			else if(i%5==0)
				System.out.print("Buzz , ");
			else
				System.out.print(i+" , ");
		}
	}
}