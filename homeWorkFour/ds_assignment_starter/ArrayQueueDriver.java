// ArrayQueueDriver.java
// Starter file for the Queue portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runQ2_CallCenterQueue).

public class ArrayQueueDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        //runQ1_PrintQueue();
        //runQ2_CallCenterQueue();
        //runQ3_ThemeParkRideLine();
        //runQ4_CustomerServiceTickets();
        //runQ5_TaskSchedulingQueue();
        //runQ6_CheckoutLine();
        //runQ7_MessageQueueChatApp();
        //runQ8_PrintSpoolingBurst();
        //runQ9_RoundRobinService();
    }

    // Q1 – Print Queue
    private static void runQ1_PrintQueue() {
        // TODO: Implement task Q1 here.
        ArrayQueue<String> printqueue = new ArrayQueue<>();
        printqueue.add("hw.pdf");
        printqueue.add("Bill Estimate.doc");
        printqueue.remove(); // Prints the first document queued
    }

    // Q2 – Call Center Queue
    private static void runQ2_CallCenterQueue() {
        // TODO: Implement task Q2 here.
        ArrayQueue<String> callcenterqueue = new ArrayQueue<>();
        callcenterqueue.add("Torrence"); // Calling and put on hold
        callcenterqueue.add("Carol");
        System.out.println("New caller put off hold.");
        callcenterqueue.remove();
        callcenterqueue.add("Matt");
        System.out.println("New caller put off hold.");
        callcenterqueue.remove();
        System.out.println("New caller put off hold.");
        callcenterqueue.remove();
    }

    // Q3 – Theme Park Ride Line
    private static void runQ3_ThemeParkRideLine() {
        // TODO: Implement task Q3 here.
        ArrayQueue<String> themeparkrideline = new ArrayQueue<>();
        themeparkrideline.add("Torrence");
        themeparkrideline.add("Carol");
        themeparkrideline.add("Matt");
        System.out.println("Ride is now ready to b boarded.");
        themeparkrideline.remove();
        themeparkrideline.remove();
        themeparkrideline.remove();
    }

    // Q4 – Customer Service Tickets
    private static void runQ4_CustomerServiceTickets() {
        // TODO: Implement task Q4 here.
        ArrayQueue<Integer> customerservicetickets = new ArrayQueue<>();
        customerservicetickets.add(568); // Service ticket
        customerservicetickets.add(569);
        System.out.println("568!");
        customerservicetickets.remove();
        customerservicetickets.add(570);
        System.out.println("569!");
        customerservicetickets.remove();
        System.out.println("570!");
        customerservicetickets.remove();
    }

    // Q5 – Task Scheduling Queue
    private static void runQ5_TaskSchedulingQueue() {
        // TODO: Implement task Q5 here.
        ArrayQueue<String> taskschedulingqueue = new ArrayQueue<>();
        taskschedulingqueue.add("Execute function");
        taskschedulingqueue.remove(); // Execution
        taskschedulingqueue.add("Store file in memory");
        taskschedulingqueue.remove();
        taskschedulingqueue.add("Copy final contents in other address");
        taskschedulingqueue.remove();
    }

    // Q6 – Checkout Line at a Store
    private static void runQ6_CheckoutLine() {
        // TODO: Implement task Q6 here.
        ArrayQueue<String> checkoutline = new ArrayQueue<>();
        checkoutline.add("Torrence");
        checkoutline.add("Carol");
        System.out.println("Now serving " + checkoutline.remove());
        checkoutline.add("Matt");
        System.out.println("Now serving " + checkoutline.remove());
        System.out.println("Now serving " + checkoutline.remove());
    }

    // Q7 – Message Queue in a Chat App
    private static void runQ7_MessageQueueChatApp() {
        // TODO: Implement task Q7 here.
        ArrayQueue<String> messagequeuechatapp = new ArrayQueue<>();
        messagequeuechatapp.add("Hey");
        messagequeuechatapp.add("How was your day?");
        messagequeuechatapp.remove(); // Sending after a short while of the messages being entered
        messagequeuechatapp.remove();
        messagequeuechatapp.add("Ok");
        messagequeuechatapp.remove();
        messagequeuechatapp.add("Wow, ur dry");
        messagequeuechatapp.remove();
    }

    // Q8 – Print Spooling with Burst of Jobs
    private static void runQ8_PrintSpoolingBurst() {
        // TODO: Implement task Q8 here.
        ArrayQueue<String> printspoolingburst = new ArrayQueue<>();
        printspoolingburst.add("hw.pdf");
        printspoolingburst.add("Bill Estimate.doc");
        printspoolingburst.add("Bill Estimate_1.doc");
        printspoolingburst.add("Bill Estimate_2.doc");
        printspoolingburst.add("Stewart Calculus Textbook FREE DOWNLOAD libgen.pdf");
        printspoolingburst.add("hundreddollarbills.png");
        printspoolingburst.remove(); // Printing
        printspoolingburst.remove();
        printspoolingburst.remove();
        printspoolingburst.remove();
        printspoolingburst.remove();
        printspoolingburst.remove();
    }

    // Q9 – Round-Robin Service (Single Queue Version)
    private static void runQ9_RoundRobinService() {
        // TODO: Implement task Q9 here.
        ArrayQueue<String> roundrobinservice = new ArrayQueue<>();
        int rounds = 10;
    }
}
