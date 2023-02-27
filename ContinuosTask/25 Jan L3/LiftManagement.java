import java.util.Scanner;
public class LiftManagement{
	public static void main(String[] args){
		LiftModule lm=new LiftModule();
		LiftModule.Admin a=lm.new Admin();
		while(true){
			System.out.println("1.Admin\2user\3.Exit");
			int uc=scan.nextInt();
			if(uc==1) a.AdminOption();
			else if(uc==2) lm.assignLift();
			else break;
		}
		
	}
}
class Lift{
	int liftNo;
	String direction;
	int currentFloor;
	Lift(int liftNo){
		this.liftNo=liftNo;
		direction="up";
		currentFloor=0;
	}  
	public String toString(){
		return liftNo+"";
	}
}
class LiftModule{
	Scanner scan=new Scanner(System.in);
	static Lift[] lifts=new Lift[5];
	static{
		for(int i=0;i<5;i++){
			lifts[i]=new Lift(i+1);
		}
	}
	class Admin{
		public void AdminOption(){
			while(true){
				System.out.println("1.Maintenance For Lift\n2.Make Use Maintence\n3.Exit");
				int uc=scan.nextInt();
				if(uc==1){
					Maintenance();
				}
				else if(uc==2){
					makeUse();
				}
				else if(uc==3){
					break;
				}
			}
		}
		public void Maintenance(){
			System.out.println("Enter lift number to stop for maintenance : ");
			int no=scan.nextInt();
			for(int i=0;i<lifts.length;i++){
				if(lifts[i].liftNo==no){
					lifts[i].currentFloor=-1;
					break;
				}
			}
			System.out.println("Lift no "+no+" is took under maintenance!!!!");
			liftState();
		}
		public void makeUse(){
			System.out.println("Lifts Under Maintenance");
			System.out.println("------------------------");
			for(int i=0;i<lifts.length;i++){
				if(lifts[i].currentFloor==-1)
					System.out.print("L"+lifts[i]+"\t");
			}
			System.out.println();
			System.out.println("Enter Lift Number to make use : ");
			int  n=scan.nextInt();
			for(int i=0;i<lifts.length;i++){
				if(lifts[i].liftNo==n && lifts[i].currentFloor==-1){
					lifts[i].currentFloor=0;
					break;
				}
			}
			System.out.println();
			//liftState();
		}
	}
	public void liftState(){
		for(int i=0;i<lifts.length;i++)
			System.out.print("L"+lifts[i].liftNo+"\t");
			System.out.println();
		for(int i=0;i<lifts.length;i++)
			System.out.print(lifts[i].currentFloor+"\t");
			System.out.println();
	}
	public void assignLift(){
		liftState();
		System.out.println("Enter the current Floor : ");
		int current=Scan.nextInt();
		if(current<=5){
		boolean c=true;
		while(c){
		System.out.println("Enter the destination Floor : ");
		int destination=scan.nextInt();
		if(destination<=5){
			c=false;
			int min=Integer.MAX_VALUE;
			Lift lift;
			for(int i=0;i<lifts.length;i++){
				if(lifts[i].currentFloor!=-1){
					if(min>Math.abs(current,lifts[i].currentFloor)){
						min=Math.abs(current,lifts[i].currentFloor);
						lift=lift[i];
					}
				}
			}
		}
		else{
			System.out.println("Invalid destination floor");
		}
		}
		}
		else{
			System.out.println("Invalid currentFloor!!!");
			assignLift();
		}
		
	}
}