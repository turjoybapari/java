
import java.util.Scanner;

public class FunctionalCalendar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();

        printCalendar(year, month);
    }

    // Main function to coordinate the printing
    public static void printCalendar(int year, int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};

        int startDay = getStartDay(year, month);
        int numDays = getNumberOfDaysInMonth(year, month);

        System.out.println("\n      " + monthNames[month] + " " + year);
        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");

        // 1. Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // 2. Print days of the month
        for (int i = 1; i <= numDays; i++) {
            System.out.printf("%4d", i);

            // Break line every 7 columns
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Logic to find which day of the week the 1st falls on
    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1900 = 0; // Monday
        long totalDays = getTotalDaysSince1900(year, month);
        return (int) ((totalDays + START_DAY_FOR_JAN_1_1900) % 7);
    }

    // Counts every single day from 1900 to the target month
    public static long getTotalDaysSince1900(int year, int month) {
        long total = 0;

        // Count days for all years since 1900
        for (int i = 1900; i < year; i++) {
            total += isLeapYear(i) ? 366 : 365;
        }

        // Count days for months in the current year
        for (int i = 1; i < month; i++) {
            total += getNumberOfDaysInMonth(year, i);
        }

        return total;
    }

    // Logic to determine month length
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            return 31;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }

        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }

        return 0; // If month is invalid
    }

    // Logic to determine leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
