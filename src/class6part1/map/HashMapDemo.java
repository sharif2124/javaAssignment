package class6part1.map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> customer = new HashMap<>();
        customer.put(1,"Rahim");
        customer.put(2,"Karim");

        System.out.println(customer.get(1));
        System.out.println(customer.get(2));
    }
}
