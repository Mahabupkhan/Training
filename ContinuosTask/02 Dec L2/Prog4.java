import java.util.Scanner;
class Prog4{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		char[] ch=scan.next().toCharArray();
		permutation(ch,0,ch.length-1);
		
	}
	public static void swap(char[] ch,int i,int j){
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}
	public static void permutation(char[] ch,int l,int r){
		if(l==r){
			for(int i=0;i<ch.length;i++)
				System.out.print(ch[i]);
			System.out.println();
			//return;
		}
		for(int i=l;i<=r;i++){
			swap(ch,i,l);
			permutation(ch,l+1,r);
			swap(ch,i,l);
		}
	}
}