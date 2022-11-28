import java.util.Scanner;
class Que7{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.nextLine();
		RemoveDup(str);
	}
	public static void RemoveDup(String str){
		int c=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ')
				c++;
		}
		int size=c+1;
		String[] arr=new String[size];
		for(int i=0;i<size;i++)
			arr[i]="";
		int k=0;
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)!=' '){
				arr[k]+=str.charAt(i);  
			}
			else{
				k++;
			}
		}
		for(int i=0;i<size;i++){
			if(arr[i].equals(".")==false){
			for(int j=i+1;j<size;j++){
				if(arr[i].equals(arr[j])){
					arr[j]=".";
				}
			}
			}
		}
		for(int i=0;i<size;i++){
			if(arr[i]!=".")
				System.out.print(arr[i]+" ");
		}
			
	}
}