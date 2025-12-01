// CSLinkedListDriver.java
// Starter file for the Linked List portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runLL3_CourseWaitlist).

import java.util.Comparator;

public class CSLinkedListDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        runLL1_Playlist();
        runLL2_TodoList();
        runLL3_CourseWaitlist();
        runLL4_TextEditorLines();
        //runLL5_RecentlyContacted();
        //runLL6_ShoppingListAddAfter();
        //runLL7_BusRouteStops();
        //runLL8_EventScheduleSorted();
        //runLL9_BugTrackerRemoveById();
        //runLL10_PlaylistShuffleCopy();
    }

    // LL1 – Music Playlist Manager
    private static void runLL1_Playlist() {
        // TODO: Implement task LL1 here.
        // See the assignment handout for the scenario description.
        CSLinkedList<String> playlist = new CSLinkedList<String>();
        playlist.add("Break on Through");
        System.out.println(playlist);
        playlist.add("Slip Inside This House");
        System.out.println(playlist);
        playlist.add("Politics As Usual");
        System.out.println(playlist);
        playlist.add("Future Days");
        System.out.println(playlist);
        playlist.add(0, "Maggot Brain");
        System.out.println(playlist);
        playlist.remove(2);
        System.out.println(playlist);
        // Every print is an O(n) operation
    }

    // LL2 – To-Do List with Priorities
    private static void runLL2_TodoList() {
        // TODO: Implement task LL2 here.
        CSLinkedList<String> todo = new CSLinkedList<String>();
        todo.add("Feed cat");
        todo.add("Take out the trash");
        todo.add("Go on a walk");
        todo.add(0, "Pay off credit card bill");
        todo.add(0,"Go to work");
        todo.remove(0);
        todo.remove(0);
        // Inserting at the front of an array is much more difficult due to their fixed sizes and having to shift all elements afterwards for O(n) whereas the time complexity for front-insertions are O(1) due to the header node
    }

    // LL3 – Course Waitlist (No Duplicates)
    private static void runLL3_CourseWaitlist() {
        // TODO: Implement task LL3 here.
        // You may add a helper method addIfAbsent(E item) to CSLinkedList if needed.
        CSLinkedList<String> coursewaitlist = new CSLinkedList<String>();
        coursewaitlist.addIfAbsent("English 101");
        coursewaitlist.addIfAbsent("Math 101");
        coursewaitlist.addIfAbsent("Math 101");
        coursewaitlist.addIfAbsent("Physics 101");
        coursewaitlist.addIfAbsent("CompSci 101");
        coursewaitlist.addIfAbsent("Physics 101");
        System.out.println(coursewaitlist);
        // If the element is absent, then the check will run through every element for O(n) before it adds the new element
    }

    // LL4 – Text Editor Line Manager
    private static void runLL4_TextEditorLines() {
        // TODO: Implement task LL4 here.
        CSLinkedList<String> lines = new CSLinkedList<String>();
        lines.add("Hello World");
        lines.add("This is a line of text");
        lines.add("This is another line of text");
        System.out.println("Original Lines:\n");
        for(int i = 0; i < lines.size(); i++) {
            System.out.println(i + " " + lines.get(i));
        }
        lines.add(1, "This is a line of text to be inserted in the middle");
        System.out.println("Lines after insertion:\n");
        for(int i = 0; i < lines.size(); i++) {
            System.out.println(i + " " + lines.get(i));
        }
        lines.remove(2);
        System.out.println("Lines after deletion:\n");
        for(int i = 0; i < lines.size(); i++) {
            System.out.println(i + " " + lines.get(i));
        }
    }

    // LL5 – Recently Contacted Friends (Move to Front)
    private static void runLL5_RecentlyContacted() {
        // TODO: Implement task LL5 here.
        // You may add a helper method moveToFront(E item) to CSLinkedList if needed.
        CSLinkedList<String> recentlycontacted = new CSLinkedList<String>();
        recentlycontacted.moveToFront("Leslie");
        recentlycontacted.moveToFront("Jack");
        recentlycontacted.moveToFront("Chris");
        recentlycontacted.moveToFront("Jacob");
        recentlycontacted.moveToFront("Chris");
        recentlycontacted.moveToFront("Jacob");
        recentlycontacted.moveToFront("Jack");
        // An empty call of moveToFront will always result in O(n)
    }

    // LL6 – Shopping List: Insert After Item
    private static void runLL6_ShoppingListAddAfter() {
        // TODO: Implement task LL6 here.
        // You may add a helper method addAfter(E target, E newItem) to CSLinkedList if needed.
        CSLinkedList<String> shoppinglistaddafter = new CSLinkedList<String>();
        shoppinglistaddafter.add("Milk");
        shoppinglistaddafter.addAfter("Milk", "Cereal");
        shoppinglistaddafter.add("Eggs");
        shoppinglistaddafter.addAfter("Milk", "Cookies");
    }

    // LL7 – Bus Route Stops
    private static void runLL7_BusRouteStops() {
        // TODO: Implement task LL7 here.
        CSLinkedList<String> busroutestops =  new CSLinkedList<String>();
        busroutestops.add("Metro Station");
        busroutestops.add("Big Buildings City Stop");
        busroutestops.add("London");
        busroutestops.add(1, "New York");
        System.out.println(busroutestops);
        busroutestops.remove("Metro Station");
        System.out.println(busroutestops);
    }

    // LL8 – Event Schedule (Insert by Time)
    private static void runLL8_EventScheduleSorted() {
        // TODO: Implement task LL8 here.
        // You may add a helper method addInOrder(E item, Comparator<E> cmp) to CSLinkedList if needed.
        /*
        Comparator<String> cmp = new Object();
        CSLinkedList<String> eventschedulesorted = new CSLinkedList<>();
        eventschedulesorted.add("09:00 Breakfast");
        eventschedulesorted.addInOrder("13:00 Class starts"); // Military time
        */
    }

    // LL9 – Bug Tracker List (Remove by ID)
    private static void runLL9_BugTrackerRemoveById() {
        // TODO: Implement task LL9 here.
        // You may add a helper method removeFirstOccurrence(E item) to CSLinkedList if needed.
        CSLinkedList<String> bugtrackerremovebyid = new CSLinkedList<>();
        bugtrackerremovebyid.add("Bug 1");
        bugtrackerremovebyid.add("Bug 2");
        bugtrackerremovebyid.add("Bug 3");
        bugtrackerremovebyid.add("Bug 4");
        bugtrackerremovebyid.add("Bug 1");
        bugtrackerremovebyid.removeFirstOccurrence("Bug 1");
    }

    // LL10 – Playlist Shuffle Copy
    private static void runLL10_PlaylistShuffleCopy() {
        // TODO: Implement task LL10 here.
        // You may add a helper method copy() to CSLinkedList if needed.
        CSLinkedList<String> playlistshufflecopy = new CSLinkedList<String>();
        playlistshufflecopy.add("Break on Through");
        playlistshufflecopy.add("Slip Inside This House");
        playlistshufflecopy.add("Politics As Usual");
        CSLinkedList<String> a =  playlistshufflecopy.copy();
        a.clear();
        System.out.println(playlistshufflecopy);
    }
}
