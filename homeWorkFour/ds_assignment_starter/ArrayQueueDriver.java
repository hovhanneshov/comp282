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
        System.out.println(printqueue.peek() + " was added to the print job.");
        printqueue.add("Bill Estimate.doc");
        System.out.println(printqueue.peek() + " was added to the print job.");
        System.out.println(printqueue.remove() + " was printed."); // Prints the first document queued
        System.out.println(printqueue.peek() + " is up next.");
    }

    // Q2 – Call Center Queue
    private static void runQ2_CallCenterQueue() {
        // TODO: Implement task Q2 here.
        ArrayQueue<String> callcenterqueue = new ArrayQueue<>();
        callcenterqueue.add("Torrence"); // Calling and put on hold
        System.out.println(callcenterqueue.peek() + ", you are on hold. Please wait.");
        callcenterqueue.add("Carol");
        System.out.println(callcenterqueue.remove() + "? Hi, how can we help you today?");
        System.out.println(callcenterqueue.peek() + ", you are on hold. Please wait.");
        callcenterqueue.add("Matt");
        System.out.println(callcenterqueue.peek() + ", you are on hold. Please wait.");
        System.out.println(callcenterqueue.remove() + "? Hi, how can we help you today?");
        System.out.println(callcenterqueue.peek() + ", you are on hold. Please wait.");
        System.out.println(callcenterqueue.remove() + "? Hi, how can we help you today?");
        if(callcenterqueue.isEmpty())
            System.out.println("Queue is now empty");
    }

    // Q3 – Theme Park Ride Line
    private static void runQ3_ThemeParkRideLine() {
        // TODO: Implement task Q3 here.
        ArrayQueue<String> themeparkrideline = new ArrayQueue<>();
        themeparkrideline.add("Torrence");
        System.out.println(themeparkrideline.peek() + " is now waiting in line");
        themeparkrideline.add("Carol");
        System.out.println(themeparkrideline.peek() + " is now waiting in line");
        themeparkrideline.add("Matt");
        System.out.println(themeparkrideline.peek() + " is now waiting in line");
        System.out.println("Ride is now ready to be boarded.");
        System.out.println(themeparkrideline.remove() + " is now boarding, have fun!");
        System.out.println(themeparkrideline.remove() + " is now boarding, have fun!");
        System.out.println(themeparkrideline.remove() + " is now boarding, have fun!");
        if(themeparkrideline.isEmpty())
            System.out.println("Queue is now empty");
    }

    // Q4 – Customer Service Tickets
    private static void runQ4_CustomerServiceTickets() {
        // TODO: Implement task Q4 here.
        ArrayQueue<Integer> customerservicetickets = new ArrayQueue<>();
        int wait = 0;
        customerservicetickets.add(568); // Service ticket
        System.out.println(customerservicetickets.peek() + " will be serviced shortly.");
        wait++;
        customerservicetickets.add(569);
        System.out.println(customerservicetickets.peek() + " will be serviced in " + wait +" turn(s).");
        wait++;
        System.out.println("568!");
        customerservicetickets.remove();
        wait--;
        System.out.println(customerservicetickets.peek() + " will be serviced in " + wait +" turn(s).");
        customerservicetickets.add(570);
        wait++;
        System.out.println(customerservicetickets.peek() + " will be serviced in " + wait +" turn(s).");
        System.out.println("569!");
        customerservicetickets.remove();
        wait--;
        System.out.println(customerservicetickets.peek() + " will be serviced in " + wait +" turn(s).");
        System.out.println("570!");
        customerservicetickets.remove();
        wait--;
        System.out.println(customerservicetickets.peek() + " will be serviced in " + wait +"turn(s).");
    }

    // Q5 – Task Scheduling Queue
    private static void runQ5_TaskSchedulingQueue() {
        // TODO: Implement task Q5 here.
        ArrayQueue<String> taskschedulingqueue = new ArrayQueue<>();
        taskschedulingqueue.add("Execute function");
        taskschedulingqueue.peek();
        taskschedulingqueue.remove(); // Execution
        taskschedulingqueue.add("Store file in memory");
        taskschedulingqueue.peek();
        taskschedulingqueue.remove();
        taskschedulingqueue.add("Copy final contents in other address");
        taskschedulingqueue.peek();
        taskschedulingqueue.remove();
    }

    // Q6 – Checkout Line at a Store
    private static void runQ6_CheckoutLine() {
        // TODO: Implement task Q6 here.
        ArrayQueue<String> checkoutline = new ArrayQueue<>();
        checkoutline.add("Torrence");
        checkoutline.peek();
        checkoutline.add("Carol");
        checkoutline.peek();
        System.out.println("Now serving " + checkoutline.remove());
        checkoutline.peek();
        checkoutline.add("Matt");
        checkoutline.peek();
        System.out.println("Now serving " + checkoutline.remove());
        System.out.println("Now serving " + checkoutline.remove());
    }

    // Q7 – Message Queue in a Chat App
    private static void runQ7_MessageQueueChatApp() {
        // TODO: Implement task Q7 here.
        ArrayQueue<String> messagequeuechatapp = new ArrayQueue<>();
        messagequeuechatapp.add("Hey");
        messagequeuechatapp.peek();
        messagequeuechatapp.add("How was your day?");
        messagequeuechatapp.peek();
        messagequeuechatapp.remove(); // Sending after a short while of the messages being entered
        messagequeuechatapp.remove();
        System.out.println("Message was sent on 11:23");
        messagequeuechatapp.add("Ok");
        messagequeuechatapp.peek();
        messagequeuechatapp.remove();
        System.out.println("Message was sent on 11:21");
        messagequeuechatapp.add("Wow, ur dry");
        messagequeuechatapp.peek();
        messagequeuechatapp.remove();
        System.out.println("Message was sent on 11:24");
    }

    // Q8 – Print Spooling with Burst of Jobs
    private static void runQ8_PrintSpoolingBurst() {
        // TODO: Implement task Q8 here.
        ArrayQueue<String> printspoolingburst = new ArrayQueue<>();
        printspoolingburst.add("hw.pdf");
        printspoolingburst.peek();
        printspoolingburst.add("Bill Estimate.doc");
        printspoolingburst.peek();
        printspoolingburst.add("Bill Estimate_1.doc");
        printspoolingburst.peek();
        printspoolingburst.add("Bill Estimate_2.doc");
        printspoolingburst.peek();
        printspoolingburst.add("Stewart Calculus Textbook FREE DOWNLOAD libgen.pdf");
        printspoolingburst.peek();
        printspoolingburst.add("hundreddollarbills.png");
        printspoolingburst.peek();
        printspoolingburst.remove(); // Printing
        printspoolingburst.peek();
        printspoolingburst.remove();
        printspoolingburst.peek();
        printspoolingburst.remove();
        printspoolingburst.peek();
        printspoolingburst.remove();
        printspoolingburst.peek();
        printspoolingburst.remove();
        printspoolingburst.peek();
        printspoolingburst.remove();
    }

    // Q9 – Round-Robin Service (Single Queue Version)
    private static void runQ9_RoundRobinService() {
        // TODO: Implement task Q9 here.
        ArrayQueue<String> roundrobinservice = new ArrayQueue<>();
        int rounds = 8;
        String[] arr = {"Torrence", "Caroll", "Matt", "Paul"};
        for(int i = 0; i < arr.length(); i++) { // Setting up queue
            roundrobinservice.add(arr[i]);
        }
        for(int i = 1; i <= rounds; i++) { // roundrobinservice method
            String person = roundrobinservice.remove();
            System.out.println("Round " + i + ": Serving " + person);
            if(i % 2 == 1) {
                roundrobinservice.add(person);
                System.out.println(person + " requeued for more service.");
            }
            else
                System.out.println(person + " is finished.");
            if(roundrobinservice.isEmpty()) {
                System.out.println("All people finished. Stopping early.");
                break;
            }
        }
    }
}
