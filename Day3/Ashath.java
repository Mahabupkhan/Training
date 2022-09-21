import java.util.Scanner;
class Ashath{
public static void main(String[] args){

int size;
int a[]=new int[100];
System.out.println("Enter array size : ");
Scanner s=new Scanner(System.in);
size=s.nextInt();

for(int i =0;i<size;i++){
a[i]=s.nextInt();
System.out.println(a[i]);
}


}
}