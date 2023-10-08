abstract class Shape{
    public abstract void draw();
    public void print(){
        System.out.println("shape");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("circle");
    }
}

class Square extends Shape{
    public void draw(){
        System.out.println("square");
    }
}

public class AbstractClassConcept{
    public static void main(String[] args) {        
        
    }   

}
