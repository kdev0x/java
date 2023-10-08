 abstract class ProgrammingLanguage{
    public abstract void print(String messeage);
}

class Java extends ProgrammingLanguage{
    public void print(String messeage){
        System.out.println("System.out.println(\""+messeage+"\");");
    }
}

class Python extends ProgrammingLanguage{
    public void print(String messeage){
        System.out.println("print(\"" + messeage + "\")");
    }
}
public class AbstractClassConceptExample{
    public static void main(String[] args) {    
        Python py = new Python();
        Java jv = new Java();

        py.print("i love python");
        jv.print("i hate java");
    }   

}
