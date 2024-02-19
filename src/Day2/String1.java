package Day2;

import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {

        // Leap year
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");
        int year= sc.nextInt();
        if ( year % 4==0 && year%100 !=0){
            System.out.println("yes leap year");
        }
        else if(year %400 ==0){
            System.out.println("yes leap year");
        }
        else {
            System.out.println("not a leap year ");
        } */

        // Typecasting

        /*double a= 2.43;
        int d= (int) a;
        System.out.println(a);
        System.out.println(d);

        char ch ='b';
        int s= (int) ch;
        System.out.println(s);

        int g=98;
        char c= (char) g;
        System.out.println(c); */

        // Math Class
/*
        int a=9;
        System.out.println((int)Math.sqrt(a));

        System.out.println((int)Math.pow(a,2));
*/
        // String

        /*String s1= "MAYUKHJIT"; // It is a Class
        System.out.println(s1);

        String s2= new String("Ahana");
        System.out.println(s2);

        String s3= "mayukhjit";

        System.out.println(s1.length()); // it will give the length

        System.out.println(s2.toUpperCase()); // to change all the letters into uppercase

        System.out.println(s1.toLowerCase());// to change all the letters into LowerCase

        System.out.println(s2.charAt(1)); // char at given index

        System.out.println(s1.equals(s2)); // to check two strings equal or not

        System.out.println(s1.substring(0,6)); // to print desired substring

        System.out.println(s2.isEmpty()); // to check either our String is empty or not

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3)); // it can ignore our case sensitiveness
        */

        // StringBuilder and StringBuffer

        /*StringBuilder sb= new StringBuilder("soumya");
        System.out.println(sb);
        sb.append(" das");
        System.out.println(sb);
        System.out.println(sb.length());
        StringBuffer sbu= new StringBuffer("tiyasha");
        System.out.println(sbu.length());
        System.out.println(sbu.capacity());

        String s= sb.toString();
        System.out.println(s);
*/
        /*
        int roll=14;
        System.out.println("acb");
        System.out.println("sdg");
        String s= "navin";
        System.out.printf("%11s",s);
        System.out.println();
        System.out.printf("%-10s",s);

*/

        // Find a character from a given String
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("provide your String");
        String s=sc.nextLine();
        System.out.println("provide your Character");
        char c= sc.next().charAt(0);

        if (s.contains(Character.toString(c))){
            System.out.println("yes I am here");
        }
        else {
            System.out.println("no, HE/SHE is not present");
        }
*/
        // Number of vowels in the String
 /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a String");
        String s= sc.nextLine();

        int count=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='A' ||s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("your vowel counts are ");
        System.out.println(count);

*/
        // Reverse A string
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String s= sc.nextLine();

        String p="";
        int ptr= s.length() -1;
        while (ptr>=0){
            p=p+s.charAt(ptr);
            ptr--;
        }
        System.out.println(p);
         */

        // Check Palindrome or not
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String s= sc.nextLine();

        String p="";
        int ptr= s.length() -1;
        while (ptr>=0){
            p=p+s.charAt(ptr);
            ptr--;
        }
        System.out.println(p);

        if (p.equals(s)){
            System.out.println("It is palindrome String");
        }
        else {
            System.out.println("It is not a Palindrome String");
        }

*/










    }
}
