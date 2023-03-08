
/**
 *
 * @author furka
 */
public class Main {
    public static void main(String[] args) {
    
    int N=3,S=3;    //DEBUG, dosyayı daha sonra okuyarak ekle
    Bridge bridge = new Bridge();   //köprümüzü oluştur
    Farmer[] f = new Farmer[N+S];   //Farmers array'i
    //kuzeyli çiftçileri oluştur
    for (int i=0; i<N; i++) {
        f[i] = new Farmer("K_keşiş"+(i+1),"Kuzey",bridge);
    }
    //güneyli çiftçileri oluştur
    for (int i=N; i<S+N; i++) {
        f[i]= new Farmer("G_keşiş"+(i-N+1),"Güney",bridge);
    }
    
    //start all farmers
    for (int i=0;i<S+N;i++) {
        f[i].start();   //Farmer Threads'ı başlatın. Çiftçi thread genişlettikçe çiftçiler start alabilirler
    }
    }
}
