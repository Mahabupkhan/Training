import java.util.Scanner;
 class BallBrick{
	public static void main(String[] args){
		Play.detail();
	}	
}
class Play{
	static Scanner scan=new Scanner(System.in);
	 static int size;
	static char[][] arr;
	static int ballCount;
	static int iball;
	static int jball;
	static int initiali;
	static int initialj;
	public static void detail(){
		System.out.println("Enter array size : ");
		size=scan.nextInt();
		arr=new char[size][size];
		initiali=size-1;
		initialj=size/2;
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				arr[i][j]=' ';
			}
		}
		int i=0;
		for(int j=0;j<size;j++)
			arr[i][j]='W';
		int j=0;
		for(i=0;i<size;i++)
			arr[i][j]='W';
		j=size-1;
		for(i=0;i<size;i++)
			arr[i][j]='W';
		i=size-1;
		Ground();
		iball=size-1;
		jball=size/2;
		arr[iball][jball]='O';
		char uc;
		do{
			System.out.print("Enter brick position and type : ");
			int m=scan.nextInt();
			int k=scan.nextInt();
			char type=scan.next().charAt(0);
			arr[m][k]=type;
			System.out.print("Do you want to continue : ");
			uc=scan.next().charAt(0);
		}while(uc!='n');
		System.out.print("Enter ball count : ");
		ballCount=scan.nextInt();
		viewScreen();
		Direction d=new Direction();
		d.getDirection();
	}
	public static void Ground(){
		for(int j=1;j<size-1;j++)
			arr[size-1][j]='G';
	}
		public static void viewScreen(){
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
public class Direction extends Play{
	public  void getDirection(){
		do{
			System.out.print("Enter direction(ST/LD/RD/EX) : ");
			String uc=scan.next();
			int i;
			int j;
			i=iball;
			j=jball;
			switch (uc){
				case "ST":
				System.out.println(iball+" "+jball);
				moveStraight(i,j);
				viewScreen();
				break;
				case "LD":
				i=iball;
				j=jball;
				moveLD(i,j);
				viewScreen();
				break;
				case "RD":
				i=iball;
				j=jball;
				moveRD(i,j);
				viewScreen();
				break;
				case "EX":
				ballCount=0;
				break;
				default:
					System.out.println("Wrong option !!!");
				
			}
		}while(ballCount>0);
		System.out.println("All balls used!!!!!");
	}
	public static void moveStraight(int iball,int jball){
		//System.out.println(iball+" "+jball);
		if(arr[iball][jball]=='W'){
			ballCount--;
			return;
		}
		else if(arr[iball][jball]!=' ' && arr[iball][jball]!='O'){
			arr[iball][jball]=' ';	
			arr[size-1][jball]='O';
			return;
		}
		
			
		moveStraight(iball-1,jball);
	}
	public static void moveLD(int iball,int jball){
		//System.out.println(iball+" "+jball);
		if(arr[iball][jball]=='W'){
			if(iball==0){
				ballCount--;
				Ground();
				arr[initiali][initialj]='O';
				System.out.println("-------ball lost!!!-------");
				
				return;
			}
			moveRD(iball-1,jball+1);
			return;
		}
		else if(arr[iball][jball]!=' ' && arr[iball][jball]!='O'){
			arr[iball][jball]=' ';
			Ground();
			arr[size-1][jball]='O';
			arr[initiali][initialj]='G';
			return;
		}
		
		moveLD(iball-1,jball-1);
	}
	public static void moveRD(int iball,int jball){
		System.out.println(iball+" "+jball);
		if(arr[iball][jball]=='W'){
			if(iball==0){
				ballCount--;
				Ground();
				arr[initiali][initialj]='O';
				System.out.println("--------ball lost!!!!-------");
				return;
			}
			moveLD(iball-1,jball-1);
			return;
		}
		else if(arr[iball][jball]!=' ' && arr[iball][jball]!='O'){
			arr[iball][jball]=' ';
			Ground();
			arr[size-1][jball]='O';
			return;
		}
		
		moveRD(iball-1,jball+1);
	}
}
