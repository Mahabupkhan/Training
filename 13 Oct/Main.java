class Main{
public static void main(String[] args){
	Parent P=new Parent();
	P.print();
	
	Child C=new Child();
	C.print2();
	C.print();
	
}
}

 class Parent{
     void print(){
		System.out.println("This parent class");
    }
}
private class Child extends Parent{
	void print2(){
		System.out.println("This child class");
	}
}