package Day4;

class Car{
    int roll=10; // Instance Variable
    String name="Tiyasha";

    // Instance Method
    public void yourCar(){
        System.out.println(roll);
        System.out.println(name);
    }

    public void yourName(int roll, String name){
        this.roll =roll;
        this.name = name;
        System.out.println(roll);
        System.out.println(name);
    }
    public void myName(int roll, String name){
        System.out.println(this.roll);
        System.out.println(this.name);
    }
}


public class intro00PS {
    public static void main(String[] args) {

        // Creating the obj for Car class
        Car obj1= new Car();

        // Here obj1 is my reference variable , This is called Object Creation of the Class

        // referring to the method of the class


        // Giving the values to our instance variable
        obj1.roll=12;
        obj1.name="Ahana";
        System.out.println("the roll number "+ obj1.name+" is "+ obj1.roll);
        obj1.yourCar();
        System.out.println();
        System.out.println("Another Example");
        System.out.println();
        // Another object of class

        Car obj2= new Car();

        obj2.yourCar();
        System.out.println();
        obj2.myName(10,"ankita");
        System.out.println();
        obj2.roll=14;
        obj2.name="Soumya";

        obj2.myName(10,"ankita");
        System.out.println();

//        System.out.println("the roll number "+ obj2.name+" is "+ obj2.roll);
        obj2.yourCar();
        System.out.println();
        obj2.yourName(12,"sagnik");
        System.out.println();

        obj2.myName(10,"ankita");


    }
}
