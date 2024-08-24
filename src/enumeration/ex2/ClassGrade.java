package enumeration.ex2;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    //private 생성자 추가 - 외부에서 생성하면 의미가 없어지기 때문에 생성을 못하게 막는것.
    private ClassGrade() {}
}



