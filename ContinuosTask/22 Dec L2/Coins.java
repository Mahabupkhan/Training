import java.util.*;
public class Coins{
   static int count=0;
   public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: "); 
        for(int i=0;i<n;i++)
             arr[i]=s.nextInt();
        System.out.println("Enter the coin: ");
        int target=s.nextInt();
		List<List<Integer>> ls=new ArrayList<>();
        findCombinations(0,arr,target,ls,new ArrayList<>());
        System.out.println(ls);
       // System.out.println(Count(0,arr,target,0));
  }
  public static void findCombinations(int ind,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
         if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
                count++;
            }
            return;
         }
         if(arr[ind]<=target){
            ds.add(arr[ind]);
            findCombinations(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
         }
        findCombinations(ind+1,arr,target,ans,ds);
 }
 public static int Count(int ind,int arr[],int target,int count){
	 if(ind==arr.length){
		 if(target==0)
			 count++;
		 return count;
	 }
	 if(arr[ind]<=target){
		count=Count(ind,arr,target-arr[ind],count); 
	 }
	 return Count(ind+1,arr,target,count);
 }	 
}