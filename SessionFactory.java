import java.util.Scanner;

public class SessionFactory {
    public Session createSessionFromUserInput(SessionType type) {
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

        switch (type) {
            case PHOTO:
                return new PhotoSession(date, startHour, endHour, title, attendees);
            case VIDEO:
                System.out.println("Enter video type, long clip, short clip or both");
                String videoType = scanner.nextLine();

                return new VideoSession(date, startHour, endHour, title, attendees, videoType);
            case PRODUCT:
                System.out.println("Enter product type:");
                String productType = scanner.nextLine();

                System.out.println("Enter number of products:");
                int numberOfProducts = Integer.parseInt(scanner.nextLine());

                return new ProductSession(date, startHour, endHour, title, productType, numberOfProducts);
            default:
                return null;
        }
    }
}
