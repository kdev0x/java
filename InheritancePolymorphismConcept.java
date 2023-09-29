class Shape{
    private String name;

    public Shape(String name){
        this.name = name;
    }

    public void draw(){
        System.out.println(this.name);
    }
}

class Rectangle extends Shape{
    public Rectangle(){
        super("rectangle");
    }

    public void draw(){
        super.draw();
        System.out.println("/\\");
    }
}

class Circle extends Shape{
    public Circle(){
        super("circle");
    }

    public void draw(){
        super.draw();
        System.out.println("O");
    }
}

class Triangle extends Shape{
    public Triangle(){
        super("triangle");
    }

    public void draw(){
        super.draw();
        System.out.println("^");
    }
}

public class InheritancePolymorphismConcept{
    public static void main(String[] args) {

        Shape [] shapes = {
            new Circle(), new Circle(), new Rectangle(), new Triangle()
        };

        for(Shape s: shapes){
            s.draw();
        }
    }
}
