public class Hi 
{ 
static  int a;
public static void main(String[] args) 
{ 
  Hi h=new Hi();
  h.test(1);
  Hi i=new Hi();
  i.test(2);
  System.out.print(a);
   
 } 
 void test(int n){
	 this.a=n;
 }
}