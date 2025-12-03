// ListStackDriver.java
// Starter file for the Stack portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runS4_ReverseWord).

public class ListStackDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        //runS1_BrowserBackButton();
        //runS2_TextEditorUndo();
        //runS3_BalancedParentheses();
        //runS4_ReverseWord();
        //runS5_DirectoryNavigation();
        //runS6_CalculatorHistory();
        //runS7_PalindromeChecker();
        //runS8_FunctionCallStack();
        //runS9_StackOfPlates();
    }

    // S1 – Browser Back Button
    private static void runS1_BrowserBackButton() {
        // TODO: Implement task S1 here.
        ListStack<String> urls = new ListStack<String>();
        urls.push("www.youtube.com");
        urls.push("www.google.com");
        urls.push("www.yahoo.com");
        urls.push("www.ebay.com");
        urls.pop(); // Back button
        urls.pop();
        // Every pop and push function is O(1);
    }

    // S2 – Undo in a Text Editor
    private static void runS2_TextEditorUndo() {
        // TODO: Implement task S2 here.
        String s = "";
        ListStack<String> texteditorundo = new ListStack<String>();
        texteditorundo.push(s);
        s = "Line of text 2";
        texteditorundo.push(s);
        s = "Line of text 3";
        s = texteditorundo.pop(); // Undo
    }

    // S3 – Checking Balanced Parentheses
    private static void runS3_BalancedParentheses() {
        // TODO: Implement task S3 here.
        Character[] arr = {'(', ')', '(', '('};
        ListStack<Character> balancedparentheses = new ListStack<>();
        for(int i = 0; i < arr.length(); i++) {
            if(arr[i] == '(')
               balancedparentheses.push('(');
            else
                balancedparentheses.pop();
            if(balancedparentheses.size() == 0)
                System.out.print("Balanced");
            else
                System.out.print("Not balanced");
        }
    }

    // S4 – Reversing a Word Using a Stack
    private static void runS4_ReverseWord() {
        // TODO: Implement task S4 here.
        ListStack<Character> reverseword = new ListStack<>();
        String s = "Word";
        for(int i = 0; i < s.getLength(); i++) {
            reverseword.push(s.charAt(i));
        }
        for(int i = 0; i < s.getLength(); i++) {
            System.out.print(reverseword.pop());
        }
    }

    // S5 – Directory Navigation (cd / cd ..)
    private static void runS5_DirectoryNavigation() {
        // TODO: Implement task S5 here.
        String s;
        String[] arr = {"cd root", "cd main", "cd ..", "cd home"};
        ListStack<String> directorynavigation = new ListStack<>();
        for(int i = 0; i < arr.length(); i++) {
            if(!arr[i].equals("cd .."))
                directorynavigation.push(arr[i]);
            else
                directorynavigation.pop();
        }
    }

    // S6 – History of Calculator Operations
    private static void runS6_CalculatorHistory() {
        // TODO: Implement task S6 here.
        ListStack<String> calculatorhistory = new ListStack<String>();
        String[] arr = {"5+2=7", "3*2=6", "Ans+3=9"};
        for(int i = 0; i < arr.length(); i++) {
            calculatorhistory.push(arr[i]);
        }
        calculatorhistory.pop(); // Undoes last operation
    }

    // S7 – Palindrome Checker
    private static void runS7_PalindromeChecker() {
        // TODO: Implement task S7 here.
        String s = "kayak";
        ListStack<String> palindromechecker = new ListStack<>();
        int halfOfSize = s.getLength()/2;
        for(int i = 0; i < halfOfSize; i++) {
            palindromechecker.push(s.charAt(i));
        }
        if(s.getLength() % 2 == 1)
            halfOfSize++;
        for(int i = halfOfSize; i < s.getLength(); i++) {
            if(palindromechecker.peek() == s.charAt(i))
                palindromechecker.pop();
        }
        if(palindromchecker.isEmpty())
            System.out.println(s +" is a palindrome");
        else
            System.out.println(s +" is NOT a palindrome");
    }

    // S8 – Function Call Stack Simulator
    private static void runS8_FunctionCallStack() {
        // TODO: Implement task S8 here.
        ListStack<String> functioncallstack = new ListStack<>();
        String[] arr = {"call first function", "call seond function", "return"};
        for(int i = 0; i < arr.length(); i++) {
            if(arr[i].substring(0, 3).equals("call"))
                functioncallstack.push(arr[i]);
            else if(arr[i].equals("return"))
                functioncallstack.pop();
        }
    }

    // S9 – Stack of Plates (Capacity-Limited Stack)
    private static void runS9_StackOfPlates() {
        // TODO: Implement task S9 here.
    }
}
