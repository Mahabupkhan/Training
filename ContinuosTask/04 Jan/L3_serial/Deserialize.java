
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
class Deserialize{
	public static void main(String[] args){
		dodeSerialize();
	}
	public static void dodeSerialize(){
		ArrayList<Passenger> arr=new ArrayList<Passenger>();
		try{
			FileInputStream fi=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Java\\ContinuosTask\\04 Jan\\L3 serial\\PassengerDetail.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			for(int i=0;i<5;i++){
				arr.add(oi.readObject());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Name\tAge\tGender\t\tphone no\t\tMail\t\tPickup\tDrop\tSeatNo");
			for(int i=0;i<arr.size();i++)
				System.out.println(arr.get(i));
		}
	}
	
}