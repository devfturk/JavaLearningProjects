public class Odev1LinkedList<T extends Comparable<T>> extends AbstractLinkedList<T> {
    /**
     * Bir listede elemanları uygun konuma ekler. Boş bir listeye elemanlar eklendikten
     * sonra küçükten büyüğe sıralı olur
     * @param value eklenecek değer
     */
    @Override
    public void insertInOrder(T value) {
        
          Node<T> dugum = head;
          
          ekleme(dugum, value);
    }
    
    private void ekleme(Node<T> current, T value){
        
        Node<T> dugum = new Node<T>(value, current);
        
        if (head == null || value.compareTo(head.value) < 0) {
            
            dugum.next = head;
            
            head = dugum;
            
        }
        else if(current.value.compareTo(value) <= 0 && (current.next == null || current.next.value.compareTo(value) > 0)){
            
            dugum.next = current.next;
            
            current.next = dugum;
            
            return;
            
        }
        
        else{
            
            ekleme(current.next, value);
            
        }

    }

    /**
     * Mevcut listeyi değiştirmeden, elemanların sırası ters çevrilmiş halde geri döndürür.
     * @return Ters çevrilmiş liste
     */
    @Override
    public AbstractLinkedList<T> reverse() {
        
        Odev1LinkedList<T> donen = new Odev1LinkedList<T>();
        
        Node<T> dugum = this.getHead();
        
        while(dugum.next != null){
            
            donen.addFirst(dugum.value);
            
            dugum = dugum.next;
        }
        
        donen.addFirst(dugum.value);
        
        return donen;
    }

    /**
     * Mevcut liste ile parametre olarak gelen listeyi birleştirip geriye döndürür.
     * Mevcut listede değişiklik yapılmaz.
     * @param list Mevcut listenin sonuna eklenecek liste
     * @return Birleşmiş liste
     */
    @Override
    public AbstractLinkedList<T> concatenate(AbstractLinkedList<T> list) {
        //mevcut1 parametre2
        
        Node<T> root = list.getHead();
        
        Odev1LinkedList<T> donen = new Odev1LinkedList<T>();
        
        Node<T> dugum = this.getHead();
        
        while (dugum.next != null) {            
            donen.addLast(dugum.value);
            dugum = dugum.next;
        }
        donen.addLast(dugum.value);
        
        while (root.next != null) {            
            donen.addLast(root.value);
            root = root.next;
        }
        donen.addLast(root.value);
        
        
        return donen;
        
    }

}
