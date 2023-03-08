
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Matematik.Factorial fakt = new Matematik().new Factorial();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();
        Matematik.Alan.DaireAlan daire_alan = new Matematik().new Alan().new DaireAlan();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        if (asal.asal_mi(sayi)) {
            System.out.println("Bu sayı asaldır.");
        }
        else{
            System.out.println("Bu sayı asal değildir.");
        }
        fakt.faktoriyel();
        //alan.daire_alan(5);
        daire_alan.daire_alan(6);
        
    }
}
