
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
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("kayıt1.m4a");
                System.out.println("Thread1 Başladı " + System.currentTimeMillis());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("kayıt2.m4a");
                System.out.println("Thread2 Başladı " + System.currentTimeMillis());
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("kayıt3.m4a");
                System.out.println("Thread3 Başladı " + System.currentTimeMillis());
            }
        });
        long baslangic = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        long bitis = System.currentTimeMillis();
        System.out.println("Süre: " + (bitis-baslangic)/1000);
    }
}
