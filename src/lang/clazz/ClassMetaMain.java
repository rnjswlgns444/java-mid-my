package lang.clazz;

import java.lang.reflect.Field;

public class ClassMetaMain {

    public static void main(String[] args) throws Exception {
//      Class 조회
        Class clazz = String.class; //클래스에서 조회
        // Class clazz = new String().getClass(); //인스턴스에서 조회
        // Class clazz = Class.forName("java.lang.String");

        //모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
