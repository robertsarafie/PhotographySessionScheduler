public class PhotoSession implements Session {
    private String date;
    private String startHour;
    private String endHour;
    private String title;
    private String attendees;
    private Calendar calendar;

    public PhotoSession(String date, String startHour, String endHour, String title, String attendees) {
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
        this.title = title;
        this.attendees = attendees;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getStartHour() {
        return startHour;
    }

    @Override
    public String getEndHour() {
        return endHour;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getAttendees() {
        return attendees;
    }

    @Override
    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public void addToCalendar() {
        if (calendar != null) {
            calendar.addSession(this);
            System.out.println(
                    "Photo Session{" +
                            "Date=" + date +
                            ", Start Hour=" + startHour +
                            ", End Hour=" + endHour +
                            ", Title=" + title +
                            ", Attendees=" + attendees +
                            "}");
        } else {
            System.out.println("No calendar assigned for this session.");
        }
    }
}
