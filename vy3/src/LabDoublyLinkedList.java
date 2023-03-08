

public class LabDoublyLinkedList<T> extends DoublyLinkedList<T> {
    
    /**
     * Çift bağlı listenin istenilen konumuna eleman ekler
     * @param index konum
     * @param value eklenecek eleman
     */
    @Override
    public void insertAt(int index, T value) {
        if (index == 0) {
            addFirst(value);
            
        }
        else if (index == size()) {
            addLast(value);
        }
        else {
            Node<T> currentNode = getHead();
            
            while (index > 0) {                
                currentNode = currentNode.next;
                index--;
            }
            Node<T> node=new Node(value,currentNode,currentNode.previous);
            (currentNode.previous).next = node;
            currentNode.previous = node;
            setSize(size()+1);
        }
    }
    /**
     * Verilen konumdaki elemanı siler
     * @param index silinecek elemanın konumu
     * @return silinen değer
     */
    @Override
    public T removeAt(int index) {
        if (index == 0) {
            removeFirst();
        }
        else if (index == size()-1) {
            removeLast();
        }
        else if (index > 0 && index < size()-1) {
            Node<T> toDelete = getHead();
            Node<T> gecici=null;
            while (index > 0) {      
                toDelete = toDelete.next;
                index--;
            }
            (toDelete.previous).next = toDelete.next;
            (toDelete.next).previous = toDelete.previous;
            toDelete.next=null;
            toDelete.previous=null;
            setSize(size()-1);
            return toDelete.value;
        }
        return null;
    }
}
