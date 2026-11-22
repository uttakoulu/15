public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();

        date.setDay(15);
        date.setMonth(5);
        date.setYear(2025);

        System.out.println("initial date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        date.advanceDays(10);

        System.out.println("after 10 days: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        date.advanceDays(20);

        System.out.println("after 20 more days: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    }
}