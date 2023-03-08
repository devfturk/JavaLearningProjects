
import java.util.*;


public class Odev2 {
    /**
     * Postfix biçiminde verilen metni ExpressionTree sınıfına dönüştürür
     * @param agac
     * @param girdi postfix girdi metni
     * @return Oluşturulan ifade ağacı
     */
    public static int sonuc(BTNode<String> n1){

        
        
        
        if ((n1.value.equals("+")) || (n1.value.equals("-")) || (n1.value.equals("*")) || (n1.value.equals("/"))) {
            int a = sonuc(n1.right);//12
            int b =sonuc(n1.left);//3
            if (n1.value.equals("+")) {
                return b+a;
            }
            if (n1.value.equals("-")) {
                return b-a;
            }
            if (n1.value.equals("*")) {
                return b*a;
            }
            if (n1.value.equals("/")) {
                if (a == 0) {
                    return 1;
                }
                return b/a;
            }
            else{
                return 0;
            }
        }
        else{
            return Integer.parseInt(n1.value);
            
        }
        
    }
    private static String[] splitToTokens(String girdi)
    {
        StringTokenizer t=new StringTokenizer(girdi, "+-*/^() ",true);
        List<String> tokenList=new ArrayList<>();
        while (t.hasMoreTokens()){
            String s=t.nextToken().trim();
            if(!s.equals(""))
                tokenList.add(s);
        }
        String [] tl=new String[tokenList.size()];
        tokenList.toArray(tl);
        return tl;
    }
    
    public static ExpressionTree postfixToExpressionTree(String girdi){
        Stack<BTNode> s1 = new Stack<>();
        String[] parcalanmis = splitToTokens(girdi);
        for (String s : parcalanmis) {  
            
            if(!(s.equals("+")) && !(s.equals("-")) && !(s.equals("*")) && !(s.equals("/"))){
                s1.add(new BTNode(s, null, null));
            }
            else{
                BTNode n1 = s1.pop();
                BTNode n2 = s1.pop();
                s1.push(new BTNode(s, n2, n1));
            }
        }
        return new ExpressionTree(s1.pop());
    }

    /**
     * Parametre olarak verilen ifade ağacını değerlendirir(sonucunu hesaplar).
     * @param agac İfade ağacı
     * @return İfade ağacının sonucu
     */
    public static int evaluateExpressionTree(ExpressionTree agac){
        return sonuc(agac.getRoot());
    }
}