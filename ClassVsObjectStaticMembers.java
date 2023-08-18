class ObjectCounter{
    public int value;
    public static int counter = 0;

    public ObjectCounter(){
        this.value = 0;
        ObjectCounter.counter++;
    }
    
    public ObjectCounter(int value){
        this.value = value;
        ObjectCounter.counter++;
    }

    public void printValue(){
        System.out.println(this.value);
    }

    public static int getObjectCount(){
        return ObjectCounter.counter;
    }
}

public class ClassVsObjectStaticMembers{
    public static void main(String[] args) {

        ObjectCounter v1 = new ObjectCounter();
        ObjectCounter v2 = new ObjectCounter(2);
        ObjectCounter v3 = new ObjectCounter(3);
        ObjectCounter v4 = new ObjectCounter();
        
        System.out.println(ObjectCounter.getObjectCount());
        
       
    }
}
