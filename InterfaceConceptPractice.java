interface Printable{
    public void print();
}

class Price{
    protected float price;
    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice(){
        return this.price;
    }
}

class PlayStaion extends Price implements Printable {
    public void print() {
        System.out.println("PlayStaion");
    }
}

class PlayStaionFive extends PlayStaion{
    public void print(){
        System.out.println("PlayStaion5");
    }
}


class PlaystaionFour extends PlayStaion{
    public void print(){
        System.out.println("PlayStaion4");
    }
}

class Food extends Price implements Printable{
    public void print() {
        System.out.println("Food");
    }
}

class Brusted extends Food{

    public void print() {
        System.out.println("Brusted");
    }
}

class Mftah extends Food{

    public void print() {
        System.out.println("Mftah");
    }
}


public class InterfaceConceptPractice{
    public static void main(String[] args) {

    }   

}
