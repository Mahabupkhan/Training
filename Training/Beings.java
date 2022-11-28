class Beings{
public static void main(String[] args){
Cat c=new Cat();
//Dog d=new Dog();
c.eatplace();
c.eat();
c.timing();
c.play();
//d.eatplace();
//d.eat();
//d.timing();
//d.play();
}

}

class DomesticAnimals{
void eatplace(){
System.out.println("Eat at home");
}
void timing(){
System.out.println("3 times per day");
}

}

class WildAnimals{
void eatplace(){
System.out.println("Eat at forest");
}
void timing(){
System.out.println("Once a two day");
}

}
class Cat extends DomesticAnimals{
void eat(){
System.out.println("Milk");
}
void play(){
System.out.println("Play with mouse");
}

}

class Dog extends DomesticAnimals{
void eat(){
System.out.println("Biscuits");
}
void play(){
System.out.println("Play with cats");
}
}
class Tiger extends WildAnimals{
void eat(){
System.out.println("Deer's meat");
}
void play(){
System.out.println("Play with another tiger");
}
}
class Elephant extends WildAnimals{
void eat(){
System.out.println("sothu urundai");
}
void play(){
System.out.println("Play with another elephant");
}
}