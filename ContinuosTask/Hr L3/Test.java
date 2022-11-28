class Test{
	static int i=0;
	public static void main(String[] args){
		
		Test t=new Test();
		t.f1();
		t.f2();
		t1 t1=new t1();
		t1.print();
	}
	public void f1(){
		i++;
		
	}
	public void f2(){
		System.out.println(i);
	}
}
class t1 extends Test{
	public void print(){
		System.out.println(i);
	}
}