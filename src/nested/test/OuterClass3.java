package nested.test;

public class OuterClass3 {
    public void myMethod() {

        class LocalClass {
            public static void hello() {
                System.out.println("LocalClass.hello");

            }
        }

        LocalClass lcClass = new LocalClass();
        lcClass.hello();
    }
}
