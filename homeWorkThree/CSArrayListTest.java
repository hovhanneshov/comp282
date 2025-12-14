import java.util.Collection;
import java.util.Iterator;

public class CSArrayListTest {
    public static void main(String[] args) {
        Collection<String> testCollection = new CSArrayList<>();
        testCollection.add("A");
        testCollection.add("B");

        Iterator<String> iterator = testCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(testCollection.size());
        System.out.println(testCollection.contains("B"));
        System.out.println(((CSArrayList<String>) testCollection).indexOf("B"));

        // Part A tests
        CSArrayList<String> testList = new CSArrayList<>();
        System.out.println(testList);
        testList.add("A");
        testList.add("B");
        System.out.println(testList.isEmpty());
        System.out.println(testList.remove("B"));
        testList.clear();
        System.out.println(testList.isEmpty());

        // Part B test, Proof of Concurrent Modification (UNCOMMENT TO TEST EACH)
        testList.add("A");
        testList.add("B");
        Iterator<String> iterator1 = testList.iterator();
        /*
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
            //testList.remove("A");
            //testList.add("C");
            //testList.clear();
        }
         */

        // Part C test
        testList.add("A");
        Collection<String> testCollection2 = new CSArrayList<>();
        testCollection2.add("A");
        testCollection2.add("B");
        testCollection2.add("C");
        testList.addAll(0, testCollection2);
        System.out.println(testList);
    }
}
