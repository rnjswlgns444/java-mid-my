package lang.string.method;

public class StringChangedMain2 {

    public static void main(String[] args) {
        String strWithSpaces = "         Java Programming";

        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase());

        System.out.println("공백 제거(trim): " + strWithSpaces.trim() + "'"); //"'" 이거는 그냥 공백 제거됐는지 구분할려고 넣은거
        System.out.println("공백 제거(strip): " + strWithSpaces.strip() + "'");

        //trim과 strip의 차이점
        //strip은 그냥 우리가 평상지 알고 있는 공백만 제거 가능
        //trim은 그냥 공백도 가능하지만 유니코드 공백(좀 특이한 공백..)을 제거 가능함!
        System.out.println("앞 공백 제거(strip): " + strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): " + strWithSpaces.stripTrailing() + "'");


    }
}
