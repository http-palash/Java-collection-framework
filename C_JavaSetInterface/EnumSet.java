package C_JavaSetInterface;

public class EnumSet {

    enum Color{
        RED, YELLOW, GREEN
    }

    public static void main(String[] args) {

        // When we want only supported/ restrict types
        System.out.println(Color.YELLOW);

        //EnumSet<Color> enumSet = EnumSet.allOf(Color.class);



    }
}
