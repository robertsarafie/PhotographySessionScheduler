public interface Session {
    String getDate();
    String getStartHour();
    String getEndHour();
    String getTitle();
    void setCalendar(Calendar calendar);
    void addToCalendar();
//    private String date;
//    private String startHour;
//    private String endHour;
//    private String title;
//    private String attendees;
//    private Calendar calendar;
//    public Session(String date, String startHour, String endHour, String title, String attendees) {
//        this.date = date;
//        this.startHour = startHour;
//        this.endHour = endHour;
//        this.title = title;
//        this.attendees = attendees;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public String getStartHour() {
//        return startHour;
//    }
//
//    public void setCalendar(Calendar calendar) {
//        this.calendar = calendar;
//    }
//
//    public void addToCalendar() {
//        if (calendar != null) {
//            calendar.addSession(this);
//            System.out.println(
//                    "Session{" +
//                    "Date=" + date +
//                    ", startHour=" + startHour +
//                    ", endHour=" + endHour +
//                    ", title=" + title +
//                    ", attendees=" + attendees +
//                    "}");
//        } else {
//            System.out.println("No calendar assigned for this session.");
//        }
//
//    }
}



