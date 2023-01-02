import java.util.Scanner;
import java.util.ArrayList;
class Prog7{
	static int coins=0;
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=scan.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>(size);
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++)
			arr.add(scan.nextInt());
		gainCoin(arr);
		System.out.println("Total coins : "+coins);
	}
	public static void gainCoin(ArrayList<Integer> arr){
		if(arr.size()==1){
			coins+=arr.get(0);
			return;
		}
		int index;
		
		if(arr.size()%2==0){
			index=arr.size()/2-1;
		}
		else
			index=(arr.size()/2);
		if(index!=0){
		coins+=arr.get(index-1)*arr.get(index)*arr.get(index+1);
		arr.remove(index);
		}
		else if(index==0){
			coins+=arr.get(index)*arr.get(index+1);
			arr.remove(index);
		}
		
		System.out.println(arr);
		//System.out.println(coins);
		gainCoin(arr);
	}
}