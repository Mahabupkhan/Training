import java.util.Scanner;
class Dungeon{
	 static Scanner scan=new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter row : ");
		int row=scan.nextInt();
		System.out.println("Enter coloumn : ");
		int col=scan.nextInt();
		char[][] arr=new char[row][col];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]='o';
			}
			
		}
		System.out.println("---Enter Gold location---");
		int gRow=scan.nextInt();
		int gCol=scan.nextInt();
		arr[gRow][gCol]='G';
		System.out.println("---Enter Adventurer location---");
		int aRow=scan.nextInt();
		int aCol=scan.nextInt();
		arr[aRow][aCol]='A';
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println("\n");
		}
			int count=0;  
		for(int m=aRow;m<row;){
			if(m==gRow){
				//count--;
				break;
			}
			else if(m!=gRow)
				count++;
			
				
			if(m>gRow)
				m--;
			else if(m<gRow)
				m++;
			
		}
		//count--;
		for(int k=aCol;k<col;){
			if(k==gCol){
				//count--;
				break;
			}
			else if(k!=gCol)
				count++;
			if(k>gCol)
				k--;
			else if(k<gCol)
				k++;
		}
		//count--;
		System.out.println("Shortest Path is : "+count);
		
		
	}
	  
	
}