
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku {
    public static void main(String[] args) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {
            
            Ogrenci ogrenci1 = (Ogrenci)in.readObject();
            Ogrenci ogrenci2 = (Ogrenci)in.readObject();
            System.out.println("*********************************");
            System.out.println(ogrenci1);
            System.out.println("*********************************");
            System.out.println(ogrenci2);
            
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken bir hata oluştu.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Sınıf bulunamadı.");
        }
    }
    
}
