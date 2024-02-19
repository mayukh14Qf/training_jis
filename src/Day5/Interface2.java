package Day5;

// Functional Interface
// If an interface is having only one method

// Interface 1
interface Mobile{
    void screen();
}
// Interface 2
interface Box{
    void sound();
}
// Interface 3
interface Tv{
    void size();
}
// Tiyasha class is implementing all these 3 Interfaces , which is kind of Multiple Inheritence in Java
class Tiyasha implements Mobile,Box,Tv{

    public void screen() {
        System.out.println("My screen is FHD");
    }


    public void sound() {
        System.out.println("the sound Quality is good");
    }


    public void size() {
        System.out.println("this mobile size is pretty okay !! ");
    }
}


public class Interface2 {
    public static void main(String[] args) {

        Tiyasha t = new Tiyasha();
        t.screen();
        t.size();
        t.sound();

        // we can implement multiple interface for a single class

    }
}
