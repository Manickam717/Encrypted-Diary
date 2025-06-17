package Project.EncryptedDiary;

import java.io.*;
import java.util.Scanner;

public class DiaryApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Encrypted Diary!");
        System.out.println("1. Login");
        System.out.println("2. Register");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (choice == 1) {
            if (UserAuth.login(username, password)) {
                System.out.println("Login successful!");
                int option;
                do {
                    System.out.println("\n1. Add Entry\n2. View Entries\n3. Logout");
                    option = sc.nextInt();
                    sc.nextLine(); // consume newline

                    switch (option) {
                        case 1 -> DiaryManager.addEntry(username, password);
                        case 2 -> DiaryManager.viewEntries(username, password);
                        case 3 -> System.out.println("Logged out.");
                        default -> System.out.println("Invalid option.");
                    }
                } while (option != 3);

            } else {
                System.out.println("Login failed. Incorrect credentials.");
            }
        } else if (choice == 2) {
            if (UserAuth.register(username, password)) {
                System.out.println("Registration successful! Please login.");
            }
        }
    }
}
