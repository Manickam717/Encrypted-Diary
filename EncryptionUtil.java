package Project.EncryptedDiary;

public class EncryptionUtil {
    public static String encryptDecrypt(String input, String key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            result.append((char)(input.charAt(i) ^ key.charAt(i % key.length())));
        }

        return result.toString();
    }
}
