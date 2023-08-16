class Student{ /* class members */
    int id;
    String name;
    int age;
    Teacher teacher;

    Student(int id, String name, int age, Teacher teacher){
        this.id = id;
        this.age = age;
        this.name = name;
        this.teacher = teacher;
    }

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

public class ClassVsObjectV2{

    public static void changeThisValue(int x){
        x = x * 2;
        System.out.println(x);
    }

    public static void changeThisObject(Student student){
        student = new Student(370, "Jojo", 17, null);
        System.out.println(student.name);
    }
    public static void main(String[] args) {
        /* pass-by-value or pass-by-reference */
        /* parameter(variable) vs argument(value) */
        
        int x = 50; /* data -> value */
        int y = x;
        y = 22;

        Student s = new Student(10, "Khalid", 15, null); /* s -> 0x2fbd -> object[..]*/
        ClassVsObject.changeThisObject(s);
        System.out.println(s.name);
        // Student b = s;
        // b.id = 533;

        // ClassVsObject.changeThisValue(data);
        // System.out.println(data);

        System.out.println(x);
        System.out.println(y);

        System.out.println(s.id);

    }
}
