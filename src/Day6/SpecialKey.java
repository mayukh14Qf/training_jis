package Day6;

//Here we are importing our Custom class from different package named as Day5
import java.util.*;
import Day5.encap;

class Training{
    int roll; // Belongs the particular object of the class
    static int age; // Belongs to class only , it does not depend on the object creation

    public void read(){
        System.out.println("my roll no is "+(this.roll));
        System.out.println("my age is "+(age));
    }
}



public class SpecialKey {
    public static void main(String[] args) {

        // implementing day5 encap class in day6 package class.
        Scanner sc= new Scanner(System.in);
        encap e= new encap();
        e.a=45;
        e.b=45;
        e.print();

        // final Key word

        int a=10;
        a=14;
        System.out.println(a);

        final int b=12; // Constant for my Java
        final String name= "Soumya"; //

        // Non-Final variable
        String name1="sagnik";
        name1= "Ahana";
        System.out.println(name1);

        // Creating the object of Training

        Training.age=14;

        Training obj1= new Training();
        obj1.roll=14;
        obj1.read();

        Training.age=18; // Way of using static method

        Training obj2= new Training();
        obj2.roll=67;
        obj2.read();



    }
}
