package Day6;

enum Name{ // Special data type , it can store our pre-defined constants
    Ahana,Soumya,Aihik,Tiyasha
        }


public class enum1 {
    public static void main(String[] args) {

        // calling Enum
        Name n1= Name.Tiyasha;
        System.out.println(n1);

        System.out.println();

        // Storing the Enums in an Array
        Name [] arr= Name.values();
        // Printing the array
        for (Name j:arr){
            System.out.println(j +" : " +j.ordinal()); // ordinal will give us the particular enum index
        }

        // Converting  the String into an Array
//        String s= "My name is Mayukhjit";
//        String [] arr1= s.split(" ");
//        for (String s1: arr1){
//            System.out.println(s1);
//        }

    }
}
