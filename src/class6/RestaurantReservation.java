package class6;

import java.util.Scanner;

public class RestaurantReservation {

    private static final String[] reservationArr = {
            "2025-01-21", "2025-01-23", "2025-01-24", "2025-01-29"
    };

    private static final String[] bookedArr = {
            "2025-01-21", "2025-01-23"
    };

    public static boolean checkAvailability(String date) {

        // Check if date is in the allowed reservation dates
        boolean isReservable = false;
        for (String reservableDate : reservationArr) {
            if (reservableDate.equals(date)) {
                isReservable = true;
                break;
            }
        }

        if (!isReservable) {
            return false;
        }

        for (String bookedDate : bookedArr) {
            if (bookedDate.equals(date)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Westcliff Restaurant Reservation System ===");
        System.out.println("Available reservation dates: 2025-01-21, 2025-01-23, 2025-01-24, 2025-01-29");
        System.out.println("Currently booked: 2025-01-21, 2025-01-23\n");

        while (true) {
            System.out.print("Enter the date you want to reserve (YYYY-MM-DD) or type 'exit' to quit: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using our reservation system. Goodbye!");
                break;
            }

            if (input.isEmpty()) {
                System.out.println("Please enter a valid date.\n");
                continue;
            }

            boolean available = checkAvailability(input);

            if (available) {
                System.out.println("✓ Great news! " + input + " is AVAILABLE for reservation.");
                System.out.println("You can proceed with booking.\n");
            } else {
                System.out.println("✗ Sorry, " + input + " is NOT AVAILABLE.");
                System.out.println("   Reason: Either not in our reservation schedule or already booked.\n");
            }
        }

        scanner.close();
    }
}