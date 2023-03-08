
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class OyunEkrani extends JFrame {
    
    public static void main(String[] args) {
        
        OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");//Jframe
        ekran.setResizable(false);//resizable 
        ekran.setFocusable(false);//focusu jpanele aktarmak için
        ekran.setSize(800,600);//çözünürlük
        
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();//Jpanel
        oyun.requestFocus();//input almak için klavye
        
        oyun.addKeyListener(oyun);//klavye işlemlerini anlaması için
        
        oyun.setFocusable(true);//focusu jpanele alma
        oyun.setFocusTraversalKeysEnabled(false);// yine klavye işlemleri için
        
        ekran.add(oyun);//jpaneli jframe ekleme
        ekran.setVisible(true);//Jpanel eklendikten sonra jframe direkt olarak oluşsun
        
        
        
        
        
    }

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }
}
