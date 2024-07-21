package A_CollectionFrameworkListAndStacks;

public class HelloGenericMethod {

    static <E> void print(E data){
        System.out.println(data);
    }
    public static void main(String[] args) {
        print("hello");
        print(123);
        print(true);
    }
}
