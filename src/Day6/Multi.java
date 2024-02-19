package Day6;

// Multi Threading
class LastDay extends Thread{
    public void run() {
        for (int i=0;i<=100;i++){
            System.out.println("hii");
        }
    }
}

class FirstDay extends Thread{
    public void run(){
        for (int i=0;i<=100;i++){
            System.out.println("hello");
        }
    }
}

class LastMin implements Runnable{
    public void run(){
        for (int i=0;i<=100;i++){
            System.out.println("bye");
        }
    }
}

public class Multi {
    public static void main(String[] args) {

        // extending the Thread class
        LastDay ld = new LastDay();
        FirstDay fd= new FirstDay();

        // Implementing Runnable
        LastMin lm= new LastMin();
        //Creating the obj of Thread class and giving the Runnable obj as argument
        Thread t1= new Thread(lm);

        // Starting my Threads
        t1.start();
        ld.start();
        fd.start();



    }
}
