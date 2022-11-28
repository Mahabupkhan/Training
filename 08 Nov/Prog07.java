import java.util.Scanner;
class Prog07{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter N value : ");
		int n=scan.nextInt();
		printAndGate(n);
		
	}
	public static void printAndGate(int n){
		for(int i =0;i<=1;i++){
			for(int j=0;j<=1;j++){
				System.out.println(i+" "+j);
			}
			System.out.println("\n");
		}
	}
}