package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

/*    @Override
    public boolean equals(Object obj) { //파라미터를 Object로 넘기는 이유는 애초에 equals 매개변수가 Object로 정의되어 있음.
        UserV2 user = (UserV2) obj; //obj를 다운 캐스팅하는 이유; Object 클래스는 id를 가지고 있지 않음.
        return id.equals(user.id);
    }
    */
    
    //실제 equals 오버라이딩 - 매우 복잡함.(원래 equals를 사용하는 것이 쉽지 않음 - equals를 위해 맞춰야 하는 조건이 많음!)
    //근데 걍 generater 쓰면 됨ㅋㅋㅋㅋ
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }
}
