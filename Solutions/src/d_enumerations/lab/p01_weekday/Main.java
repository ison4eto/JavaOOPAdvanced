package d_enumerations.lab.p01_weekday;

public class Main {
    public static void main(String[] args) {
        WeeklyCalendar wc = new WeeklyCalendar();
        wc.addEntry("Monday","cleaning");
        wc.addEntry("Sunday","work");
        wc.addEntry("Friday","rest");

        Iterable<WeeklyEntry> schedule = wc.getWeeklySchedule();
        for (WeeklyEntry we:schedule
             ) {
            System.out.println(we);
        }
    }

}
