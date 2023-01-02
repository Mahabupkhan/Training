import java.util.*;
class Prog1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter N value : ");
		int n=scan.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			arr.add(scan.nextInt());
		}
		FindLast(arr,true);
	}
	public static void FindLast(ArrayList<Integer> arr,boolean flag){
		if(arr.size()==1){
			System.out.println(arr);
			return;
		}
		else{
		for(int i=0;i<arr.size();i+=2){
			System.out.println(i);
			arr.remove(arr.get(i));
		}
		flag=!flag;
		//System.out.println(flag);
		System.out.println(arr);
		if(flag==false)
		FindLast(arr,flag);
	    else
		FindLast2(arr,flag);
		}
}
	public static void FindLast2(ArrayList<Integer> arr,boolean flag){
		if(arr.size()==1){
			System.out.println(arr);
			return;
		}
		for(int i=arr.size()-1;i>=0;i=i-2){
			System.out.println(i);
			arr.remove(arr.get(i));
		}
		flag=!flag;
		//System.out.println(flag);
		System.out.println(arr);
		if(flag==false)
		FindLast2(arr,flag);
	   else
		  FindLast(arr,flag);
			
	}
}