class Student{ /* data + code */
    /* data -> variables + code -> methods*/
    /* instance variables */
    int id;
    String name;
    int age;
    Teacher teacher;

    /* constructor method */
    Student(int id, String name, int age, Teacher teacher){
        this.id = id;
        this.age = age;
        this.name = name;
        this.teacher = teacher;
    }

    /* code: instance method */
    void printInfo(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.age);
        this.teacher.printInfo();
    }
}

class Teacher{
    int id;
    String name;
    int age;

    Teacher(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    void printInfo(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class ClassVsObject{
    public static void main(String[] args) {
        Teacher t = new Teacher(50, "Abdullah", 48);
        t.printInfo();
        Student k = new Student(654, "Khalid", 14,t); /* k -> refId -> object [id:654 - name:"Khalid" - age:14]*/
        k.printInfo();

    }
}
