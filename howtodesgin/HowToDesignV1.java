class Point{
    private float x;
    private float y;

    public Point(){
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(float xY){
        this.x = xY;
        this.y = xY;
    }

    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    public float getX(){return this.x;}
    public float getY(){return this.y;}
    
    public void setX(float x){this.x = x;}
    public void setY(float y){this.y = y;}

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{this.x, this.y};
    }

}
public class HowToDesign{
    public static void main(String[] args) {
       Point center = new Point();
       Point bottom = new Point(center.getX());
       Point topRight = new Point(bottom.getX(), bottom.getY());
       Point topLeft = new Point(bottom);
    }

}
