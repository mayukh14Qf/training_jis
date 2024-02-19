package Day4;

import java.util.Arrays;
import java.util.HashSet;

public class assignment {

    public  static void findRepeat(int [] arr){
        HashSet<Integer> al= new HashSet<>();
        for (int i=0; i<arr.length;i++){
            int count =0;
            for (int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    count ++;
                }
            }
            if (count>0){
                al.add(arr[i]);
            }
        }
        System.out.println("repeating elements are ");
        for ( int a : al){
            System.out.println(a);
        }
        Arrays.sort(arr);
        for (int i=0;i< arr.length-1;i++) {
            int count = 0;
            while ((arr[i] == arr[i + 1]) && (i < arr.length - 1)) {
                count++;
                i++;
            }
            if (count > 0){
                System.out.println("the number of " + arr[i] + " is " + (count+1));
            }
        }
    }

    public static void diamondPattern(int rows){
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
    }

    public static void main(String[] args) {
        int [] arr={2,3,3,1,2,2,4,5,1};
        findRepeat(arr);
        diamondPattern(6);
    }
}
