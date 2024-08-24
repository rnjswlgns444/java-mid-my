package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] parts = email.split("@");
        String ID_Part = parts[0];
        String DomainParts = parts[1];
        System.out.println("ID: " + ID_Part);
        System.out.println("Domain: " + DomainParts);

    }
}
