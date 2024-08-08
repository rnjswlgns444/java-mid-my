package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity= " + (user1 == user2));
        System.out.println("identity= " + (user1.equals(user2)));
        //Object에 있는 equals는 ==가 기본으로 작성되어 있음(즉 9번 라인의 코드와 같음)
        //따라서 equals는 오버라이딩이 필요함.
    }
}
