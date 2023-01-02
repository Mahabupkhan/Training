public class Main{
	public static void main(String[] args){
		Signal1 sig1=new Signal1();
		Signal2 sig2=new Signal2();
		Signal3 sig3=new Signal3();
		Signal4 sig4=new Signal4();
		Signal5 sig5=new Signal5();
		sig1.changePosition();
		
	}
}

abstract class Signal{
	boolean OddpositionNS;
	boolean OddpositionEW;
	boolean EvenpositionNS;
	boolean EvenpositionEW;
	abstract void showNorthSouth();
	abstract void showEastWest();
	abstract void changePosition();
}
abstract class OddSignal extends Signal{
	void changePosition(){
		if(OddpositionNS){
			OddpositionEW=false;
			EvenpositionNS=false;
		}
	}
	
}
abstract class EvenSignal extends Signal{
	 void changePosition(){
		if(!EvenpositionNS){
			EvenpositionEW=true;
		}
	}
	
}
class Signal1 extends OddSignal{
	
	void showNorthSouth(){
		System.out.print("Signal 1 North south : "+OddpositionNS);
		showEastWest();
	}
	void showEastWest(){
		System.out.println("East West : "+OddpositionEW);
	}
}
class Signal3 extends OddSignal{
	
	void showNorthSouth(){
		System.out.print("Signal 3 North south : "+OddpositionNS);
		showEastWest();
	}
	void showEastWest(){
		System.out.println("East West : "+OddpositionEW);
	}
}
class Signal5 extends OddSignal{
	void showNorthSouth(){
		System.out.print("Signal 5 North south : "+OddpositionNS);
		showEastWest();
	}
	void showEastWest(){
		System.out.println("East West : "+OddpositionEW);
	}
}
class Signal2 extends EvenSignal{
	void showNorthSouth(){
		System.out.print("Signal 2 North South : "+EvenpositionNS);
		showEastWest();
	}
	void showEastWest(){
		System.out.println("East West : "+EvenpositionEW);
	}
}
class Signal4 extends EvenSignal{
	void showNorthSouth(){
		System.out.print("Signal 2 North South : "+EvenpositionNS);
		showEastWest();
	}
	void showEastWest(){
		System.out.println("East West : "+EvenpositionEW);
	}
}