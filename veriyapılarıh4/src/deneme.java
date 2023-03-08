
public class deneme {
    public static void main(String[] args) {
        LabBinarySearchTree bst = new LabBinarySearchTree<>();
        bst.add(21);
        bst.add(10);
        bst.add(45);
        bst.add(4);
        bst.add(12);
        bst.add(36);
        bst.add(64);
        bst.add(25);
        bst.add(40);
        BTNode dugum = bst.find(bst.getRoot(), 25);
        System.out.println(bst.findParent(dugum).value);
    }
}
