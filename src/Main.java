// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create a hotel
        Hotel hotel = new Hotel("Grand Hotel", "08:00", "22:00", "123 Main Street");

        // Create categories
        String[] equipments = {"TV", "Wi-Fi"};
        String[] equipments2 = {"TV", "AC","Wi-Fi"};
        Categorie singleRoomCategory = new Categorie("Single Room", 100, 2,equipments);
        Categorie doubleRoomCategory = new Categorie("Double Room", 150, 2,equipments);
        Categorie suite = new Categorie("Suite", 200, 3,equipments2);
        try {
            // Add categories to the hotel
            hotel.addCategory(singleRoomCategory);
            hotel.addCategory(doubleRoomCategory);
            hotel.addCategory(suite);
        }catch (CategoryExistException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display hotel information
        System.out.println("Hotel Information:");
        System.out.println(hotel);

        System.out.println("Category Information:");
        System.out.println(singleRoomCategory);


        // Create rooms
        Room room1 = new Room(101, singleRoomCategory, 1);
        Room room2 = new Room(102,doubleRoomCategory,2);
        Room room3 = new Room(103,doubleRoomCategory,2);

        // Add rooms to the category
        try {
            singleRoomCategory.addRoom(room1);
            singleRoomCategory.addRoom(room2);
        }catch(RoomExistException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display updated category information
        System.out.println("\nCategory Information after adding rooms:");
        System.out.println(singleRoomCategory);
        singleRoomCategory.displayRooms();




       /*// Display room information
        System.out.println("Room Information:");
        System.out.println(room1);

        // Add a date to the room
        room1.addDate(new Date()); // Assuming you have a Date object or use java.util.Date directly

        // Display updated room information
        System.out.println("\nRoom Information after adding a date:");
        System.out.println(room1);

        // Add a consommation to the room
        Consommation consommation1 = new Consommation("Water", 2.5);
        room1.addCons(consommation1);

        // Display final room information
        System.out.println("\nRoom Information after adding a consommation:");
        System.out.println(room1);*/

    }
}