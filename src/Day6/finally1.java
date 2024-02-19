package Day6;

public class finally1 {
    public static void main(String[] args) {

        int i=8;
        int j=50;
        while (true){
            try {
                j=(j/i);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally { // it will print every single time
                System.out.println("I am in finally " +j);
            }
            i--;
        }
    }
}
