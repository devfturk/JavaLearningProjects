
public class Test {
    public static void main(String[] args) {
        /*Character[] char_dizi = {'j','a','v','a'};
        
        Integer[] int_dizi = {1,2,3,4,5,6};
        
        String[] string_dizi = {"Java","Python","C++"};
        
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Furkan"),new Ogrenci("Seval Naz"),new Ogrenci("Ahmet Emre")}; 
        
        yazdir(char_dizi);
        yazdir(int_dizi);
        yazdir(string_dizi);
        yazdir(ogrenci_dizi);*/
        
        Sayısal sayisal1 = new Sayısal(30, 40, 20, 30);
        Sayısal sayisal2 = new Sayısal(25, 45, 2, 35);
        
        Sayısal birinci = birinci(sayisal1, sayisal2);
        
        EsitAgirlik ea1 = new EsitAgirlik(30, 20, 40, 2);
        EsitAgirlik ea2 = new EsitAgirlik(40, 10, 50, 0);
        EsitAgirlik birinci2 = birinci(ea1, ea2);
        System.out.print("Birinci sayısal öğrencinin puanı: "+birinci.puanHesapla()+"\n");
        System.out.print("Birinci eşit ağırlık öğrencinin puanı: "+birinci2.puanHesapla()+"\n");

    }
    public static <E extends Aday>  E birinci(E e1,E e2){
        if (e1.puanHesapla() > e2.puanHesapla()) {
            return e1;
        }
        else{
            return e2;
        }
    }
    
    /*public static <E> void yazdir(E[] dizi){
        for (E e : dizi) {
            System.out.println(e);
        }
    }*/
}
