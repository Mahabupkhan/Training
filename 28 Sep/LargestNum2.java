import java.util.Scanner;
class LargestNum2{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the array size : ");
	int size=scan.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<size;i++)
		arr[i]=scan.nextInt();

	String s="";

	for(int i=0;i<size;i++){
			while(arr[i]>0){
			s+=arr[i]%10;
			arr[i]=arr[i]/10;
			}
			}
	//System.out.println(s);
	char[] ch=new char[s.length()];
	for(int i=0;i<s.length();i++){
		ch[i]=s.charAt(i);
		//System.out.print(ch[i]+ " ");
		}

	int[] a=new int[s.length()];
	for(int i=0;i<s.length();i++){
	
		a[i]=Character.getNumericValue(ch[i]);
			}

	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){

		int temp=0;
		if(a[i]<a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
			}
}


}


for(int i=0;i<a.length;i++)
	System.out.print(a[i]);
	
	
		
	

	
	

}
}