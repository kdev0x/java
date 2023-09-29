class Car{
    public void print(){
        System.out.println("Car");
    }
}

class MyCar extends Car{}

class Camry extends Car{
    public void print(){
        System.out.println("Camry");
    }
}

class Maxima extends Car{
    public void print(){
        System.out.println("Maxima");
    }
}


class Plugin{
    public void execute(){
        System.out.println("plugin");
    }
}

class PDFPlugin extends Plugin{
    public void execute(){
        System.out.println("pdf");
    }
}

class HTMLPlugin extends Plugin{
    public void execute(){
    System.out.println("HTML");
   
    }
}

class JsonPlugin extends Plugin{
    public void execute(){
        System.out.println("json");

    }
}

public class SuperRefVsSubRef{

    public static void run(Plugin plugin){
        plugin.execute();
    }

    public static void printThisObject(Car theCar){
        theCar.print();
    }
    public static void main(String[] args) {
        SuperRefVsSubRef.printThisObject(new Car());
        SuperRefVsSubRef.printThisObject(new Camry());
        SuperRefVsSubRef.printThisObject(new Maxima());
        SuperRefVsSubRef.printThisObject(new MyCar());

        Car[] myCars = {
            new Car(),
            new Camry(),
            new Maxima(),
            new Maxima(),
            new Camry(),
            new Camry()
        };
        
        for(Car theCar : myCars){
            theCar.print();
        }

        SuperRefVsSubRef.run(new HTMLPlugin());
        SuperRefVsSubRef.run(new PDFPlugin());
        SuperRefVsSubRef.run(new JsonPlugin());
    }
}
