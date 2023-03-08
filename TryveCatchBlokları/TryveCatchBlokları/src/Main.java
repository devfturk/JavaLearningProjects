
public class Main {
    public static void main(String[] args) {
        /*
        try {
            // Exception Oluşturabilecek Kodlar
        }
        
        catch(Exception_Türü e) {
            // Exception Durumunda Yapılacak İşlemler
        }
        */
        //System.out.println("Burası Çalışıyor.");
        //int a = 30/0; // unchecked exception
        
        //int[] a = {1,2,3,4,5};
        
        //System.out.println(a[6]);
        
        try {
            int a = 30/0;
            int[] b = {1,2,3,4,5};
            System.out.println(b[6]);
        } catch (Exception e) {
            System.out.println("Arrayin boyunu aştınız.");
        }
        System.out.println("Burası çalışıyor.");
        
        
        
    }
    
    
    
    
    
}
