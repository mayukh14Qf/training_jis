package Day5;


// Interface in OOPS


interface Person{
    void run(); // by default, it is public and  abstract
    void walk();
}

class Soumya implements Person{
    public void walk(){
        System.out.println("Soumya is walking slowly");
    }
    public void run(){
        System.out.println("Soumya is Running");
    }
}




public class interface1 {
    public static void main(String[] args) {

        // method 1
        Person p1; // create a reference of Interface
        p1=new Soumya(); // assign the new instance or object to the reference
        p1.run();
        p1.walk();

        //Method 2

        // Or I can do this , use the class which is implementing the Interface
        Soumya s= new Soumya();
        s.run();
        s.walk();

        // Method 3 anonymous class creation

        Person p2 = new Person() {
            @Override
            public void run() {
                System.out.println("I am running ");
            }

            @Override
            public void walk() {
                System.out.println("I am walking");
            }
        };

        p2.walk();
        p2.run();
    }
}
