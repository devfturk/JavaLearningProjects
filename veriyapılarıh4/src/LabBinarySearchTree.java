public class LabBinarySearchTree<T extends Comparable<T>> extends BinarySearchTree<T> {
    public LabBinarySearchTree(){
        //Bu metodu değiştirmeyin
    }
    public LabBinarySearchTree(BTNode<T> root) {
        //Bu metodu değiştirmeyin
        super(root);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        BTNode<T> kok =getRoot();
        
        if(kok == null){
            
            return new LabBinarySearchTree<T>();
            
        }
        
        return new LabBinarySearchTree<T>(cloneMethod(kok));
    }
    private <T extends Comparable<T>> BTNode<T> cloneMethod(BTNode<T> node){
        
        return new BTNode<T>(node.value, node.left!=null?cloneMethod(node.left):null, node.right!=null?cloneMethod(node.right):null);
        
    }

    @Override
    public BTNode<T> successor(T value) {
        BTNode<T> successorBTNode = find(getRoot(), value);
        if (successorBTNode == null) {
            return successorBTNode;
        }
        successorBTNode = successorBTNode.right;
        while (successorBTNode.left != null) {                
            successorBTNode = successorBTNode.left;
                
        }
        
        return successorBTNode;
    }

    @Override
    public BTNode<T> predecessor(T value) {
        BTNode<T> predecessorBTNode = find(getRoot(), value);
        if (predecessorBTNode == null) {
            return predecessorBTNode;
        }
        predecessorBTNode = predecessorBTNode.left;
        while (predecessorBTNode.right != null) {                
            predecessorBTNode = predecessorBTNode.right;
                
        }
        
        return predecessorBTNode;
    }

    @Override
    public BTNode<T> findParent(BTNode<T> node) {
        int degerlendirme = 0;
        BTNode<T> dugum = getRoot();
        if (dugum.equals(node)) {
            return null;
        }
        if (dugum.left.value.equals(node.value) || dugum.right.value.equals(node.value)) {
            return dugum;
        }
        else {
            degerlendirme = node.value.compareTo(dugum.value); // 1,-1
            System.out.println("ilk değerlendirme:" + degerlendirme);
            while (true) {                
                
            
            while (degerlendirme < 0) {                
                dugum = dugum.left;
                if (dugum.left.value.equals(node.value) || dugum.right.value.equals(node.value)) {
                    return dugum;
                }
                degerlendirme = node.value.compareTo(dugum.value);
            }
            while (degerlendirme > 0) {                
                dugum = dugum.right;
                if (dugum.left.value.equals(node.value) || dugum.right.value.equals(node.value)) {
                    return dugum;
                }
                degerlendirme = node.value.compareTo(dugum.value);
            }
            }
        }
        
    }


}
