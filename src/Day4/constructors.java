package Day4;

// Constructor Overloading
class Student{
    int age;
    String name;

    // Non-parameterized Constructor
    public Student(){
        System.out.println("in Default constructor");
    }

    //parameterized constructor
    public Student(int i){
        System.out.println("in single parameterized constructor");
    }
    public Student (int i , int j){
        System.out.println("in Double parameterized constructor");
    }

    // Copy Constructor

    public Student(Student s1){
        this.age=s1.age;
        this.name=s1.name;
        System.out.println("in copy constructor of student class");
    }
    public Student(father f1){ // Reference
        System.out.println("In copy constructors of father class");
    }

    public void rollNo(int roll){
        System.out.println(roll);
    }
}
class father{
    public void age(int age1){
        System.out.println(age1);
    }
}

public class constructors {
    public static void main(String[] args) {
        father f= new father();
        Student s1= new Student(); // WE are creating the object
        s1.rollNo(14);
        Student s2= new Student(f);
        Student s3= new Student(s1);

    }
}
