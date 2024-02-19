package Day4;

class Cricket{
    int bat;
    int ball;

    // No Argument
    public void play(){
        System.out.println("we are playing cricket ");
    }

    // It has One Argument
    public void play(int i){
        System.out.println("we are playing with run of "+i);
    }

    //It has 2 Arguments
    public void play(int i,int j){
        System.out.println("we are playing with run of "+(i+j));
    }

    public void play(String s){
        System.out.println("your favourite team name is "+s);
    }
}

public class Poly {
    public static void main(String[] args) {
        Cricket c1= new Cricket();

        // Method Over loading
        c1.play();
        c1.play(10);
        c1.play(15,60);
        c1.play("India");
    }
}
