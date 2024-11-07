package enumeration.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.name());

        /*if (authGrade.name().equals(AuthGrade.GUEST.name())) {
            System.out.println("==메뉴 목록==");
            System.out.println("-메인화면");
        } else if (authGrade.name().equals(AuthGrade.LOGIN.name())) {
            System.out.println("==메뉴 목록==");
            System.out.println("-메인화면");
            System.out.println("-이메일 관리 화면");
        } else if (authGrade.name().equals(AuthGrade.ADMIN.name())) {
            System.out.println("==메뉴 목록==");
            System.out.println("-메인화면");
            System.out.println("-이메일 관리 화면");
            System.out.println("-관리자화면");
        } else {
            System.out.println("오류");
        }*/

        if (authGrade.getLevel() > 0) {
            System.out.println("==메뉴목록==");
            System.out.println("-메인 화면");
        }

        if (authGrade.getLevel() > 1) {
            System.out.println("-이메일 관리 화면");
        }

        if (authGrade.getLevel() > 2) {
            System.out.println("-관리자 화면");
        }

    }
}

