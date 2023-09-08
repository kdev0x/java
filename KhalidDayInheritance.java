class A{
    private int a;
    protected float b;
    public String c;

    public A(){
        this.a = 0;
        this.b = 0.0f;
        this.c = null;
    }

    public void setA(int a){
        this.a = a;
    }

    public void setB(float b){
        this.b = b;
    }

    public void setC(String c){
        this.c = c;
    }

    public int getA(){
        return this.a;
    }

    public float getB(){
        return this.b;
    }

    public String getC(){
        return this.c;
    }

    public void setAll(int a, float b, String c){
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }

    public void print(){
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
    }

    final public void rand(){
        System.out.println("rand");
    }
}

class B extends A{
    public int d;
    private float e;
    protected String f;

    public B(){
        super();
        this.d = 0;
        this.e = 0.0f;
        this.f = null;
    }

    public void setD(int d){
        this.d = d;
    }

    public void setE(float e){
        this.e = e;
    }

    public void setF(String f){
        this.f = f;
    }

    public int getD(){
        return this.d;
    }

    public float getE(){
        return this.e;
    }

    public String getF(){
        return this.f;
    }
    
    public void setAll(int a, float b, String c, int d, float e, String f){
        this.setAll(a, b, c);
        this.setD(d);
        this.setE(e);
        this.setF(f);
    }

    public void print(){
        super.print();
        System.out.println(this.d);
        System.out.println(this.e);
        System.out.println(this.f);
    }
}

class C extends A{
    private int g;
    private int h;

    public C(){
        this.g = 0;
        this.h = 0;
    }

    public C(int g, int h){
        this.g = g;
        this.h = h;
    }

    public C(int value){
        this.g = value;
        this.h = value;
    }

    public void setAll(int a, float b, String c , int g, int h){
        this.setAll(a, b, c);
        this.g = g;
        this.h = h;
    }

    public void print(){
        super.print();
        System.out.println(this.g);
        System.out.println(this.h);
    }
}

class D extends A{

}
    
public class KhalidDayInheritance{
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        D objD = new D();

        objA.setA(5);
        objA.setB(3.54f);
        objA.setC("hello world");

        objA.print();

        objB.setAll(5, 1.2f, "hello", 4, 3, "world");
        objB.print();
        
        objC.setAll(1, 2.0f, "hello", 4, 3);
        objC.print();

        objD.print();

        }

}
