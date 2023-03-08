  
public class Traversal {
    
    public static<T> String inOrder(BTNode<T> node) {
        
        if (node==null)
            
            return "";
        
        String l=inOrder(node.left);
        
        String r=inOrder(node.right);
        
        return l+(l.equals("")?"":" ")+node.value+(r.equals("")?"":" ")+r;
        
    }

    public static<T> String preOrder(BTNode<T> node) {
        
        if (node==null)
            
            return "";
        
        String l=preOrder(node.left);
        
        String r=preOrder(node.right);
        
        return node.value+(l.equals("")?"":" ")+l+(r.equals("")?"":" ")+r;
    }

    public static<T> String postOrder(BTNode<T> node) {
        
        if (node==null)
            
            return "";
        
        String l=postOrder(node.left);
        
        String r=postOrder(node.right);
        
        return l+(l.equals("")?"":" ")+r+(r.equals("")?"":" ")+node.value;
    }
}