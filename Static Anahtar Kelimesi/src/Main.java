
public class Main {
    public static void main(String[] args) {
        
        Seyirci seyirci1 = new Seyirci("Seval Naz Karahan");
        Seyirci seyirci2 = new Seyirci("Furkan Türk");
        
        seyirci1.oyun_seyret();
        
        System.out.println("Seyirci Sayısı:" + Seyirci.getSeyirci_sayisi());
        System.out.println("Seyirci Sayısı:" + seyirci1.getSeyirci_sayisi());
        selamla();
    }
    public static void selamla(){
        System.out.println("Selamlar...");
    }
}
