// Main class to demonstrate room inventory management
public class UseCase3InventorySetup {
    public static void main(String[] args) {
        // Print header
        System.out.println("Hotel Room Inventory Status");
        System.out.println();
        
        // Create room objects
        UseCase3_SingleRoom single = new UseCase3_SingleRoom();
        UseCase3_DoubleRoom doubleRoom = new UseCase3_DoubleRoom();
        UseCase3_SuiteRoom suite = new UseCase3_SuiteRoom();
        
        // Create inventory object
        RoomInventory inventory = new RoomInventory();
        
        // Get room availability from inventory
        HashMap<String, Integer> availability = inventory.getRoomAvailability();
        
        // Display Single Room details and availability
        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available Rooms: " + availability.get("Single Room"));
        System.out.println();
        
        // Display Double Room details and availability
        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + availability.get("Double Room"));
        System.out.println();
        
        // Display Suite Room details and availability
        System.out.println("Suite Room:");
        suite.displayRoomDetails();
        System.out.println("Available Rooms: " + availability.get("Suite Room"));
    }
}
