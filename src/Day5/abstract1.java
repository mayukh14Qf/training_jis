package Day5;

// Abstract class
abstract class Season{

    // Non-abstract Method
    public void summer(){
        System.out.println("It is a Summer Season");
    }

    // abstract Method
    public abstract void winter();

}

// If I want to extend the abstract class then I need to define the abstract method
class Month extends Season{
    public void winter(){
        System.out.println("this is the month of winter");
    }
}


class Day extends Month{
    public void winter(){
        System.out.println("in is a cold day");
    }
}


// abstraction in oops
public class abstract1 {
    public static void main(String[] args) {

        // Parent class
         Season s1= new Season(){
             public void winter(){
                 System.out.println("this is winter Season");
             }
         };
         // for creating the object of abstract class you need to define your abstract method
         s1.summer();
         s1.winter();


        // Child class
        Month m1= new Month();
        m1.summer();
        m1.winter();
    }
}
