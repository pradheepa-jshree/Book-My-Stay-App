// Main class to demonstrate FIFO booking request queue
public class UseCase5BookingRequestQueue {
    public static void main(String[] args) {
        // Header
        System.out.println("Booking Request Queue");
        System.out.println();

        // Create the booking request queue
        BookingRequestQueue queue = new BookingRequestQueue();

        // Create reservations
        Reservation r1 = new Reservation("Alice", "Single");
        Reservation r2 = new Reservation("Bob", "Double");
        Reservation r3 = new Reservation("Charlie", "Suite");

        // Add requests to the queue (FIFO)
        queue.addRequest(r1);
        queue.addRequest(r2);
        queue.addRequest(r3);

        // Display all requests
        queue.displayAllRequests();

        // Process the next request (should be Alice)
        queue.processNextRequest();

        // Display remaining requests
        System.out.println();
        System.out.println("Remaining Requests:");
        queue.displayRequestsWithoutHeader();
    }
}
