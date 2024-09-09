package ArrayList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory {

    public static void main(String[] args) {
        Deque<String> backStack = new ArrayDeque<>();
        Deque<String> forwardStack = new ArrayDeque<>();
        String currentPage = null;
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nBrowser History");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (currentPage != null) {
                        backStack.push(currentPage);
                    }
                    System.out.print("Enter URL of the new page: ");
                    currentPage = scanner.nextLine();
                    forwardStack.clear(); // Clear forward stack on new page visit
                    System.out.println("Page visited: " + currentPage);
                    break;
                case 2:
                    if (!backStack.isEmpty()) {
                        forwardStack.push(currentPage);
                        currentPage = backStack.pop();
                        System.out.println("Went back to: " + currentPage);
                    } else {
                        System.out.println("No previous pages.");
                    }
                    break;
                case 3:
                    if (!forwardStack.isEmpty()) {
                        backStack.push(currentPage);
                        currentPage = forwardStack.pop();
                        System.out.println("Went forward to: " + currentPage);
                    } else {
                        System.out.println("No forward pages.");
                    }
                    break;
                case 4:
                    if (currentPage != null) {
                        System.out.println("Current page: " + currentPage);
                    } else {
                        System.out.println("No current page.");
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting Browser History.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
