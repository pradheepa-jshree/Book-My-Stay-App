// Main class to demonstrate room search functionality
public class UseCase4RoomSearch {
    public static void main(String[] args) {
        // Print header
        System.out.println("Room Search");
        System.out.println();
        
        // Create room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();
        
        // Create inventory object
        RoomInventory inventory = new RoomInventory();
        
        // Create search service object
        RoomSearchService searchService = new RoomSearchService();
        
        // Search and display available rooms
        searchService.searchAvailableRooms(inventory, singleRoom, doubleRoom, suiteRoom);
    }
}
