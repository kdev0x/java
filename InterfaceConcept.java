interface Printable{
    public void print();
}

class Car implements Printable{
    public void print(){
        System.out.println("Car");
    }

    public void read(){}
}

class BMW extends Car{}
class Camry extends Car{}

class Shape implements Printable{
    public void print(){
        System.out.println("shape");
    }
}
class Circle extends Shape{}
class Rectangle extends Shape{}

class ProgrammingLanguage implements Printable{
    public void print(){
        System.out.println("Programming Language");
    }
}

class Java extends ProgrammingLanguage{}
class Python extends ProgrammingLanguage{}


public class InterfaceConcept{

    public static void doAction(Printable p){
        p.print();
    }
    public static void main(String[] args) {    
        Car c = new BMW();
        Printable p = new BMW();

       InterfaceConcept.doAction(new Python());
       InterfaceConcept.doAction(new Circle());
       InterfaceConcept.doAction(new Python());
    }   

}
