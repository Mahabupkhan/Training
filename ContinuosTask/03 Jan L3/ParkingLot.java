import java.util.Scanner;
import java.util.ArrayList;
public class ParkingLot{
	static Scanner scan=new Scanner(System.in);
	static ArrayList<Floor> floors=new ArrayList<Floor>();
	static ArrayList<Ticket> ticket=new ArrayList<Ticket>();
	public static void main(String[] args){
		//System.out.println("crct");
	}
	static{
		System.out.println("Enter total floors : ");
		int floor=scan.nextInt();
		for(int i=0;i<floor;i++){
			floors.add(new Floor(i+1,2,2,1));
		}
		//viewFloors();
	}
	public static void viewFloors(){
		System.out.println("FloorNo\t\tCarSlot\t\tBikeSlot\tTruckSlot");
		for(int i=0;i<floors.size();i++){
			System.out.println(floors.get(i));
		}
	}
	public static void doPark(){
		int uc;
		do{
		System.out.println("1.Car\n2.Bike\n3.Truck\4.Exit");
		uc=scan.nextInt();
		switch(uc){
			case 1:
				carPark();
				break;
			case 2:
				bikepark();
				break;
			case 3:
				truckPark();
				break;	
		}
		}while(uc!=4);
		
	}
	public static void carPark(){
		System.out.println("Enter vehicle number : ");
		String regno=scan.next();
		System.out.println("Enter vehicle colour : ");
		String colour=scan.next();
		int k=0;
		if(floors.get(k).carslot>0){
			floors.get(k).cars.add(new Car(regno,colour));
			floors.carslot--;
			ticket.add(new Ticket("MK007",k+1,1));
			System.out.println(ticket.get(k));
		}
	}
	public static void bikepark(){
		System.out.println("Enter vehicle number : ");
		String regno=scan.next();
		System.out.println("Enter vehicle colour : ");
		String colour=scan.next();
	}
	public static void truckPark(){
		System.out.println("Enter vehicle number : ");
		String regno=scan.next();
		System.out.println("Enter vehicle colour : ");
		String colour=scan.next();
	}
}
class Ticket{
	String ParkingLotId;
	int floorNumber;
	int slotNo;
	public Ticket(String ParkingLotId,int floorNumber,int slotNo){
		this.ParkingLotId=ParkingLotId;
		this.floorNumber=floorNumber;
		this.slotNo=slotNo;
	}
	public String toString(){
		return "ParkingLotId : "+ParkingLotId+"\nFloorNo : "+floorNumber+"\nSlotNo : "+slotNo;
	}
}
class Floor{
	int floorno;
	int carslot;
	int bikeslot;
	int truckslot;
	ArrayList<Car> cars=new ArrayList<Car>();
	ArrayList<Bike> bikes=new ArrayList<Bike>();
	ArrayList<Truck> trucks=new ArrayList<Truck>();
	Floor(int floorno,int carslot,int bikeslot,int truckslot){
		this.floorno=floorno;
		this.carslot=carslot;
		this.bikeslot=bikeslot;
		this.truckslot=truckslot;
	}
	public String toString(){
		return "  "+floorno+"\t\t  "+carslot+"\t\t  "+bikeslot+"\t\t  "+truckslot;
	}
	
}
abstract class  Vehicle{
	String regno;
	String color;
}
class Car extends Vehicle{
	public Car(String regno,String color){
		this.regno=regno;
		this.color=color;
	}
}
class Bike extends Vehicle{
	public Bike(String regno,String color){
		this.regno=regno;
		this.color=color;
	}
}
class Truck extends Vehicle{
	public Truck(String regno,String color){
		this.regno=regno;
		this.color=color;
	}
}