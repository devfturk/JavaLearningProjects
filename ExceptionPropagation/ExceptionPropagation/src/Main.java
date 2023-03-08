
public class Main {
    
    public static void ucuncufonsiyon(){
        try {
            int a = 12/0;
        } catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez");
        }
        
    }
    public static void ıkıncıfonksiyon(){
        ucuncufonsiyon();
    }
    public static void bırıncıfonksıyon(){
        ıkıncıfonksiyon();
    }
    
    public static void main(String[] args) {
        try {
            bırıncıfonksıyon();
        } catch (Exception e) {
            System.out.println("Hata yakalandı");
        }
    }
}
