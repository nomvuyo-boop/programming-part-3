import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MessagingSystem {

    // Required POE arrays
    private static ArrayList<Message> sentMessages = new ArrayList<>();
    private static ArrayList<Message> disregardedMessages = new ArrayList<>();
    private static ArrayList<Message> storedMessages = new ArrayList<>();

    private static ArrayList<String> messageHashes = new ArrayList<>();
    private static ArrayList<String> messageIds = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MESSAGING SYSTEM MENU ---");
            System.out.println("1. Send a Message");
            System.out.println("2. Load Stored Messages (JSON)");
            System.out.println("3. Display Senders and Recipients");
            System.out.println("4. Display Longest Message");
            System.out.println("5. Search by Message ID");
            System.out.println("6. Search by Recipient");
            System.out.println("7. Delete Message by Hash");
            System.out.println("8. Display Full Report");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> sendMessage(input);
                case 2 -> loadStoredMessages();
                case 3 -> displaySendersAndRecipients();
                case 4 -> displayLongestMessage();
                case 5 -> {
                    System.out.print("Enter Message ID: ");
                    searchByMessageId(input.nextLine());
                }
                case 6 -> {
                    System.out.print("Enter Recipient Name: ");
                    searchByRecipient(input.nextLine());
                }
                case 7 -> {
                    System.out.print("Enter Message Hash: ");
                    deleteByHash(input.nextLine());
                }
                case 8 -> displayFullReport();
                case 9 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
