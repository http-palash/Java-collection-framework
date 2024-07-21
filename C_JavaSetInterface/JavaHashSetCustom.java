package C_JavaSetInterface;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class JavaHashSetCustom {

    /*
        In java, HashSet is commonly used if we have to access
        elements randomly.

        It is because elements in a hash table are accessed
        using hash codes.

        The hashcode of an element is a unique identity that
        helps to identify element in a hash table

        HashSet cannot contain duplicate elements. Hence,
        each hash set element has a unique hashcode.
     */

    /*
        Java HashSet of Custom objects

        When using set and HashSet in java for the primitive types
        we can just use it without worry about how to implement the
        hashcode and the comparison logic,

        but when you want to use the set with a custom class by
        putting custom objects into the set,

        that custom class has
        to implement the hashCode() and equals() method in order
        for the HashSet to work.
     */


    public static void main(String[] args) {


    //        Set<String> sett = new HashSet<>();
    //        sett.add("Palash");
    //        sett.add("Ram");
    //        sett.add("Palash");
    //        sett.add("Rakesh");

        Set<Student> sett = new HashSet<>();

        Student s1 = new Student("Yash",1);
        Student s2 = new Student("Sameer",1);

        System.out.println(s1.equals(s2));

        sett.add(new Student("Palash",1));
        sett.add(new Student("Ram",1));
        sett.add(new Student("Tushar",1));



        System.out.println(sett.toString());
    }

}


class Student{

    int rollno;
    String name;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return this.rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}