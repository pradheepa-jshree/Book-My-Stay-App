// Main class to demonstrate room initialization and static availability
public class UseCase2RoomInitialization {
    public static void main(String[] args) {
        // Print header
        System.out.println("Hotel Room Initialization");
        System.out.println();
        
        // Create room objects
        SingleRoom single = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suite = new SuiteRoom();
        
        // Static availability variables for each room type
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;
        
        // Display Single Room details and availability
        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);
        System.out.println();
        
        // Display Double Room details and availability
        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);
        System.out.println();
        
        // Display Suite Room details and availability
        System.out.println("Suite Room:");
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}
