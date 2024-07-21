package E_ComaprableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparable {


    public static void main(String[] args) {
        Animal a1 = new Animal(1,"Dog1",10);
        Animal a2 = new Animal(2,"Dog2",20);
        Animal a5 = new Animal(2,"Dog5",20);
        Animal a6 = new Animal(2,"Dog6",20);
        Animal a3 = new Animal(3,"Dog3",30);
        Animal a4 = new Animal(4,"Dog4",40);

        List<Animal> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);
        dogs.add(a6);

        System.out.println(dogs);

        // sort by age 2 method

        // By list sort method
        //dogs.sort();


        // Collectionns class static method sort
        Collections.sort(dogs);

        //Collections.binarySearch();

        /*
            Comparator : It is a function interface having one abstract method

            Comparable - if logic changed then all logic changed for sorting in both class

            In this case use comparator

            We can define custom comparator

            In Comparator class only abstract method compare which implementation is not defined

         */

        // anonymous class

        /*
            Collections.sort(dogs, new Comparator<Animal>() {
                @Override
                public int compare(Animal o1, Animal o2) {
                    return 0;
                }
            });
         */


        Collections.sort(dogs, new MyCustomDogComparator());
        System.out.println(dogs);

        /*
            Collections.sort(dogs, new Comparator<Animal>() {
                @Override
                public int compare(Animal o1, Animal o2) {
                    return o1.name.compareTo(o2.name);
                }
            });
         */

      Collections.sort(dogs,(o1,o2) -> o1.name.compareTo(o2.name));
      System.out.println(dogs);

      // Comparing in java 8

        /*
            Collections.sort(dogs,(o1,o2)->
            {
                return o1.age-o2.age;
            });
         */

        Collections.sort(dogs, Comparator.comparing(Animal::getAge));
        System.out.println(dogs);

        // for chaining

        Collections.sort(dogs, Comparator.comparing(Animal::getAge).thenComparing(Animal::getWeight));
        System.out.println(dogs);

    }

}

class MyCustomDogComparator implements Comparator<Animal>{

    // same logic as compareTo method in corresponding file
    @Override
    public int compare(Animal o1, Animal o2) {
        //return o1.weight - o2.weight;

        return Integer.compare(o1.weight,o2.weight); // preferred
    }
}