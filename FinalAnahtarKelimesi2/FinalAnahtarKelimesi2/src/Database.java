
public final class Database {
    // classlarda final kelimesi kalıtım kullanılmamasına yol açar.
    
    public final void baglantiKur(String username,String password) {
    // methodlarda final kullanılması override edilememesine yol açar.   
        
        System.out.println(username);
        System.out.println(password);
        
    }
    
}
