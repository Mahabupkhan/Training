import java.util.Scanner;
 
public class floatingpoint
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double number = input.nextDouble();
        input.close();
        System.out.print((number > 0)? 
                             (number < 1)? "Positive small":
                             (number > 1000000)? "Positive large":
                             "Positive":
                         (number < 0)? 
                             (number < 1)? "Negative small":    
                             (number > 1000000)? "Negative large":
                             "Negative":
                         "Zero");
    }
}