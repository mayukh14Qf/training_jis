package Day6;

public class ExceptionHandle {
    public static void main(String[] args) {

        int i=0;
        int j=50;

        // Java Exception using try and catch

        try {
            j=(j/i);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("please change your i to more than zero");
        }

        System.out.println("My name is Mayukhjit");
        System.out.println(j);
    }
}
