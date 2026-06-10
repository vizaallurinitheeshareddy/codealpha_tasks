import java.util.Scanner;
public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== HOTEL RESERVATION SYSTEM =====");
        System.out.println("Available Room Types:");
        System.out.println("1. Standard Room (Rs.2000/day)");
        System.out.println("2. Deluxe Room (Rs.4000/day)");
        System.out.println("3. Suite Room (Rs.7000/day)");
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Choose Room Type (1-3): ");
        int roomType = sc.nextInt();
        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();
        String room = "";
        int price = 0;
        if (roomType == 1) {
            room = "Standard Room";
            price = 2000;
        } else if (roomType == 2) {
            room = "Deluxe Room";
            price = 4000;
        } else if (roomType == 3) {
            room = "Suite Room";
            price = 7000;
        } else {
            System.out.println("Invalid Room Selection");
            sc.close();
            return;}
        int totalBill = price * days;
        System.out.println("\n===== BOOKING CONFIRMED =====");
        System.out.println("Customer Name : " + name);
        System.out.println("Room Type     : " + room);
        System.out.println("Days Stayed   : " + days);
        System.out.println("Total Bill    : Rs." + totalBill);
        sc.close();}}