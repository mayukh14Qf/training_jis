package Day2;
import java.util.*;
public class loops {
    public static void main(String[] args) {

        // Print first 10 numbers

        // for loop
/*
        System.out.println("for loop");
        for (int i=1 ; i<=10 ;i++){
            if(i<=5){
                continue;
            }
            System.out.println(i);
        }


 */
        // While loop
/*
        System.out.println("while loop");
        int a=1;
        while (a<11){
            System.out.println(a);
            a++;
        }


 */
        // print sum of 1st 5 numbers
/*
        int sum=0;
        for (int i=1; i<=5;i++){
            sum=sum+i;
        }
        System.out.println("sum of the numbers is "+sum);
 */
        // fibonacci series

       /* int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        */

        // Last digit of a Number

 /*       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();

        int p= num % 10;

        System.out.println("The last Digit is ");
        System.out.println(p);

  */

        // 1st digit of the number

/*        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        while (n>=10){
            n=n/10;
        }
        System.out.println(n);
  */
         // Count Number of digits
 /*       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);

  */
        // Reversing a Number
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int p=sc.nextInt();

        int rev=0;

        while (p>0){
            rev=(rev*10)+(p%10);
            p=p/10;
        }
        System.out.println(rev);
*/
        // A number is palindrome or not
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int p=sc.nextInt();

        int s=p;

        int rev=0;

        while (p>0){
            rev=(rev*10)+(p%10);
            p=p/10;
        }
        System.out.println(rev);
        if (s==rev){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }
*/
        // Prime number or not
/*        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int p=sc.nextInt();

        int count=0;
        for (int i=1;i<=p;i++){
            if (p%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("It is not a prime");
        }
*/

        // Prime number in a range
/*
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the range ");
        int p=sc.nextInt();

        for (int i=1; i<=p;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i+" ");
            }
        }
*/






    }
}
