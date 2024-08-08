package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //cf) 불변객체를 바꾸는 경우 with를 사용하여 불변객체를 변환하는 메서드임을 알려줌.(관례)
    //set은 주로 내 객체 안에서 값을 바꿀 때 사용함.
    //걍 관례니까 구분하셈.
    public ImmutableMyDate withYear(int new_Year) {
        return new ImmutableMyDate(new_Year, month, day);
    }

    public ImmutableMyDate withMonth(int new_Month) {
        return new ImmutableMyDate(year, new_Month, day);
    }

    public ImmutableMyDate withDay(int new_Day) {
        return new ImmutableMyDate(year, month, new_Day);
    }

    @Override
    public String toString() {
        return "ImmutableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
