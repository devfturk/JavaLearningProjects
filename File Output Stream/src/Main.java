
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void main(String[] args) {
        
        FileOutputStream fos = null;
        //File file = new File("dosya.txt");
        try {
            
            fos = new FileOutputStream("dosya.txt",true);
            //fos.write(99);
            //fos.write(10);
            //byte[] array = {101,65,76,56};
            String s = " \nFurkan Türk";
            byte[] s_array = s.getBytes();
            fos.write(s_array);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazılırken bir hata oluştu.");
        } finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu..");
            }
        }
        
    }
}
