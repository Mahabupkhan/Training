import java.util.Scanner;
class TicTacGame{
	static Scanner scan=new Scanner(System.in);
	static char[][] arr={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
	static char winner;
	static boolean gameEnd;
	static char[] equal=new char[3];
	static int c=0;
	public static void main(String[] args){
	play();
	}
	public static void play(){
		//int c=0;
		int flag=0;
		printBoard();
		do{
			
			
			System.out.print("Where to place X : ");
			char x=(char)(scan.nextInt()+48);
			placeXO(x,'X');
			printBoard();
			gameEnd=checkWinner();
			if(gameEnd==false)
				break;
				if(c==5){
				flag=1;
				break;
			}
			System.out.print("Where to place O : ");
			char o=(char)(scan.nextInt()+48);
			placeXO(o,'O');
			printBoard();
			gameEnd=checkWinner();
			
		
		}while(gameEnd);
		if(flag!=1)
		System.out.println("Congratulation!!! "+winner+" have won the game");
		else
			System.out.println("Match Draw!!!!");
	}
	public static void placeXO(char num,char z){
		if(z=='X')
			c++;
		System.out.println(c);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(arr[i][j]==num){
					arr[i][j]=z;
				}
			}
		}
	}
	public static void printBoard(){
		//System.out.println(" --------");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println("\n");
			//System.out.println(" --------");
		}
		//System.out.println("_________________");
	}
	public static boolean checkWinner(){
		
		 
		boolean returning=true;
		for(int i=0;i<3;i++){
			int k=0;
			for(int j=0;j<3;j++){
				equal[k++]=arr[i][j];
			}
			if(equal[0]==equal[1] && equal[1]==equal[2]){
				winner=equal[1];
				returning=false;  
				break;
			}	
		}
		for(int j=0;j<3;j++){
			int k=0;
			for(int i=0;i<3;i++){
				equal[k++]=arr[i][j];
			}
			if(equal[0]==equal[1] && equal[1]==equal[2]){
				returning=false;
				winner=equal[1];
				break;
			}	
		}
		int n=0;
		for(int i=0,j=0;i<3 && j<3;i++,j++){
				equal[n++]=arr[i][j];	
		}
		if(equal[0]==equal[1] && equal[1]==equal[2]){
				winner=equal[2];
				returning=false;		
			}
		int m=0;
		for(int i=0,j=2;i<3 && j>=0;i++,j--){
			equal[m++]=arr[i][j];
		}
			if(equal[0]==equal[1] && equal[1]==equal[2]){
				winner=equal[2];
				returning=false;				
			}	
		return returning;
		}	
}
	
