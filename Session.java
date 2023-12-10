public interface Session {
    String getDate();
    String getStartHour();
    String getEndHour();
    String getTitle();
    void setCalendar(Calendar calendar);
    void addToCalendar();
}



