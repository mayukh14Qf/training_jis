package Day5;

public class AdvancedPattern {
    public static void main(String[] args) {

        // Swastik Symbol

        int row=4;
        for (int i=0 ; i<row-1;i++){
            for (int j=0;j<1;j++){
                System.out.print("* ");
            }
            for (int j=0;j<2;j++){
                System.out.print("  ");
            }
            for (int j=0;j<1;j++){
                System.out.print("* ");
            }
            if (i==0){
                for (int j=0;j<3;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i=0; i<7;i++){
            System.out.print("* ");
        }
        System.out.println();
        for (int i=0;i<row-1;i++){
            if (i==row-2){
                for (int j=0; j<3;j++){
                    System.out.print("* ");
                }
            }
            if (i<row-2){
                for (int j=0; j<3;j++){
                    System.out.print("  ");
                }
            }
            for (int j=0;j<1;j++){
                System.out.print("* ");
            }
            for (int j=0; j<2;j++){
                System.out.print("  ");
            }
            for (int j=0;j<1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
