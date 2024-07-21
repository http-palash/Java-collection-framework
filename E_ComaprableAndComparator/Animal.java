package E_ComaprableAndComparator;

public class Animal implements Comparable<Animal>{

    int age;
    String name;;
    int weight;

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;



    }



    @Override
    public String toString(){
        return " Animal{"+"age = "+ age + ", name = "+name + " weight = "+weight+"}\n";
    }

    @Override

    public int compareTo(Animal that){
        /* use to compare current obj with specofied obj and it returns integer
           positive negative integer current obj is lesser
           positive postive integer current obj is greater
          O then current and specified obj is equal
       */

        if(this.age == that.age){
            // by string class compareTo operator
            return this.name.compareTo(that.name);
        }

        return this.age - that.age;

    }
}
