package Day5;
 //Inheritence
class A{
    int a;
    int b;

    public void play(){
        System.out.println("we are playing ");
    }
    public void run(){
        System.out.println("we are running ");
    }
}

class B extends A{
    public void jump(){
        System.out.println("we are jumping ");
    }
}
class C extends B{

}



public class Inherit {
    public static void main(String[] args) {

        A obj2 = new A();

        obj2.run();


        B obj1= new B();
        obj1.play();
        obj1.run();
        obj1.jump();

        C obj3 = new C();

        obj3.jump();

    }
}
