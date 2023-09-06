class Shape{
    protected String name;

    public Shape(){
        this.name = "shape";
    }

    public Shape(String name){
        this.name = name;
    } 

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void draw(){
        System.out.println("shape.draw");
    }
} 

class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(){
        super("rectangle");
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int width, int height){
        super("rectangle");
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }
}

class XRect extends Rectangle{
    private int x;
    
    public XRect(){
        super(0,0);
        this.x = 0;
    }

    public XRect(int x){
        super(0, 0);
        this.x = x;
    }

    public XRect(int x, int width, int height){
        super(width, height);
        this.x = x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }
}

public class ClassVSObjectInhertance{
    public static void main(String[] args) {
        XRect xr = new XRect(5, 5, 5);
        xr.draw();
    }

}
