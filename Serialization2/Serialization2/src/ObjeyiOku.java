
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class ObjeyiOku {
    public static void main(String[] args) {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){
            
            Ogrenci[] ogrenci_array = (Ogrenci[])in.readObject();
            ArrayList<Ogrenci> ogrenci_list = (ArrayList<Ogrenci>)in.readObject();
            
            System.out.println("**************************");
            for (Ogrenci ogrenci : ogrenci_array) {
                System.out.println(ogrenci);
                System.out.println("***********************");
            }
            for (Ogrenci ogrenci : ogrenci_list) {
                System.out.println(ogrenci);
                System.out.println("***********************");
            }
            System.out.println("***************************");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı...");
        }  
        catch (IOException ex) {
            System.out.println("IOException Oluştu...");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class bulunamadı.");
        } 
    }
    
}
