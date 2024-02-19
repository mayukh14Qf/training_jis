package Day6;

public class ExceptionHandle1 {
    public static void main(String[] args) {


        int a=20;
        int b=5;

        try {
            b=10/a;
            if (a>10){
                throw new ArithmeticException("My default a should not exceed the value of  10 ");
            } // Throwing the custom exception according to our logic
        }
        catch (ArithmeticException e){
            b=10; // Fixing the exception
            System.out.println(e);
        }


        System.out.println(b);
        System.out.println("My name is Tiyasha ");



    }
}
