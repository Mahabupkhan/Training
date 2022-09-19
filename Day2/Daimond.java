import java.util.Scanner;
class Daimond{
public static void main(String[] args){
	System.out.println("Enter number of Rows : ");
	Scanner s=new Scanner(System.in);
	int r=s.nextInt();
	int i,j,space;
	space = r-1;
	for(j=1;j<=r;j++){
	for(i=1;i<=space;i++)
		System.out.print(" ");
	space--;
	for(i=1;i<=2*j-1;i++){
	   System.out.print("*");
	}
	   System.out.println("");
	}
     space = 1;
	for(j=1;j<=r;j++){
	for(i=1;i<=space;i++)
		System.out.print(" ");
	space++;
	for(i=1;i<=2*(r-j)-1;i++){
	   System.out.print("*");
	}
	   System.out.println("");
	}
}
}