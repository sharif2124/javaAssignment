package class6part1.list;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        System.out.println("Arraylist Contains : "+number);
        //for each loop
//        for(int x:number){
//            System.out.println(x);
//        }
        //using iterator

//        Iterator ite = number.iterator();
//        while (ite.hasNext()){
//            System.out.println(""+ite.next());
//        }
        System.out.println("");
        System.out.println(number.size());

        //Removing element

        number.remove(2);
        System.out.println("After Removing : "+number);
    }
}
