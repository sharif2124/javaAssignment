package class6part1.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> fruitsName = new HashSet<>();
        fruitsName.add("Apple");
        fruitsName.add("Orange");
        fruitsName.add("Banana");
        fruitsName.add("Mango");


        System.out.println("Fruits Name is : "+fruitsName);
        System.out.println("Size is : "+fruitsName.size());

        fruitsName.add("Lemon");
        System.out.println("Fruits Name is : "+fruitsName);
        System.out.println("After Adding Size is : "+fruitsName.size());



    }
}
