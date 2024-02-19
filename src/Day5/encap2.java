package Day5;

class School{
    private int roll;
    private String name;

    //Setter
    public void setRoll(int roll){
        this.roll=roll;
    }

    public void setName(String name){
        this.name=name;
    }


    // Getter
    public int getRoll(){
        return roll;
    }

    public String getName(){
        return name;
    }


    public void print(){
        System.out.println(roll);
        System.out.println(name);
    }
}




public class encap2 {
    public static void main(String[] args) {
        // Here this encap class was created in a different public java domain
        encap e= new encap();
        e.a=4;
        e.b=5;
        System.out.println(e.b);
        e.print();

        // Getter and Setter

        School s1= new School();

        s1.setRoll(45);
        s1.setName("aihik");
        System.out.println(s1.getName());
        s1.print();
    }
}
