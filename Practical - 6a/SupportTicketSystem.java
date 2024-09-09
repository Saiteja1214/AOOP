package ArrayList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SupportTicketSystem {

    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nCustomer Support Ticket System");
            System.out.println("1. Add New Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Display All Pending Tickets");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter ticket description: ");
                    String ticket = scanner.nextLine();
                    ticketQueue.add(ticket);
                    System.out.println("Ticket added.");
                    break;
                case 2:
                    if (!ticketQueue.isEmpty()) {
                        String processedTicket = ticketQueue.poll();
                        System.out.println("Processed Ticket: " + processedTicket);
                    } else {
                        System.out.println("No tickets to process.");
                    }
                    break;
                case 3:
                    if (ticketQueue.isEmpty()) {
                        System.out.println("No pending tickets.");
                    } else {
                        System.out.println("Pending Tickets:");
                        for (String t : ticketQueue) {
                            System.out.println("- " + t);
                        }
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Customer Support Ticket System.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
