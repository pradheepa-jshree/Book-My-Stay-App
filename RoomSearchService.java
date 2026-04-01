// Import Map interface for working with availability data
import java.util.Map;

// Service class for searching available rooms (read-only operations)
public class RoomSearchService {
    
    // Method to search and display available rooms
    // This method is read-only and does not modify inventory
    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {
        
        // Get room availability from inventory (read-only)
        Map<String, Integer> availability = inventory.getRoomAvailability();
        
        // Check and display Single Room if available
        if (availability.get("Single") > 0) {
            System.out.println("Single Room:");
            singleRoom.displayRoomDetails();
            System.out.println("Available: " + availability.get("Single"));
            System.out.println();
        }
        
        // Check and display Double Room if available
        if (availability.get("Double") > 0) {
            System.out.println("Double Room:");
            doubleRoom.displayRoomDetails();
            System.out.println("Available: " + availability.get("Double"));
            System.out.println();
        }
        
        // Check and display Suite Room if available
        if (availability.get("Suite") > 0) {
            System.out.println("Suite Room:");
            suiteRoom.displayRoomDetails();
            System.out.println("Available: " + availability.get("Suite"));
        }
    }
}
