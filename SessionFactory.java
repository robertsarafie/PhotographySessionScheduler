import java.util.Scanner;

public class SessionFactory {
    private static SessionFactory instance;

    private SessionFactory() {}

    public static SessionFactory getInstance() {
        if (instance == null) {
            instance = new SessionFactory();
        }
        return instance;
    }

    public Session createSessionFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the of session in this format: dd.MM.yyyy");
        String date = scanner.nextLine();

        System.out.println("Enter the start hour for our session");
        String startHour = scanner.nextLine();

        System.out.println("Enter the end hour for our session");
        String endHour = scanner.nextLine();

        System.out.println("Enter session title: ");
        String title = scanner.nextLine();

        System.out.println("Enter attendees: ");
        String attendees = scanner.nextLine();

        Session session = new Session(date, startHour, endHour, title, attendees);

        return session;
    }
}
