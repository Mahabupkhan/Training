import java.util.Scanner;
class Prog1{
	public static void main(String[] args){
		binary(3);
	}
	public static void binary(int m){
		
		if(m!=0){
		for(int i=0;i<=1;i++){
			
			for(int j=0;j<=1;j++){
				int k;
					for(k=0;k<=1;++k){
						System.out.println(i+" "+j+" "+k);
					}
						
			}
			//System.out.println();
			
		
		}
		}
		for(int i=0;i<m;i++)
			binary(m-1);
	}
}