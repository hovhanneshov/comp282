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
        printqueue.offer("hw.pdf");
        System.out.println(printqueue.peek() + " was added to the print job.");
        printqueue.offer("Bill Estimate.doc");
        System.out.println(printqueue.peek() + " was added to the print job.");
        System.out.println(printqueue.poll() + " was printed."); // Prints the first document queued
        System.out.println(printqueue.peek() + " is up next.");
    }

    // Q2 – Call Center Queue
    private static void runQ2_CallCenterQueue() {
        // TODO: Implement task Q2 here.
        ArrayQueue<String> callcenterqueue = new ArrayQueue<>();
        callcenterqueue.offer("Torrence"); // Calling and put on hold
        System.out.println(callcenterqueue.peek() + ", you are on hold. Please wait.");
        callcenterqueue.offer("Carol");
        System.out.println(callcenterqueue.poll() + "? Hi, how can we help you today?");
        System.out.println(callcenterqueue.peek() + ", you are on hold. Please wait.");
        callcenterqueue.offer("Matt");
        System.out.println(callcenterqueue.peek() + ", you are on hold. Please wait.");
        System.out.println(callcenterqueue.poll() + "? Hi, how can we help you today?");
        System.out.println(callcenterqueue.peek() + ", you are on hold. Please wait.");
        System.out.println(callcenterqueue.poll() + "? Hi, how can we help you today?");
        if(callcenterqueue.isEmpty())
            System.out.println("Queue is now empty");
    }

    // Q3 – Theme Park Ride Line
    private static void runQ3_ThemeParkRideLine() {
        // TODO: Implement task Q3 here.
        ArrayQueue<String> themeparkrideline = new ArrayQueue<>();
        themeparkrideline.offer("Torrence");
        System.out.println(themeparkrideline.peek() + " is now waiting in line");
        themeparkrideline.offer("Carol");
        System.out.println(themeparkrideline.peek() + " is now waiting in line");
        themeparkrideline.offer("Matt");
        System.out.println(themeparkrideline.peek() + " is now waiting in line");
        System.out.println("Ride is now ready to be boarded.");
        System.out.println(themeparkrideline.poll() + " is now boarding, have fun!");
        System.out.println(themeparkrideline.poll() + " is now boarding, have fun!");
        System.out.println(themeparkrideline.poll() + " is now boarding, have fun!");
        if(themeparkrideline.isEmpty())
            System.out.println("Queue is now empty");
    }

    // Q4 – Customer Service Tickets
    private static void runQ4_CustomerServiceTickets() {
        // TODO: Implement task Q4 here.
        ArrayQueue<Integer> customerservicetickets = new ArrayQueue<>();
        int wait = 0;
        customerservicetickets.offer(568); // Service ticket
        System.out.println(customerservicetickets.peek() + " will be serviced shortly.");
        wait++;
        customerservicetickets.offer(569);
        System.out.println(customerservicetickets.peek() + " will be serviced in " + wait +" turn(s).");
        wait++;
        System.out.println("568!");
        customerservicetickets.poll();
        wait--;
        System.out.println(customerservicetickets.peek() + " will be serviced in " + wait +" turn(s).");
        customerservicetickets.offer(570);
        wait++;
        System.out.println(customerservicetickets.peek() + " will be serviced in " + wait +" turn(s).");
        System.out.println("569!");
        customerservicetickets.poll();
        wait--;
        System.out.println(customerservicetickets.peek() + " will be serviced in " + wait +" turn(s).");
        System.out.println("570!");
        customerservicetickets.poll();
        wait--;
        System.out.println(customerservicetickets.peek() + " will be serviced in " + wait +"turn(s).");
    }

    // Q5 – Task Scheduling Queue
    private static void runQ5_TaskSchedulingQueue() {
        // TODO: Implement task Q5 here.
        ArrayQueue<String> taskschedulingqueue = new ArrayQueue<>();
        taskschedulingqueue.offer("Execute function");
        System.out.println("Queuing up " + taskschedulingqueue.peek());
        System.out.println("Performing task: " + taskschedulingqueue.poll()); // Execution
        taskschedulingqueue.offer("Store file in memory");
        System.out.println("Queuing up " + taskschedulingqueue.peek());
        System.out.println("Performing task: " + taskschedulingqueue.poll());
        taskschedulingqueue.offer("Copy final contents in other address");
        System.out.println("Queuing up " + taskschedulingqueue.peek());
        System.out.println("Performing task: " + taskschedulingqueue.poll());
    }

    // Q6 – Checkout Line at a Store
    private static void runQ6_CheckoutLine() {
        // TODO: Implement task Q6 here.
        ArrayQueue<String> checkoutline = new ArrayQueue<>();
        checkoutline.offer("Torrence");
        System.out.println(checkoutline.peek() + " is being queued for checkout.");
        checkoutline.offer("Carol");
        System.out.println(checkoutline.peek() + " is being queued for checkout.");
        System.out.println("Now serving " + checkoutline.poll());
        System.out.println(checkoutline.peek() + " is being queued for checkout.");
        checkoutline.offer("Matt");
        System.out.println(checkoutline.peek() + " is being queued for checkout.");
        System.out.println("Now serving " + checkoutline.poll());
        System.out.println("Now serving " + checkoutline.poll());
    }

    // Q7 – Message Queue in a Chat App
    private static void runQ7_MessageQueueChatApp() {
        // TODO: Implement task Q7 here.
        ArrayQueue<String> messagequeuechatapp = new ArrayQueue<>();
        messagequeuechatapp.offer("Hey");
        System.out.println(messagequeuechatapp.peek() + " your message is sending...");
        messagequeuechatapp.offer("How was your day?");
        System.out.println(messagequeuechatapp.peek() + " your message is sending...");
        System.out.println(messagequeuechatapp.poll()); // Sending after a short while of the messages being entered
        System.out.println(messagequeuechatapp.poll());
        System.out.println("Message was sent on 11:23");
        messagequeuechatapp.offer("Ok");
        System.out.println(messagequeuechatapp.peek() + " your message is sending...");
        System.out.println(messagequeuechatapp.poll());
        System.out.println("Message was sent on 11:21");
        messagequeuechatapp.offer("Wow, ur dry");
        System.out.println(messagequeuechatapp.peek() + " your message is sending...");
        System.out.println(messagequeuechatapp.poll());
        System.out.println("Message was sent on 11:24");
    }

    // Q8 – Print Spooling with Burst of Jobs
    private static void runQ8_PrintSpoolingBurst() {
        // TODO: Implement task Q8 here.
        ArrayQueue<String> printspoolingburst = new ArrayQueue<>();
        printspoolingburst.offer("hw.pdf");
        System.out.println(printspoolingburst.peek() + " is being queued for printing.");
        printspoolingburst.offer("Bill Estimate.doc");
        System.out.println(printspoolingburst.peek() + " is being queued for printing.");
        printspoolingburst.offer("Bill Estimate_1.doc");
        System.out.println(printspoolingburst.peek() + " is being queued for printing.");
        printspoolingburst.offer("Bill Estimate_2.doc");
        System.out.println(printspoolingburst.peek() + " is being queued for printing.");
        printspoolingburst.offer("Stewart Calculus Textbook FREE DOWNLOAD libgen.pdf");
        System.out.println(printspoolingburst.peek() + " is being queued for printing.");
        printspoolingburst.offer("hundreddollarbills.png");
        System.out.println(printspoolingburst.peek() + " is being queued for printing.");
        System.out.println(printspoolingburst.poll() + " is printing"); // Printing
        System.out.println(printspoolingburst.poll() + " is printing");
        System.out.println(printspoolingburst.poll() + " is printing");
        System.out.println(printspoolingburst.poll() + " is printing");
        System.out.println(printspoolingburst.poll() + " is printing");
        System.out.println(printspoolingburst.poll() + " is printing");
    }

    // Q9 – Round-Robin Service (Single Queue Version)
    private static void runQ9_RoundRobinService() {
        // TODO: Implement task Q9 here.
        ArrayQueue<String> roundrobinservice = new ArrayQueue<>();
        int rounds = 8;
        String[] arr = {"Torrence", "Caroll", "Matt", "Paul"};
        for(int i = 0; i < arr.length(); i++) { // Setting up queue
            roundrobinservice.offer(arr[i]);
        }
        for(int i = 1; i <= rounds; i++) { // roundrobinservice method
            String person = roundrobinservice.poll();
            System.out.println("Round " + i + ": Serving " + person);
            if(i % 2 == 1) {
                roundrobinservice.offer(person);
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
