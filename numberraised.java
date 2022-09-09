
public class numberraised
{
    int a, b, c, x;

    System.out.println("Enter the value of a: ");
    scanner scan = new scanner(System.in);
	a=scan.nextInt();
   System.out.println("Enter the value of b: ");
    b=scan.nextInt();
    
    c = 1;
    x = b;
    while(b!=0)
    {
        c = c * a;
        b = b - 1;
    }
   System.out.println("%d raised to the power %d: %d",a,x,c);
	System.out.println(a 
}