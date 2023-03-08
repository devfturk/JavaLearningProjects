
import java.util.Scanner;


public class Test {
    public static void mekan_kontrol(int yas) throws InvalidAgeException{
        
        if (yas < 18) {
            throw new InvalidAgeException("Invalid age");
        }
        else {
            System.out.println("Mekana hoşgeldiniz.");
        }
        
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı girin.");
        int yas = scanner.nextInt();
        try {
            mekan_kontrol(yas);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
        
        
    }
}
