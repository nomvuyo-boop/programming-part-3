private static ArrayList<Message> storedMessages = new ArrayList<>();

public static void loadStoredMessages() {
    try {
        JSONParser parser = new JSONParser();
        JSONArray arr = (JSONArray) parser.parse(new FileReader("storedMessages.json"));

        for (Object obj : arr) {
            JSONObject jsonObj = (JSONObject) obj;

            String id = (String) jsonObj.get("messageId");
            String sender = (String) jsonObj.get("sender");
            String recipient = (String) jsonObj.get("recipient");
            String content = (String) jsonObj.get("content");

            String hash = Integer.toHexString(content.hashCode());

            storedMessages.add(new Message(id, sender, recipient, content, hash));
        }

        System.out.println("Stored messages loaded successfully.");
    } catch (Exception e) {
        System.out.println("Error loading JSON: " + e.getMessage());
    }
}
