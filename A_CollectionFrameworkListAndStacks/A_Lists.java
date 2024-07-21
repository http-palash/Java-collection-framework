package A_CollectionFrameworkListAndStacks;

import java.util.ArrayList;
import java.util.List;

public class A_Lists {

    public static void main(String[] args) {

        /*
            List        -> interface
            list        -> object
            <Integer>   -> object of wrapper class generic
            new         -> to create object
            Arraylist() -> Class

         */

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        System.out.println(list.contains(2));

        // Remove - two types
        // Index removal :

        System.out.println("Removed index:"+list.remove(0));
        System.out.println(list);

        // Value removal by object

        System.out.println("Value removed:"+list.remove(Integer.valueOf(20)));
        System.out.println(list);


        List<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(200);
        list2.add(30);
        list2.add(400);

        System.out.println("List 2 is : "+list2);

        list2.addAll(list); // (list - A list 2 - B) full set A + B
        System.out.println("List 1 + List 2  is : "+list2);



        list2.removeAll(list); // Only set A removing matching elements of list
        System.out.println("List 2 is : "+list2);

        System.out.println("Adding 30 in list2 :"+list2.add(30));
        list2.addAll(list); // A+B full set
        System.out.println("List 1 + List 2  is : "+list2);

        list2.retainAll(list); // Intersection of Set A and B same elements
        System.out.println("List 2 now: "+list2);

        list2.clear();
        System.out.println("After clearing list 2 list2.clear(): "+list2);;

        System.out.println("List 1 is :"+list);

        Object a[] = list.toArray();
        System.out.println(a);

        for(Object e : a){
            Integer temp = (Integer) e;
            System.out.println(e);
        }
    }

}
