# Photography Session Scheduler

The Photography Session Scheduler is a simple Java application designed to manage and schedule different types of sessions: Photo Sessions, Video Sessions, and Product Sessions. This application helps in organizing sessions, avoiding scheduling conflicts, and maintaining a calendar of events.

## MVP (Minimum Viable Product)

The MVP of this program includes the following functionalities:

### Session Types:

1. **Photo Session**: A session for capturing photos.
2. **Video Session**: A session for shooting videos, specifying the type of clip (short, long or both).
3. **Product Session**: A session related to products, specifying the type and quantity of products.

### Features:

- **Adding Sessions**: Users can add different types of sessions by providing session details such as date, start and end hours, and session title.
- **Avoiding Conflicts**: The program prevents scheduling conflicts by checking for existing sessions at the specified time.
- **Calendar View**: Displays all scheduled sessions in a calendar view.
- **User Input**: Utilizes a command-line interface to take user input for scheduling sessions.

## How to Use:

1. **Run the Program**: Execute the program in a Java environment.
2. **Choose Session Type**: Select the type of session (Photo, Video, Product) you want to schedule.
3. **Provide Session Details**: Enter the required details for the session (date, start and end hours, title).
4. **For Video Sessions**: If scheduling a video session, input the type of video (short, long or both)
5. **For Product Sessions**: If scheduling a product session, input the product type and the number of products.
6. **Repeat or Exit**: Choose whether to add another session or exit the program.

## Development Information:

- **Language**: Java
- **Classes**: Session, PhotoSession, VideoSession, ProductSession, SessionFactory, SessionType, Calendar