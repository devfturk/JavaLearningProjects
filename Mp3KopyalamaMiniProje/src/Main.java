
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();
    public static void dosya_oku(){
        try {
            FileInputStream in = new FileInputStream("Kayıt.m4a");
            int oku;
            while ((oku = in.read()) != -1) {                
                
                icerik.add(oku);
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void kopyala(String dosyaismi){
        
        try {
            FileOutputStream out = new FileOutputStream(dosyaismi);
            
            for (int deger : icerik) {
                
                out.write(deger);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public static void main(String[] args) {
        
        dosya_oku();
        long baslangic = System.currentTimeMillis();
        kopyala("kayıt2.m4a");
        kopyala("kayıt3.m4a");
        kopyala("kayıt4.m4a");
        long bitis = System.currentTimeMillis();
        System.out.println(bitis-baslangic);
    }
}
