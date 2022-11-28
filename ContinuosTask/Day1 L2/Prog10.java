import java.util.Scanner;
class Prog10{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int n=scan.nextInt();
		System.out.println(finda2b2(n));
		
	}
	public static boolean finda2b2(int n){
		boolean result=false;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				if((i*i)+(j*j)==n){
					result=true;
					break;
				}
			}
		}
		return result;
	}
}