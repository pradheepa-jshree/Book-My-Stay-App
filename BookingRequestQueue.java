// BookingRequestQueue manages booking requests in FIFO order using a Queue
import java.util.Queue;
import java.util.LinkedList;

public class BookingRequestQueue {
    // Queue to store reservation requests (FIFO)
    private Queue<Reservation> requestQueue;

    // Constructor initializes the LinkedList-backed queue
    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    // Add a reservation request to the queue
    public void addRequest(Reservation reservation) {
        requestQueue.add(reservation);
        System.out.println("Booking request added for " + reservation.guestName);
    }

    // Display all requests in FIFO order
    public void displayAllRequests() {
        System.out.println();
        System.out.println("All Booking Requests:");
        for (Reservation r : requestQueue) {
            r.displayReservation();
            System.out.println();
        }
    }

    // Display requests without a header (useful for remaining requests)
    public void displayRequestsWithoutHeader() {
        for (Reservation r : requestQueue) {
            r.displayReservation();
            System.out.println();
        }
    }

    // Process (remove) the next request in FIFO order
    public void processNextRequest() {
        Reservation next = requestQueue.poll();
        if (next == null) {
            System.out.println("No requests to process.");
            return;
        }
        System.out.println();
        System.out.println("Processing request:");
        next.displayReservation();
    }
}
