package Project.EncryptedDiary;

import java.io.*;
import java.util.*;

public class UserAuth {
    private static String USER_FILE = "your_users_file_path";

    public static boolean register(String username, String password) throws IOException {
        if (userExists(username)) {
            System.out.println("User already exists!");
            return false;
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE, true));
        writer.write(username + "," + password);
        writer.newLine();
        writer.close();
        return true;
    }

    public static boolean login(String username, String password) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(USER_FILE));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts[0].equals(username) && parts[1].equals(password)) {
                reader.close();
                return true;
            }
        }
        reader.close();
        return false;
    }

    private static boolean userExists(String username) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(USER_FILE));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith(username + ",")) {
                reader.close();
                return true;
            }
        }
        reader.close();
        return false;
    }
}
