import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calendar myCalendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);

        SessionFactory sessionFactory = new SessionFactory();

        while (true) {
            System.out.println("Choose session type (PHOTO, VIDEO, PRODUCT):");
            String sessionTypeInput = scanner.nextLine();

            SessionType sessionType = SessionType.valueOf(sessionTypeInput.toUpperCase());

            Session session = sessionFactory.createSessionFromUserInput(sessionType);
            session.setCalendar(myCalendar);
            session.addToCalendar();

            System.out.println("Do you want to add another session? (yes/no)");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("All sessions in the calendar:");
        for (Session session : myCalendar.getAllSessions()) {
            System.out.println(session);
        }

//        System.out.println("Session created:");
//        System.out.println(session);
    }

}
