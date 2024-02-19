package Day3;

public class methods {
    public static void addNumbers(int a, int b){
        System.out.println(a+b);
    }

    public static void patternCom(int rows){
        for (int i=0; i<rows ;i++){
            for (int j=i;j<rows-1;j++){
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern1(int n){
        for (int i=0; i<n ;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static boolean isPalindrome(String s){
        String p="";
        int ptr= s.length()-1;
        while (ptr>=0){
            p=p+s.charAt(ptr);
            ptr --;
        }
        if(s.equals(p)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        pattern1(5);
        System.out.println(isPalindrome("wow"));
    }
}
