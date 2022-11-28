import java.util.Scanner;
class prog3{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("1.TRAPS\n2.TRAPSSEQ");
		int uc=scan.nextInt();
		switch(uc){
			case 1:
			System.out.println("ENter X value : ");
		int x=scan.nextInt();
		System.out.println("Enter y value : ");
		int h=scan.nextInt();
			System.out.println(TRAPS(x,h));
			break;
			case 2:
			System.out.println("Enter N1 : ");
		int n1=scan.nextInt();
		System.out.println("Enter n2 : ");
		int n2=scan.nextInt();
		System.out.println("Enter y value : ");
		int y=scan.nextInt();
		int size=(n2-n1)+1;
		//System.out.println(size);
		int[] arr=new int[size];
		int k=0;
		for(int i=n1;i<=n2;i++)
			arr[k++]=i;
		//for(int i=0;i<size;i++)
		//	System.out.print(arr[i]+" ");
		//System.out.println();
		
		for(int i=0;i<size;i++){
			if(y<3){
				y=3;
			}
			if(TRAPS(arr[i],y)){
				System.out.print(arr[i]+" ");
				y=y+2;
				continue;
			}
			else{
				y=y-1;
				continue;
			}
				
			}
			break;
		}
		
	}
	//static boolean traps=false;
	public static boolean TRAPS(int x,int y){
		if(x==y){
			//System.out.println(x+" and "+y+" are TRAPS");
			return true;
			
		}
		else if((x%y==0) || (y%x==0)){
			//System.out.println(x+" and "+y+" are TRAPS");
			return true;
			
		}
		else if(x<y){
			//System.out.println(x+ " and "+y+" are not TRAPS");
			return false;
			}
		else{
			int sum=0;
			int temp=x;
			while(temp>0){
				int rem=temp%10;
				sum+=rem;
				temp=temp/10;	
			}
			
			return TRAPS(sum,y);
			
		}
		
		
	}
	public static void TRAPSSEQ(){
		System.out.println("Enter N1 : ");
		int n1=scan.nextInt();
		System.out.println("Enter n2 : ");
		int n2=scan.nextInt();
		System.out.println("Enter y value : ");
		int y=scan.nextInt();
		int size=(n2-n1)+1;
		//System.out.println(size);
		int[] arr=new int[size];
		int k=0;
		for(int i=n1;i<=n2;i++)
			arr[k++]=i;
		//for(int i=0;i<size;i++)
		//	System.out.print(arr[i]+" ");
		//System.out.println();
		
		for(int i=0;i<size;i++){
			if(y<3){
				y=3;
			}
			if(TRAPS(arr[i],y)){
				System.out.print(arr[i]+" ");
				y=y+2;
				continue;
			}
			else{
				y=y-1;
				continue;
			}
				
			}
		}
		
	}
