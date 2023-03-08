
import java.util.Scanner;


public class Main {
    //Basit MF problemler
    //Daire Alan-Matematik
    //Üçgen Çevresi- Matematik
    //3 boyutlu vektörlerin iç çarpımı-Fizik
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik ve Fizik Problemleri Programına Hoşgeldiniz.");
        String islemler = "İşlemler...\n"
                + "1. Daire Alanı hesaplama\n"
                + "2.Üçgen çevresi hesaplama\n"
                + "3.İç çarpım Hesaplama\n"
                + "Çıkış: q";
        
        while (true) {            
            System.out.println(islemler);
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor.");
                break;
            } else if (islem.equals("1")) {
                
                System.out.print("Dairenin yarıçapı: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.daireAlan(yaricap);
                
            } else if (islem.equals("2")) {
                
                System.out.print("Kenar1 :");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar2 :");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar3 :");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
            } else if (islem.equals("3")) {
                
                Vec vec1 = new Vec("Vektör1");
                Vec vec2 = new Vec("Vecktör2");
                
                Problem.Fizik.icCarpim(vec1, vec2);
                
            }
            else {
                System.out.println("Geçersiz işlem!");
            }
        }
        
        
    }
    
    
}
