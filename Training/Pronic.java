import java.util.Scanner;
class Pronic {
public static void main(String[] args){
	//System.out.println("Enter the n value : ");
	//Scanner s=new Scanner(System.in);
		int j;
	for(int m=1;m<=100;m++){
	int n=m;
	
	for(int i=1;i<=n;i++){
		j=n/i;
		if(j-i==1 || j-i==-1){
			System.out.println(n);
			break;}
			}
		}
}
}