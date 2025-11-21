public static void displayDisregardedMessages() {
    if (disregardedMessages.isEmpty()) {
        System.out.println("No disregarded messages.");
        return;
    }

    for (Message m : disregardedMessages) {
        System.out.println("-------------------------");
        System.out.println("Sender: " + m.getSender());
        System.out.println("Recipient: " + m.getRecipient());
        System.out.println("Content: " + m.getContent());
    }
}
