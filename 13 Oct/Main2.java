import java.util.Scanner;
class Main2{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter your name : ");
	String name=scan.next();
	System.out.print("Enter your age : ");
	int age=scan.nextInt();
	System.out.print("Enter ph no : ");
	String phno=scan.next();
	System.out.print("Enter Address : ");
	String Address=scan.next();
	System.out.print("Enter your salary : ");
	int salary=scan.nextInt();
	System.out.println("1.Employee\n2.Manager");
	int uc=scan.nextInt();
	switch(uc){
		case 1:
		Employee E=new Employee(name,age,phno,Address,salary);
		E.printSalary();
		break;
		case 2:
		Manager M=new Manager(name,age,phno,Address,salary);
		M.printSalary();
		break;
		
	}
}
}

class Member{
	String name;
	int age;
	String phno;
	String Address;
	int salary;
	
	
	void printSalary(){
		System.out.println("Name : "+name+"\nAge : "+age+"\nPhone No : "+phno+"\nAddress : "+Address+"\nSalary : "+salary);
	}
	
}
class Employee extends Member{
	String spl;
	String dpt;
	//int salary=18000;
	public Employee(String name,int age,String phno,String Address,int salary){
		this.name=name;
		this.age=age;
		this.phno=phno;
		this.Address=Address;
		this.salary=salary;
	}
	
	
}
class Manager extends Member{
	String spl;
	String dpt;
	//int salary=25000;
	public Manager(String name,int age,String phno,String Address,int salary){
		this.name=name;
		this.age=age;
		this.phno=phno;
		this.Address=Address;
		this.salary=salary;
	}
	
	
}