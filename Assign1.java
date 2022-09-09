import java.util.Scanner;
class Assign1 {
    public static void main(String[] args) {
       System.out.println("Enter a value : ");
       int a,i;
        Scanner scan = new Scanner(System.in);
	a=scan.nextInt();
	for(i=1;i<=10;i++)
	{
		System.out.println(i +" * "+a+" = "+(a*i));
		
	}
	
	
    }
}