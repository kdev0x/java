
/* access modifiers */
class Calculator{
    private int firstNumber;
    private int secondNumber;

    public Calculator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int sum(){
        return this.firstNumber + this.secondNumber;
    }

    public int sub(){
        return this.firstNumber - this.secondNumber;
    }
    
    public int mul(){
        return this.firstNumber * this.secondNumber;
    }

    public int div(){
        if (this.secondNumber == 0){
            return 0;
        }
        return this.firstNumber / this.secondNumber;
    }
}

public class ClassVsObjectAccessModifier{
    public static void main(String[] args) {
        Calculator c = new Calculator(5, 7);
        System.out.println(c.sum());
        System.out.println(c.sub());
        System.out.println(c.mul());
        System.out.println(c.div());
    }
}
