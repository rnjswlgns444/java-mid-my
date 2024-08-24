package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        sb.insert(3, "Java");
        System.out.println("insert = " + sb);

        sb.delete(3, 7); //3번 인덱스부터 7번 인덱스까지 지움
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBUilder -> String
        String string  = sb.toString();
        System.out.println("string = " + string);
    }
}
