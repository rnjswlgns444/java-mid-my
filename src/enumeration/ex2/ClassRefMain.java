package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        System.out.println("Class Basic" + ClassGrade.BASIC.getClass());
        System.out.println("Class Gold" + ClassGrade.GOLD.getClass());
        System.out.println("Class Diamond" + ClassGrade.DIAMOND.getClass());

        System.out.println("ref Basic" + ClassGrade.BASIC);
        System.out.println("ref Gold" + ClassGrade.GOLD);
        System.out.println("ref Diamond" + ClassGrade.DIAMOND);
    }
}
