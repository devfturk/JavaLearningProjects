

public class Main {
    public static void main(String[] args) {
        
        Character[] char_dizi = {'j','a','v','a'};
        Integer[] int_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"Java","Python","C++"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Furkan"),new Ogrenci("Seval Naz"),new Ogrenci("Ahmet Emre")};
        
        /*CharYazdir.yazdir(char_dizi);
        System.out.println("****************");
        IntegerYazdir.yazdir(int_dizi);
        System.out.println("****************");
        StringYazdir.yazdir(string_dizi);
        System.out.println("****************");
        OgrenciYazdir.yazdir(ogrenci_dizi);*/
        
        YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
        YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
        YazdirmaSinifi<Integer> yazdir_int = new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();
        
        yazdir_char.yazdir(char_dizi);
        yazdir_int.yazdir(int_dizi);
        yazdir_string.yazdir(string_dizi);
        yazdir_ogrenci.yazdir(ogrenci_dizi);
    }
    
}
