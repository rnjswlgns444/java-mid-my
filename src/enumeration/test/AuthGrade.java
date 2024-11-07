package enumeration.test;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2,"로그인 회원"),
    ADMIN(3,"관리자");

    private final int level;
    private final String descrtion;

    AuthGrade(int level, String descrition) {
        this.level = level;
        this.descrtion = descrition;
    }

    public int getLevel() {
        return level;
    }

    public String getDescrtion() {
        return descrtion;
    }

}

