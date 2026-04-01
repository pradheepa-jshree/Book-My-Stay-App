// Simple class representing a booking reservation
public class Reservation {
    // Attributes (package-private for simplicity)
    String guestName;
    String roomType;

    // Constructor to create a reservation
    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    // Display reservation details
    public void displayReservation() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
    }
}
