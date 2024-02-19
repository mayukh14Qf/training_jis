package Day5;


// Method Over ridding or Dynamic poly
class Math{
    public void area(){
        System.out.println("It will show the area in Math class");
    }
}

class Square extends Math{
    public void area(){
        System.out.println("It will show the area in Square class");
    }
    public void area(int a){
//        super.area();
        System.out.println("area of square is "+(a*a));
    }
}
class Shape extends Square{
    public void area(){
        super.area(5); // It will allow me to call my parent class method with my freedom which will be giving by the arguments
        System.out.println("It will show the area in Shape class");
    }
    public void area(int a, int b){
        System.out.println("our area parameters are "+a+" and "+b);
    }
    public void area(String s){
        System.out.println("you are finding the area of "+s);
    }
}



public class poly2 {
    public static void main(String[] args) {


        // Implementation of Method Over Ridding
        Shape s= new Shape();
        s.area("Triangle");
        s.area(4);
        s.area(2,5);

        System.out.println();

        s.area(); // By default, it will call its own self first

        System.out.println();

        Square sq= new Square();
        sq.area();


        Math m= new Math();
        m.area();




    }
}
