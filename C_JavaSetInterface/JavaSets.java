package C_JavaSetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaSets {

    public static void main(String[] args) {

        /*
            add()
            addAll()
            remove()
            removeAll()
            retainAll()
            clear()
            size()
            contains()
         */

//        Set<Integer> set = new HashSet<>(); //Time complexity O(1) add remove contains
        Set<Integer> set = new LinkedHashSet<>(); //Time complexity O(n) for some



        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(20);

        System.out.println(set);

        set.remove(10);
        System.out.println(set);







    }
}
