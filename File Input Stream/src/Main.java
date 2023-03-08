
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("dosya.txt");
            /*System.out.println("Okunan karakter: " + (char)(fis.read()));
            System.out.println("Okunan karakter: " + (char)(fis.read()));
            System.out.println("Okunan karakter: " + (char)(fis.read()));
            System.out.println("Okunan karakter: " + (char)(fis.read()));
            fis.skip(8);
            System.out.println("Okunan karakter: " + (char)(fis.read()));*/
            
            int deger;
            String s = "";
            int say = 0;
            fis.skip(5);
            while ((deger = fis.read()) != -1) {                
                s += (char)deger;
                say++;
                if (say == 10) {
                    break;
                }
            }
            System.out.println(s);
            /*while ((deger = fis.read()) != -1) {                
                s += (char) deger;
            }
            System.out.println("Dosya içeriği: " + s);*/
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File bulunamadı.");
        } catch (IOException ex) {
            System.out.println("Dosya okunerken hata oluştu.");
        } finally{
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken hata oluştu.");
            } 
        }
        
    }
}
