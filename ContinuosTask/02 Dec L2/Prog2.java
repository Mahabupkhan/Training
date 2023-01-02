import java.util.*;
public class Prog2{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Array size: ");
		int n=scan.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int temp=scan.nextInt();
			list.add(i,temp);
		}
		ArrayList<Integer> Ans=new ArrayList<Integer>();
		Collections.sort(list);
		Check(list,0,Ans);
	}
	public static void Check(ArrayList<Integer> list,int temp,ArrayList<Integer> Ans){
		System.out.print(Ans+" ");
		for(int i=temp;i<list.size();i++){
			if(i>temp&&list.get(i)==list.get(i-1)){
				continue;
			}
			Ans.add(list.get(i));
			Check(list,i+1,Ans);
			Ans.remove(Ans.size()-1);
		}
	}
}