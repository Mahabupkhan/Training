import java.util.Scanner;
class Prog03{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		int[] input=new int[size];
		int positive=0;
		int negative=0;
		int odd=0;
		int even =0;
		int zero=0;
		for(int i=0;i<size;i++){
			input[i]=scan.nextInt();
			if(input[i]>0)
				positive++;
			else if(input[i]<0)
				negative++;
			if(input[i]==0)
				zero++;
			else{
			if(input[i]%2==0)
				even++;
			else if(input[i]%2!=0)
				odd++;
			}
		}
		System.out.println("positve num : "+positive+"\nnegative num : "+negative+"\nzeros : "+zero+"\nodd numbers : "+odd+"\neven numbers : "+even);
	}
}