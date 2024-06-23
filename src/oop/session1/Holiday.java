package oop.session1;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday other) {
        return this.month.equals(other.month);
    }

    public static double avgDate(Holiday[] holidays) {
        int sum = 0;
        for (Holiday holiday : holidays) {
            sum += holiday.day;
        }
        return (double) sum / holidays.length;
    }

    public static void main(String[] args) {

        Holiday independenceDay = new Holiday("Independence Day", 4, "July");
        System.out.println("Holiday: " + independenceDay.name + ", Date: " + independenceDay.day + " " + independenceDay.month);


        Holiday christmas = new Holiday("Christmas", 25, "December");
        Holiday newYear = new Holiday("New Year", 1, "January");
        Holiday[] holidays = {independenceDay, christmas, newYear};

        System.out.println("In Same Month: " + independenceDay.inSameMonth(christmas)); // false
        System.out.println("Average Date: " + Holiday.avgDate(holidays)); // 10.0
    }
}

