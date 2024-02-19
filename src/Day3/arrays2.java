package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        String s ="mayuhkjit";

        char [] letter = s.toCharArray();
        for ( char c : letter){
            System.out.print(c+" ");
        }
        System.out.println();
        String s1= "Myaanameaaisaamayukhjit";
        String [] words= s1.split("");

        for (String e : words){
            System.out.println(e);
        }


 */
        /*
        String [] s3={"Soumya","Ahana","Tiyasha","Sagnik"};
        int [] i= {12,34,35,90};
        char [] c= {'c','r','u','p'};


        for(String k : s3){
            System.out.print(k +" ");
        }
        System.out.println();
        for (int a : i){
            System.out.print(a+" ");
        }
        System.out.println();
        for(char t : c){
            System.out.print(t+" ");
        }
     */

     // User input for an array
        /*
        System.out.println("enter your array size");
        int size= sc.nextInt();

        int [] arr = new int[size];

        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("your array is :");

        for (int o: arr){
            System.out.print(o+" ");
        }
*/
        // Take an integer array from user and print the sum of the all elements
/*
        System.out.println("enter your array size");
        int size= sc.nextInt();

        int [] arr = new int[size];

        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i : arr){
            sum=sum+i;
        }
        System.out.println("your sum of the array element is "+sum);


 */
        // char array from the user, and it will return the number of vowels
/*
        System.out.println("enter your array size");
        int size= sc.nextInt();

        char [] arr = new char[size];

        for (int i=0; i<size; i++){
            arr[i]=sc.next().charAt(0);
        }
        int count =0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
                count++;
            }
        }
        System.out.println("number of vowels are :"+ count);

 */
        // print an array from the reverse
/*
        System.out.println("enter your array size");
        int size= sc.nextInt();

        int [] arr = new int[size];

        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        for (int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

*/
        // print max and min of an array

 /*       System.out.println("enter your array size");
        int size= sc.nextInt();

        int [] arr = new int[size];

        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("max of the array is "+arr[size-1]);
        System.out.println("min os the array is "+arr[0]);
*/

 /*
        System.out.println("enter your array size");

        int size= sc.nextInt();

        int [] arr = new int[size];

        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        // Finding the max element
        int max= Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("my max element is "+max);

        // Finding the min element
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("my minimum element is "+min);
 */

        // sort a particular array
/*
        System.out.println("enter your array size");
        int size= sc.nextInt();

        int [] arr = new int[size];

        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i : arr){
            System.out.print(i+" ");
        }
*/








    }
}
