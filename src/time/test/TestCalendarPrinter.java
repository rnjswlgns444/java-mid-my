package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        System.out.println("SU Mo Tu We Th Fr Sa ");

        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7; // 월요일 = 1 ... 일요일 = 7

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");

        }

        LocalDate firstDay = firstDayOfMonth.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay = firstDayOfMonth.with(TemporalAdjusters.lastDayOfMonth());

        while(!(firstDay.isEqual(lastDay))) {
            System.out.printf("%2d ",firstDay.getDayOfMonth());

            if (firstDay.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            firstDay =firstDay.plusDays(1);


        }


    }
}
