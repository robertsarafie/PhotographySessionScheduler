public class VideoSession implements Session {
    private String date;
    private String startHour;
    private String endHour;
    private String title;
    private String attendees;
    private String videoType;
    private Calendar calendar;

    public VideoSession(String date, String startHour, String endHour, String title, String attendees, String videoType) {
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
        this.title = title;
        this.attendees = attendees;
        this.videoType = videoType;
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

    public String getVideoType() {
        return videoType;
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
                    "Video Session{" +
                            "Date=" + date +
                            ", Start Hour=" + startHour +
                            ", End Hour=" + endHour +
                            ", Title=" + title +
                            ", Attendees=" + attendees +
                            ", Video Type=" + videoType +
                            "}");
        } else {
            System.out.println("No calendar assigned for this session.");
        }
    }
}