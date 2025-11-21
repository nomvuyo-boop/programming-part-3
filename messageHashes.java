public static void deleteByHash(String hash) {
    for (Message m : sentMessages) {
        if (m.getHash().equals(hash)) {
            sentMessages.remove(m);
            messageHashes.remove(hash);
            messageIds.remove(m.getMessageId());
            System.out.println("Message deleted.");
            return;
        }
    }
    System.out.println("Message hash not found.");
}
