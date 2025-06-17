package Project.EncryptedDiary;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class DiaryManager {
    private static String DIARY_FILE = "your_diary_file_path";

    public static void addEntry(String username, String key) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your diary entry:");
        String entry = sc.nextLine();

        String encrypted = EncryptionUtil.encryptDecrypt(entry, key);
        BufferedWriter writer = new BufferedWriter(new FileWriter(DIARY_FILE, true));

        writer.write("[" + LocalDate.now() + "] " + username + " : " + encrypted);
        writer.newLine();
        writer.close();

        System.out.println("Entry saved securely!");
    }

    public static void viewEntries(String username, String key) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(DIARY_FILE));
        String line;
        System.out.println("\n--- Your Diary Entries ---");
        while ((line = reader.readLine()) != null) {
            if (line.contains(username + " : ")) {
                String encryptedPart = line.split(username + " : ")[1];
                String decrypted = EncryptionUtil.encryptDecrypt(encryptedPart, key);
                System.out.println(line.split(" : ")[0] + " : " + decrypted);
            }
        }
        reader.close();
    }
}
