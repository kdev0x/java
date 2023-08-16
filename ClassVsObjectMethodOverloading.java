class MyString{
    String message;

    MyString(){
        this.message = "empty";
    }

    MyString(String message){
        this.message = message;
    }

    String format(){
        return "_" + this.message + "_";
    }

    String format(String symbol){
        return symbol + this.message + symbol;
    }

    String format(String start, String end){
        return start + this.message + end;
    }
}

class MyMath{
    int aVal;
    int bVal;

    MyMath(){
        this.aVal = 0;
        this.bVal = 0;
    }

    MyMath(int value){
        this.aVal = value;
        this.bVal = value;
    }

    MyMath(int a, int b){
        this.aVal = a;
        this.bVal = b;
    }
    int sum(){
        return 1 + 2;
    }

    int sum(int val){
        return val + val;
    }

    int sum(int first, int second){
        return first + second;
    }

    float sum(float first, float second){
        return first + second;
    }

    double sum(double first, double second){
        return first + second;
    }
}
public class ClassVsObjectMethodOverloading{
    public static void main(String[] args) {
        MyMath m = new MyMath();
        MyMath x = new MyMath(120);
        MyMath y = new MyMath(60, 70);
        MyString ms = new MyString("hello world");
        String f1 = ms.format();
        String f2 = ms.format("*");
        String f3 = ms.format("[", "]");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
