package A15;

public class Main {
    public static void main(String[] args) {
        CalendarToNewDateAdapter adapter = new CalendarToNewDateAdapter();
        
        System.out.println("current date");
        System.out.println(adapter.getYear());
        System.out.println(adapter.getMonth());
        System.out.println(adapter.getDay());

        adapter.setDay(29);
        adapter.setMonth(12);
        adapter.setYear(2027);

        System.out.println("edited date");
        System.out.println(adapter.getYear());
        System.out.println(adapter.getMonth());
        System.out.println(adapter.getDay());

        adapter.advanceDays(3);

        System.out.println("advance days by 3");
        System.out.println(adapter.getYear());
        System.out.println(adapter.getMonth());
        System.out.println(adapter.getDay());
    }
}
