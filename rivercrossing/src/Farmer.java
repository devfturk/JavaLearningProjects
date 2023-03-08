public class Farmer extends Thread{
private String location;    //şu anki lokasyon
private String destination; //hedef
private String id;          //isim      
private Bridge bridge;      //köprü

//constructor
public Farmer(String id, String location, Bridge bridge) {
    this.id=id;
    this.location=location;
    if (location=="Kuzey") destination="Güney"; //Seçeneklerimiz yalnızca Kuzey veya Güney olduğundan ada nesneleri bu uygulama için gerekli değildir.
    else destination="Kuzey";
    this.bridge = bridge;
    System.out.println(id+": Köprü için bekleniyor... "+destination);  //köprü için ilk beklerken yazdırır

}

//getters
public String getLocation() {
    return location;
}
public String getID() {
    return id;
}



@Override   //thread.start () yöntemi çağrıldığında başlatılır
public void run() {

        //***semaphore gerektiren bölümü başlat***
        bridge.cross();

        System.out.println(id+": Köprü geçiliyor. Adım 5.");
        System.out.println(id+": Köprü geçiliyor. Adım 10.");
        System.out.println(id+": Köprü geçiliyor. Adım 15.");

        //200 unit sleep okunabilirlik için 
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {} //Kesinti uygulanmadı

        System.out.println(id+": Karşıya geçti..");
        System.out.println("Karşıya geçen kişi sayısı = "+bridge.getCrossed());

        bridge.exit();
        //***semaphore bitir***


        //20 unit sleep, semaforun aşırı yüklenmesini önler
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {}
    }
}