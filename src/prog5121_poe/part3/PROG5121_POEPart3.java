package prog5121_poe.part3;

public class PROG5121_POEPart3 {

    public static void main(String[] args) {

        Message[] sentMessages = new Message[10];
        Message[] storedMessages = new Message[10];
        Message[] disregardedMessages = new Message[10];

        int sentCount = 0;
        int storedCount = 0;
        int disregardedCount = 0;

        Message msg1 = new Message(
                "0838884567",
                "+27834557896",
                "Did you get the cake?",
                "Sent");

        Message msg2 = new Message(
                "MSG2",
                "+27838884567",
                "Where are you? You are late! I have asked you to be on time.",
                "Stored");

        Message msg3 = new Message(
                "MSG3",
                "+27834484567",
                "Yohoooo, I am at your gate.",
                "Disregard");

        Message msg4 = new Message(
                "0838884567",
                "0838884567",
                "It is dinner time!",
                "Sent");

        Message msg5 = new Message(
                "MSG5",
                "+27838884567",
                "Ok, I am leaving without you.",
                "Stored");

        sentMessages[sentCount] = msg1;
        sentCount++;

        storedMessages[storedCount] = msg2;
        storedCount++;

        disregardedMessages[disregardedCount] = msg3;
        disregardedCount++;

        sentMessages[sentCount] = msg4;
        sentCount++;

        storedMessages[storedCount] = msg5;
        storedCount++;

        System.out.println("Sent messages: " + sentCount);
        System.out.println("Stored messages: " + storedCount);
        System.out.println("Disregarded messages: " + disregardedCount);

        System.out.println("\nStored Messages:");

        for (int i = 0; i < storedCount; i++) {

            System.out.println("Recipient: "
                    + storedMessages[i].getRecipient());

            System.out.println("Message: "
                    + storedMessages[i].getMessageText());

            System.out.println("Hash: "
                    + storedMessages[i].getMessageHash());

            System.out.println("-----------------------");
        }
    }
}