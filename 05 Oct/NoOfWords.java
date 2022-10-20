import java.util.*;
class NoOfWords{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Sentences: ");
		String str = scan.nextLine();
		NoOfWords obj = new NoOfWords();
		System.out.println("No of words= "+obj.Count(str));
	}
	public int Count(String str){
		int count=0;
		char arr[] = str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]!>64 ){
				count++;
			}
		}
		return count+1;
	}
}