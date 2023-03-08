
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Baglanti {
    private String kullanici_adi = "root";
    private String parola = "";
    private String db_ismi = "demo";
    private String host = "localhost";
    private int port = 3306;
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    public void preparedCalisanlariGetir(int id,String kosul){
        String sorgu = "Select * from calisanlar where id >= ? and soyad like ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, kosul);
            
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {                 
                System.out.println("Ad: " + rs.getString("ad") + " Soyad: " + rs.getString("soyad") + " Email: " + rs.getString("email"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*public void preparedCalisanlariGetir(){
        try {
            statement = con.createStatement();
            String sorgu = "Select * from calisanlar where soyad like 'T%'";
            ResultSet rs = statement.executeQuery(sorgu);
            while (rs.next()) {                
                System.out.println("Ad: " + rs.getString("ad"));    
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    public void calisanSil(){
        try {
            statement = con.createStatement();
            String sorgu = "Delete from calisanlar where id = 8";
        
            int deger = statement.executeUpdate(sorgu);
            System.out.println(deger +" tane veri etkilendi. ");
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void calisanGuncelle(){
        try {
            statement = con.createStatement();
            String sorgu = "Update calisanlar Set email = 'example@gmail.com' where id >3";
            
            statement.executeUpdate(sorgu);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void calisanEkle(){
        try {
            statement = con.createStatement();
            String ad = "Yavuz";
            String soyad = "Mutlu";
            String email = "ymutlu@gmail.com";
            String sorgu = "insert into calisanlar (ad,soyad,email) VALUES(" + "'" +ad+"',"+"'"+soyad+"',"+"'"+email+"')";
            
            statement.executeUpdate(sorgu);
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public void calisanlariGetir(){
        String sorgu = "Select *from Calisanlar ";
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {                
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("ID: " + id + " Ad: " + ad + " Soyad: " + soyad + " Email: " + email );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Baglanti() {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı.");
            
        }
        try {
            con = DriverManager.getConnection(url,kullanici_adi,parola);
            System.out.println("Bağlantı başarılı.");
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız.");
        }
        
        
    }
    public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();
        /*System.out.println("Eklenmeden önce.....");
        baglanti.calisanlariGetir();
        System.out.println("Eklendikten sonra.....");
        //baglanti.calisanEkle();
        //baglanti.calisanGuncelle();
        baglanti.calisanSil();;
        baglanti.calisanlariGetir();
        System.out.println("***************");*/
        //baglanti.preparedCalisanlariGetir();
        baglanti.preparedCalisanlariGetir(1,"T%");
        
    }
    
}
