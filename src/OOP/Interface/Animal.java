package OOP.Interface;

public interface Animal {
    void eat();
    void run();

    default void sleeping(){
        System.out.println("Cat Sleeping");
        System.out.println("Dog Sleeping");
        Triangle();
    }
    static int drawsSquare(int length){
        return length*length;
    }
    private void Triangle(){
        System.out.println("Triangle Area :"+(0.5*8*4));
    }
}
