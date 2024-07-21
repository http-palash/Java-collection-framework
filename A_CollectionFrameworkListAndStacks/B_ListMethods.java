package A_CollectionFrameworkListAndStacks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B_ListMethods {


    public static void main(String[] args) {

        /*
            Collection interface  methods:
            add, size, contains, remove(2 types- by index, by using wrapper_class_object.valueof)
            removeAll, addAll, retainAll, clear, toArray
         */

        /*
            List specific methods :
            get(int index)
            set(int index, E element)
            add(int index, E element)
            remove(int index)
            indexOf(Object o)
            lastIndexOf(Object O)
            listIterator()
            listIterator(int index)
            subList(int fromIndex, int toIndex)
         */

        List list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.set(0,10));
        System.out.println(list);
        // add(index, element)Insert in between
        list.add(2,200);
        System.out.println(list);

        list.remove(0); // List method
        System.out.println(list);//C

        list.remove(Integer.valueOf(200)); //collection class method
        System.out.println(list);

        System.out.println(list.indexOf(2));//TC O(n)

        list.add(2);
        System.out.println(list);
        System.out.println(list.lastIndexOf(2));//TC O(n)

        List<String> animals = new ArrayList<>();

        animals.add("Cow");
        animals.add("Cat");
        animals.add("Camel");
        animals.add("Horse");
        animals.add("Dog");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Animal is :"+animals.get(i));
        }

        System.out.println();

        for (String animal : animals){
            System.out.println("animal is : "+animal);
        }

        Iterator<String> ae = animals.iterator();// iterator in collection framework part of list iterator

        while(ae.hasNext()){
            System.out.println("iterator : "+ae.next());
        }

        List<String> smallList = new ArrayList<>();
        smallList = animals.subList(0,3); // 0 inclusive 3 exclusive
        System.out.println(smallList);



    }
}
