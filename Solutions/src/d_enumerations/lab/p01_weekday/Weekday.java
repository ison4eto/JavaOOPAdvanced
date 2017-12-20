package d_enumerations.lab.p01_weekday;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    @Override
    public String toString() {
        return this.name().charAt(0)+this.name().toLowerCase().substring(1);
    }
}
