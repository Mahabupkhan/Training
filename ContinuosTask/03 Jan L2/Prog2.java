import java.util.Scanner;
class Prog2{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter N value : ");
		int n=scan.nextInt();
		int c=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(c++);
				if(j!=i)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}