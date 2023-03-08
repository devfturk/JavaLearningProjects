import java.util.*;

/**
 * Islemler sınıfı içindeki 4 metodun yazılması istenmektedir
 */
public class İslemler {
    public static void main(String[] args) {
        String girdi = "32*4+75/-";
        System.out.println(postfixDegerlendir(girdi));
        
    }
    /**
     * Yığıtın elemnlarının sırasını tersine çevirir
     * @param s Tersine çevrilecek yığıt
     * @return Tersine çevirlmiş yığıtı döndürür
     */
    public static <T> Stack<T> tersCevir(Stack<T> s){
        Stack<T> s2 = (Stack<T>) s.clone();
        Stack<T> donen = new Stack<>();
        while (!s2.isEmpty()) {            
            donen.push(s2.pop());
        }
        return donen;
    }

    /**
     * İki yığıtın eşit olup olmadığını kontrol eder
     * @param s1 Birinci yığıt
     * @param s2 İkinci yığıt
     * @return İki yığıtın eşit olma durumunu döndürür
     */
    public static <T> boolean esit(Stack<T> s1, Stack<T> s2)
    {   
        Stack<T> k1 = (Stack<T>) s1.clone();
        Stack<T> k2 = (Stack<T>) s2.clone();
        if (k1.size() == k2.size()) {
            
        }
        else{
            return false;
        }
        while (!k1.isEmpty() && !k2.isEmpty()) {            
            if (k1.pop().equals(k2.pop())) {
                
            }
            else{
                return false;
            }
        }
        //Metodun gövdesini yazınız
        return true;
    }

    /**
     * Postfix ifadeyi değerlendirir. İşlemler tamsayılar üzerinde gerçekleşir. "7 5 /" işleminin sonucu 1'dir.
     * @param girdi Girdi ifadesi
     * @return İfadenin sonucu
     */
    public static int postfixDegerlendir(String girdi) {
        //Metodun gövdesini yazınız
        Stack<Integer> s1 = new Stack<>();
        String[] parcalanmis = splitToTokens(girdi); 
        for (String s : parcalanmis) {  
            if(!(s.equals("+")) && !(s.equals("-")) && !(s.equals("*")) && !(s.equals("/"))){
                int a = Integer.parseInt(s); 
                s1.push(a);
            }
            else{
                int d1 = s1.pop();
                int d2 = s1.pop();
                if (s.equals("+")) {
                    int toplama = d2 + d1;
                    s1.push(toplama);
                } 
                else if (s.equals("-")) {
                    int cikarma = d2-d1;
                    s1.push(cikarma);
                }
                else if (s.equals("*")) {
                    int carpma = d2*d1;
                    s1.push(carpma);
                }
                else if (s.equals("/")) {
                    int bolme = d2/d1;
                    s1.push(bolme);
                }
            }       
        }
        int donen = s1.peek();
        return donen;
    }

    /**
     * Infix ifadeyi postfix'e dönüştürür.
     * @param girdi Infix girdi metni
     * @return Dönüştürülmüş postfix ifade
     */
       static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static String infixToPostfix(String girdi){

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < splitToTokens(girdi).length; i++) {
            sb.append(splitToTokens(girdi)[i]);
        }
        String str = sb.toString();
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);

            //check if char is operator

            if(precedence(c)>0){
                while( !stack.isEmpty() && precedence(stack.peek()) >=  precedence(c) ){
                    result += stack.pop();
                }

                stack.push(c);

            }else if(c==')'){

                char x = stack.pop();
                while(x!='('){
                    result += x;
                    x = stack.pop();

                }
            }else if(c=='('){
                stack.push(c);
            }else{
                //character is neither operator nor (
                result += c;

            }
        }
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        StringBuilder sb1 = new StringBuilder(result);
        int index = result.length()-1;
        for (int i = 0; i <result.length() ; i++) {
            if(index == 0)
                break;
            sb1.insert(index, " ");
            index -= 1;

        }
        result = sb1.toString();

        return result;
    }


    /**
     * Infix ifadeyi sembollerine ayıran metod
     * @param girdi Infix ifade
     * @return Sembol dizisi
     */
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

}
