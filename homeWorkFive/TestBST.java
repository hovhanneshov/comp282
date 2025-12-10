public class TestBST {
    public static void main(String[] args) {
        // Create a BST
        BST<String> tree = new BST<>();
        tree.insert("Green");
        tree.insert("Mabel");
        tree.insert("Teal");
        tree.insert("Blue");
        tree.insert("Jade");
        tree.insert("Purple"); // Insert Purple to the tree
        tree.insert("Danube");

        // Traverse tree
        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.getSize());

        // Search for an element
        System.out.print("\nIs Purple in the tree? " +
                tree.search("Purple"));

        // Get a path from the root to Purple
        System.out.print("\nA path from the root to Purple is: ");
        java.util.ArrayList<BST.TreeNode<String>> path
                = tree.path("Purple");
        for (int i = 0; path != null && i < path.size(); i++)
            System.out.print(path.get(i).element + " ");

        Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
        BST<Integer> intTree = new BST<>(numbers);
        System.out.print("\nInorder (sorted): ");
        intTree.inorder();

        // Testing Task 6
        System.out.print("\nHeight of tree: " + tree.height());
        System.out.print("\nHeight of intTree: " + intTree.height());

        // Testing Task 7
        System.out.print("\nCount leaves of tree: " + tree.countLeaves());
        System.out.print("\nCount leaves of intTree: " + intTree.countLeaves());

        // Testing Task 8
        System.out.print("\nMaximum value in intTree: " + intTree.max());
        System.out.print("\nMinimum value in intTree: " + intTree.min());

        // Testing Task 9
        java.util.List<Integer> list = intTree.toSortedList();
        System.out.print("\nPrinting all elements in list, sorted in ascending order:  ");
        for (Integer i : list)
            System.out.print(i + " ");

        // Testing Task 10
        System.out.print("\nChecking if tree is balanced: " + tree.isBalanced());
        System.out.print("\nChecking if intTree is balanced: " + intTree.isBalanced());

        // Testing Task 11
        int[] numbers2 = {2, 4, 3, 1, 8, 5, 6, 7};
        BST<Integer> tree2 = BSTExercises.fromArray(numbers2);
        if(tree2.countLeaves() == numbers2.length)
            System.out.print("\nThe size of BST tree2 is the same as the array numbers2");
        java.util.List<Integer> numbers3 = tree2.toSortedList();
        System.out.println("\nPrinting all elements in numbers3, sorted in ascending order: ");
        for (Integer i : numbers3)
            System.out.print(i + " ");
    }
}
