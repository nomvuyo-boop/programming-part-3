 public static void sendMessage(String sender, String recipient, String content) {

    if (content.length() > 200) {
        // Put into disregarded array
        disregardedMessages.add(new Message("N/A", sender, recipient, content, "N/A"));
        return;
    }

    String id = "MSG" + (sentMessages.size() + 1);
    String hash = Integer.toHexString(content.hashCode());

    Message msg = new Message(id, sender, recipient, content, hash);

    sentMessages.add(msg);
    messageIds.add(id);
    messageHashes.add(hash);

    System.out.println("Message sent!");
}

  
