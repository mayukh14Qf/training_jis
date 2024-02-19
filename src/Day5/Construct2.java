package Day5;


// Constructor over Ridding by using Super(),this()

// every Constructor by default has its own super() which will call its parent default constructor.


class GrandFather {
    // Default Constructor
    public GrandFather(){
        System.out.println("In the GrandFather Default Constructor");
    }
    //Parameterized Constructor
    public GrandFather(int i){
        System.out.println("In GrandFather one parameterized Constructor " +i);
    }
    public GrandFather(int i, int j){
        System.out.println("In GrandFather Two parameterized Constructor "+i+" "+j);
    }
}

class Father extends GrandFather{
    // Default Constructor
    public Father(){
        super(5,6); // It will call Grand Father two parameterized Constructor
        System.out.println("In the Father Default Constructor");
    }
    //Parameterized Constructor
    public Father(int i){
        super(9);
        System.out.println("In Father one parameterized Constructor " +i);
    }
    public Father(int i, int j){
        super(6);
        System.out.println("In Father Two parameterized Constructor "+i+" "+j);
    }
}

class Child extends Father{
    // Default Constructor
    public Child(){
        super(); // Father default Constructor
        System.out.println("In the Child Default Constructor");
    }
    //Parameterized Constructor
    public Child(int i){
//          super(5,5);
        this(); // it will call Child default constructor
        System.out.println("In Child one parameterized Constructor " +i);
    }
    public Child(int i, int j){
        super();
        System.out.println("In Child Two parameterized Constructor "+i+" "+j);
    }
}



public class Construct2 {
    public static void main(String[] args) {


        GrandFather gf= new GrandFather();

        Father f= new Father(7);

        Child obj1= new Child(2); // child class constructor with one parameter

        // This() method is used to call its own constructor as per the degree of arguments
        // Super() method is used to call its parent class constructor as per the degree of arguments

    }
}
