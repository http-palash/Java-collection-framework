package D_MapInterface;

import java.util.*;

public class A_Map {

    public static void main(String[] args) {

        // List - vector, ArrayList, linkedlist, Stack these classes implements list interface
        List<Integer> list = new ArrayList<>();

        // HashMap class implementing interface Map
        Map<String, String> map = new HashMap<>();

        map.put("in","india");
        map.put("in","india");
        map.put("in","india2"); // updated value for key in
        // keps one only from above

        map.put("i","india");
        map.put("ch","china");
        // put all

        System.out.println(map);

        System.out.println(map.containsKey("in"));

        System.out.println(map.get("ch"));

        System.out.println(map.get("h")); //null
        System.out.println(map.getOrDefault("hd","Others"));//Others

        System.out.println(map.containsKey("h")); //false
        System.out.println(map.containsValue("china")); //true

        /*
             replace(K,v)
             replace(K old,new)

             remove(K)
             remove(K,V)

             keySet()
             values()
             entrySet()

         */


        System.out.println(map.remove("in"));
        System.out.println(map);
        System.out.println(map.remove("i","India"));
        System.out.println(map);

        System.out.println(map.keySet());


        // Set of keys in set
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        // wecan put one collection to other

        System.out.println(keys);

        // Set of values in collection
        // map.values returns collection of strings
        Collection<String> values =  map.values();

        System.out.println(values);


        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(Map.Entry<String, String> entry : entries){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

     }
}
