import java.util.Scanner;
class PetrolBunk{
	public static void main(String[] args){
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter current petrol capacity : ");
			int petrol=scan.nextInt();
			System.out.println("Enter petrol bunk array size : ");
			int size=scan.nextInt();
			int[] distance=new int[size];
			int[] capacity=new int[size];
			System.out.println("Enter distance between the petrol bunks : ");
			for(int i=0;i<size;i++)
				distance[i]=scan.nextInt();
			System.out.println("Enter petrol capacity of petrol bunk : ");
			for(int i=0;i<size;i++)
				capacity[i]=scan.nextInt();
			
			System.out.print("Distance : ");
			for(int i=0;i<size;i++)
				System.out.print(distance[i]+" ");
			System.out.println();
			System.out.print("Capacity : ");
			for(int i=0;i<size;i++)
				System.out.print(capacity[i]+" ");
			System.out.println();
			findPetrol(petrol,distance,capacity);
	}
	public static void findPetrol(int petrol,int[] distance,int[] capacity){
		for(int i=0;i<distance.length;i++){
			if(petrol<distance[i]){
				System.out.println("Car cant reach next bunk at index "+i);
				return;
			}
			else
			petrol=petrol-distance[i]+capacity[i];
			
		}
		System.out.println("Available petrol : "+petrol);
	}
}