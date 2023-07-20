package OOP.Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();


        Cat cat = new Cat();
        cat.eat();
        cat.run();

        System.out.println(Animal.drawsSquare(10));
         Animal am = new Cat();
         am.sleeping();



    }
}
