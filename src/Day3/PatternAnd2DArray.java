package Day3;

import java.util.Scanner;

public class PatternAnd2DArray {
    public static void main(String[] args) {

        // 2-D Array

        Scanner sc = new Scanner(System.in);

        int [][] roll= {{1,2,3,4},{1,2,3},{1,2}};

        String [][] name= new String[3][2];

        // Printing 2-D Array
 /*       for (int i=0; i< roll.length;i++){
            for (int j=0;j<roll[i].length;j++){
                System.out.print(roll[i][j] +" ");
            }
            System.out.println();
        }

  */
        // User input for 2-D Array
  /*      for (int i=0; i<3;i++){
            for (int j=0;j<2;j++){
                name[i][j]=sc.next();
            }
        }
        // Printing the 2-D Array
        for (int i=0; i< name.length;i++){
            for (int j=0;j<name[i].length;j++){
                System.out.print(name[i][j] +" ");
            }
            System.out.println();
        }
   */
        // Pattern 1
        /*            *
                      * *
                      * * *
                      * * * *
                      * * * * *
         */
/*
        for (int i=0; i<5 ;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/
        /*

        Pattern -2

        * * * * *
        * * * *
        * * *
        * *
        *

         */

/*
        for (int i=0; i<5 ;i++){
            for (int j=i;j<5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/
        /*
            *
          * *
        * * *
      * * * *
    * * * * *
         */
 /*
        int rows=5;
        for (int i=0; i<rows ;i++){
            for (int j=i;j<rows-1;j++){
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

*/

        // Diamond Pattern
/*
        int rows=5;
        for (int i=0; i<rows ;i++){
            for (int j=i;j<rows-1;j++){
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0;i<rows-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print("  ");
            }
            for (int j=0;j<rows-1-i;j++){
                System.out.print("* ");
            }
            for (int j=0;j<rows-2-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/
         // Swastik Symbol

        int row=5;
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
