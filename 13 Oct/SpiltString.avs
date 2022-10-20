// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!\n\n");
        Scanner in=new Scanner(System.in);
       // String name="i.am.an";
        System.out.println("ENter String : ");
        String name=in.nextLine();
        //much very like i
        char A[] = name.toCharArray();
        int count=0;
        int n=A.length;
        for(int i=n-1;i>=0;i--){
            if(A[i]!='.'){
                count++;
            }else{
                for(int j=i+1;j<=i+count;j++){
                    System.out.print(A[j]);
                }
                System.out.print(".");
                count=0;
            }
        }
        for(int i=0;i<n;i++){
            if(A[i]!='.'){
                System.out.print(A[i]);
            }
            else{
                break;
            }
        }
        
    }
}