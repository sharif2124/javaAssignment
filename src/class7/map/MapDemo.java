package class7.map;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Object> jsons= new HashMap();
        jsons.put("id", "444");
        jsons.put("language", "C");
        jsons.put("edition", "First");
        jsons.put("author", "Dennis Ritchie");
        System.out.println(jsons);


        System.out.println(" ");
        System.out.println("::::::");
        //using for each loop

        for(String c: jsons.keySet()){
            System.out.println(c);
        }

        System.out.println(jsons.get("C"));
        //remove
        jsons.remove("Dennis Ritchie");
        System.out.println(jsons);
    }
}
