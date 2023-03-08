package aliayse;

import java.io.Serializable;
public class Ogrenci implements Serializable 
{
    private String ogrenciNo;
    private String ogrenciAd;
    private String ogrenciSoyad;
    private String ogrenciBolum;

    public Ogrenci(String ogrenciNo,String ogrenciAd,String ogrenciSoyad,String ogrenciBolum)
    {
        this.ogrenciAd = ogrenciAd;
        this.ogrenciNo = ogrenciNo;
        this.ogrenciSoyad = ogrenciSoyad;
        this.ogrenciBolum = ogrenciBolum;
    }

    public void setOgrenciAd(String ogrenciAd) 
    {
        this.ogrenciAd = ogrenciAd;
    }

    public String getOgrenciAd() 
    {
        return ogrenciAd;
    }

    public String toString()
    {
        return "Adı: " + ogrenciAd + " Soyadı: " + ogrenciSoyad + " Numarası: " + ogrenciNo + " Bölümü: " + ogrenciBolum + " ";
    }
}