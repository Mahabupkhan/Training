import java.util.Scanner;
class Dungeon2{
	int row;
	int col;
	int gRow;
	int gCol;
	int aRow;
	int aCol;
	int mRow;
	int mCol;
	char[][] arr;
	int Acount=0;
	int Mcount=0;
	int Tcount=0;
	int[] aRowArr;
	int[] aColArr;
	int tRow;
	int tCol;   
	int triggerTogold=0;
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args){
		Dungeon2 D=new Dungeon2();
		D.EnterDetail();
		int que;
		do{
		System.out.println("Enter Que no : \n1.Shortest path of Adventurer\n2.Monster\n3.Route of the adventurer\n4.Add trigger");
		que=scan.nextInt();
		switch(que){
			case 1:
			D.Que1();
			D.view();
			break;
			case 2:
			D.Que2();
			D.view();
			break;
			case 3:
			D.Que3();
			D.view();
			break;
			case 4:
			D.Que4();
			D.view();
			break;
			default:
			System.out.println("Wrong option : ");
			
		}
		}while(que<=4);
		
	}
	public void EnterDetail(){
		System.out.println("Enter row : ");
		this.row=scan.nextInt();
		System.out.println("Enter coloumn : ");
		this.col=scan.nextInt();
		arr=new char[row][col];
		aRowArr=new int[row+col];
		aColArr=new int[row+col];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				this.arr[i][j]='*';
			}
			
		}
		System.out.println("---Enter Gold location---");
		this.gRow=scan.nextInt();
		this.gCol=scan.nextInt();
		this.arr[this.gRow][this.gCol]='G';
		System.out.println("---Enter Adventurer location---");
		this.aRow=scan.nextInt();
		this.aCol=scan.nextInt();
		this.arr[this.aRow][this.aCol]='A';
		
		
	}
	public void Que1(){
		 Acount=0;
		int i=0;
		int m,rowcount=0;
		for(m=this.aRow;m<this.row;){
			if(m==this.gRow){	
				break;
			}
			else if(m!=this.gRow){
				Acount++;	
				aRowArr[i]=m;
				aColArr[i]=aCol;
				i++;
				++rowcount;
				
			}
			if(m>this.gRow)
				m--;
			else if(m<this.gRow)
				m++;
			}
			//int j=i;
		for(int k=this.aCol;k<this.col;){
			if(k==this.gCol){	
				aColArr[i]=k;
				aRowArr[i]=m;
				break;
			}
			else if(k!=this.gCol){
				Acount++;
				aColArr[i]=k;		
				aRowArr[i]=m;
				i++;
			}
			if(k>this.gCol)
				k--;
			else if(k<this.gCol)
				k++;
		}
		System.out.println("Shortest path of Adventurer is : "+Acount);
		
		
	}
	public void Que2(){
		System.out.println("---Enter Monster Location---");
		this.mRow=scan.nextInt();
		this.mCol=scan.nextInt();
		arr[mRow][mCol]='M';
		for(int m=this.mRow;m<this.row;){
			if(m==this.gRow){		
				break;
			}
			else if(m!=this.gRow)
				Mcount++;	
			if(m>this.gRow)
				m--;
			else if(m<this.gRow)
				m++;		
		}
		for(int k=this.mCol;k<this.col;){
			if(k==this.gCol){		
				break;
			}
			else if(k!=this.gCol)
				Mcount++;
			if(k>this.gCol)
				k--;
			else if(k<this.gCol)
				k++;
		}
		System.out.println("Shortest path of Monster is : "+Mcount);
		if(Acount<=Mcount)
			System.out.println("Adventurer won the game!!!!");
		else
			System.out.println("Adventurer loss the game!!!!");
		
		
	}
	public void Que4(){
		System.out.println("Enter Trigger Location : ");
		tRow=scan.nextInt();
		tCol=scan.nextInt();
		arr[tRow][tCol]='T';
		for(int m=this.aRow;m<this.row;){
			if(m==this.tRow){		
				break;
			}
			else if(m!=this.tRow)
				Tcount++;	
			if(m>this.tRow)
				m--;
			else if(m<this.tRow)
				m++;		
		}
		for(int k=this.aCol;k<this.col;){
			if(k==this.tCol){		
				break;
			}
			else if(k!=this.tCol)
				Tcount++;
			if(k>this.tCol)
				k--;
			else if(k<this.tCol)
				k++;
		}
		for(int m=this.tRow;m<this.row;){
			if(m==this.gRow){		
				break;
			}
			else if(m!=this.gRow)
				triggerTogold++;	
			if(m>this.gRow)
				m--;
			else if(m<this.gRow)
				m++;		
		}
		for(int k=this.tCol;k<this.col;){
			if(k==this.gCol){		
				break;
			}
			else if(k!=this.gCol)
				triggerTogold++;
			if(k>this.gCol)
				k--;
			else if(k<this.gCol)
				k++;
		}
		if(Mcount>=Acount)
			System.out.println("\nAdventurer can straightly to gold\nTotal moves : "+Acount);
		else if(Mcount<Acount){
			System.out.println("\nAdventurer goes to the Trigger and then to the Gold\nTotal Moves : "+(Tcount+triggerTogold));
				}
	}
	public void Que3(){
		System.out.println("-----Route of Adventurer----- ");
		
		for(int i=0;i<=Acount;i++){
			System.out.print("("+aRowArr[i]+","+aColArr[i]+")");
		}
		System.out.println();
	}
	public void view(){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(this.arr[i][j]+"   ");
			}
			System.out.println("\n");
		}
			System.out.println("Shortest path of Adventurer is : "+Acount);
	}		
}
	

