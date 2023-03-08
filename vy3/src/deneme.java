
public class deneme {
    public static void main(String[] args) {
        LabDoublyLinkedList<Integer> ll = new LabDoublyLinkedList<>();
        ll.insertAt(0, 1);
        ll.insertAt(1, 2);
        ll.insertAt(2, 3);
        ll.insertAt(3, 4);
        ll.insertAt(4, 5);
        ll.insertAt(5, 6);
        ll.print();
        ll.removeAt(0);
        ll.removeAt(0);
        ll.print();
        ll.removeAt(1);
        ll.print();
    }
}
