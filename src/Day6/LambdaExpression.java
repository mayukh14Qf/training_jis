package Day6;

// Functional Interface (It is having only one method)

interface Math1{
    void print1();  // public and abstract
    void run();
}

// Lambda Expression is only Applicable for Functional Interface
interface Person{
    void walk(); // This method not yet implemented
}

interface Math2{
    int add(int i,int j);
}


public class LambdaExpression {
    public static void main(String[] args) {
        // we are creating the object of Math1 Interface
        // Anonymous class creation
        Math1 obj1= new Math1(){
            public void print1(){
                System.out.println("It is for printing Purpose");
            }

            public void run(){
                System.out.println("this is for running");
            }
        };

        obj1.print1();
        obj1.run();

        // Anonymous class creation for a method which will give me the "return" maybe as int or String or char ...so on
        Math2 m1= new Math2(){
            public int add(int a,int b){
                return (a+b);
            }
        };
        System.out.println(m1.add(6,10));


        // lambda Expression

        Person p1 = ()-> System.out.println("I am walking ");

        p1.walk();

        Person p2 = ()-> System.out.println("He is walking ");
        p2.walk();

        //Lambda with Return type

        Math2 m2= ( i, j)-> (i+j);


        System.out.println(m2.add(45,45));



    }
}
