import java.util.Comparator;
import java.util.*;


/**
 * FrekansKarsilastirici sınıfı Huffman ağaçlarını köklerindeki frekans değerlerine göre
 * karşılaştırır.
 */
class FrekansKarsilastirici implements Comparator<HuffmanNode> {

    @Override
    public int compare(HuffmanNode n1, HuffmanNode n2) {
        
        if(n1.frequency < n2.frequency){
            
        return -1;
        }
        
        else if (n1.frequency== n2.frequency){
            
        return 0;
        }
        
        else {
            
        return 1;
        }
        
    }
}

/**
 * AlfabetikKarsilastirici sınıfı Huffman ağaçlarını içlerinde bulunan en küçük karakterlere
 * göre karşılaştırır.
 */
class AlfabetikKarsilastirici implements Comparator<HuffmanNode> {

    @Override
    public int compare(HuffmanNode n1, HuffmanNode n2) {
        
        int s1 = smallest(n1);
        
        int s2 = smallest(n2);
        
            if (s1 - s2 >0) {
                
                return 1;
                
            } 
            else if (s1 - s2 <0) 
            {
                return -1;
                
            } 
            else
            {
                return 0;
            }
        
    }
    
    private int smallest(HuffmanNode n) {
        int kucuk = 200;
        
        Queue<HuffmanNode> queue = new LinkedList<HuffmanNode>(); 
        
        queue.add(n);
        
        while (!queue.isEmpty())  { 
            
            HuffmanNode geciciNode = queue.poll(); 
            
            if(geciciNode.value != null) {
                
                if(geciciNode.value < kucuk) {
                    
                    kucuk = geciciNode.value;
                    
                }
            }
            
            if (geciciNode.left != null) { 
                
                queue.add(geciciNode.left); 
                
            } 
  
            if (geciciNode.right != null) { 
                
                queue.add(geciciNode.right); 
            } 
            
        }
        
    return kucuk;
    }
}