package d_enumerations.lab.p01_weekday;

import java.util.ArrayList;
import java.util.List;

import static d_enumerations.lab.p01_weekday.WeeklyEntry.BY_WEEKDAY;

public class WeeklyCalendar {
    private List<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes){
        WeeklyEntry entry = new WeeklyEntry(weekday,notes);
        entries.add(entry);
    }
    public Iterable<WeeklyEntry> getWeeklySchedule(){
        entries.sort(BY_WEEKDAY);
        return entries;

    }

}
