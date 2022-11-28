import java.util.Scanner;
class Prog07{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		
		int count=selectSort(arr);
		
		System.out.println(count);
	}
	 public static int selectSort(int[] arr){
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]<arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			int[] arr2=new int[arr.length];
			for(int i=0;i<arr.length;i++){
				arr2[i]=arr[i];
			}
			//for(int i=0;i<arr.length;i++)
				//System.out.print(arr2[i]+ " ");
			
	 int count=0;
        for (int i=0;i<arr.length-1;i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j; 
					
                }     
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;
			++count;
				boolean result=true;
				for(int k=0;k<arr.length;k++){
					if(arr[k]==arr2[k]){
						result=false;
						break;
					}
				}
				if(result)
					break;
				else
					continue;
				
			
        }
				return count;
}
}