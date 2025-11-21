public static void searchByMessageId(String id) {
    for (Message m : sentMessages) {
        if (m.getMessageId().equals(id)) {
            System.out.println("Message found:");
            System.out.println("Sender: " + m.getSender());
            System.out.println("Recipient: " + m.getRecipient());
            System.out.println("Content: " + m.getContent());
            return;
        }
    }
    System.out.println("Message ID not found.");
}
