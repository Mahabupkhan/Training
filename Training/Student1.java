public class Student1 
{ 
// Declare instance variables. 
   String name; 
   int rollno; 
// Declare a parameterized constructor with two parameters such as name and rollno. Here, name and rollno are local variables. 
   Student1(String name, int rollno) 
   { 
// Here, the parameter's identifier is same as that of the instance variables name. So, we will use this keyword to differentiate between instance variables and parameters. 
     this.name=name; // Reference to current object. 
     this.rollno=rollno; // Reference to current object. 
    } 
void display() 
{ 
   System.out.println(name+ " "+rollno); 
 } 
public static void main(String[] args) 
{ 
// Create an object of class Student and call the display() method using reference variable s. 
    Student1 s = new Student1("DEEPAK", 123); 
     s.display(); 
  } 
}