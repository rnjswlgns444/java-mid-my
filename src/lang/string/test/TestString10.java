package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple, banana, mango";
        String[] parts = fruits.split(",");

        String joinedString = String.join("->", parts);
        System.out.println(joinedString);
        
    }
}
