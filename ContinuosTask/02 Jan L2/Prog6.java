import java.util.Scanner;
class Prog6{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String str=scan.nextLine();
		System.out.println("Enter word1 : ");
		String word1=scan.next();
		System.out.println("Enter word2 : ");
		String word2=scan.next();
		long start=System.currentTimeMillis();
		System.out.println(inbetweenWordsCount(str,word1,word2));
		System.out.println(System.currentTimeMillis()-start);
	}
	public static int inbetweenWordsCount(String str,String word1,String word2){
			int size=1;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==' ' || str.charAt(i)==',' || str.charAt(i)=='.'  )
				size++;
			System.out.println("size : "+size);
			String[] words=new String[size];
			for(int i=0;i<words.length;i++)
				words[i]="";	
			int k=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)!=' ' && str.charAt(i)!=',' && str.charAt(i)!='.')
					words[k]+=str.charAt(i);
				else
					k++;
			}
			for(int i=0;i<words.length;i++)
				System.out.print(words[i]+" ");
			System.out.println();
			int start=0;
			int end=0;
			for(int i=0;i<words.length;i++){
				if(words[i].equals(word1)){
					start=i;
				}
				if(words[i].equals(word2)){
					end=i;
				}
			}
			//System.out.println(start+"\n"+end);
			int sum;
			if(start==end)
				sum=-1;
			else if(start>end)
				sum=start-end-1;
			else
				sum=end-start-1;
			return sum;
				
		
	}
}