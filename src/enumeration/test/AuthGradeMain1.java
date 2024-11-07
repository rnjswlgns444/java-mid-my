package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {

        authGradePrint(AuthGrade.GUEST);
        authGradePrint(AuthGrade.LOGIN);
        authGradePrint(AuthGrade.ADMIN);
    }

    public static void authGradePrint(AuthGrade authGrade) {
        System.out.println("grade= " + authGrade.name()
                + ",level= " + authGrade.getLevel()
                + ",설명= " + authGrade.getDescrtion());

    }
}
