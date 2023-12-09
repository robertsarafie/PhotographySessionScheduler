import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private static Calendar instance;
    private List<Session> sessions;

    private Calendar() {
        this.sessions = new ArrayList<>();
    }

    public static Calendar getInstance() {
        if (instance == null) {
            instance = new Calendar();
        }
        return instance;
    }

    public void addSession(Session session) {
        if (!isDuplicateSession(session)) {
            sessions.add(session);
        } else {
            System.out.println("There is already a session at that time");
        }
    }

    public void removeSession(Session session) {
        sessions.remove(session);
    }

    public List<Session> getAllSessions() {
        return sessions;
    }

    private boolean isDuplicateSession(Session newSession) {
        for(Session existingSession : sessions) {
            if(existingSession.getDate().equals(newSession.getDate()) && existingSession.getStartHour().equals(newSession.getStartHour())) {
                return true;
            }
        }
        return false;
    }
}


