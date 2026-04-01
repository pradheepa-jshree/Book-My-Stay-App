// Import HashMap for managing room availability
import java.util.HashMap;

// Class to manage room inventory and availability
public class RoomInventory {
    // HashMap to store room type and available count
    private HashMap<String, Integer> roomAvailability;
    
    // Constructor to initialize inventory
    public RoomInventory() {
        this.roomAvailability = new HashMap<>();
        initializeInventory();
    }
    
    // Private method to load default room availability values
    private void initializeInventory() {
        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);
    }
    
    // Method to get the entire room availability map (read-only access)
    public HashMap<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }
    
    // Method to update availability for a specific room type
    public void updateAvailability(String roomType, int count) {
        if (roomAvailability.containsKey(roomType)) {
            roomAvailability.put(roomType, count);
        }
    }
}
