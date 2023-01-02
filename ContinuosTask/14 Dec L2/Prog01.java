import java.util.*;
class Prog01{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter N value : ");
		int n=scan.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			arr.add(i+1);
		}
		Collections. (arr);
		FindLast(arr);
	}
	public static void FindLast(ArrayList<Integer> arr){
		if(arr.size()==1){
			System.out.println(arr);
			return;
		}			
		Collections.reverse(arr);
		for(int i=0;i<arr.size();i+=1){
			arr.remove(i);
		}
		FindLast(arr);
	}
}