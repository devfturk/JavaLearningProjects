
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        FileWriter writer = null;
        
        try {
            writer = new FileWriter("dosya.txt",true);
            
            //writer.write("Furkan Türk\n");
            //writer.write("Kasım Türk\n");
            writer.write("Hatice Türk\n");
            
            
        } catch (IOException ex) {
            System.out.println("dosya açılırken ioexception oluştu.");
        } finally{
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Dosya kapatılırken bir hata oluştu.");
                }
            }
        }
        
        
    }
}
