
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author furka
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümleyi giriniz: ");
        String cumle = scanner.nextLine();
        
        Map<Character,Integer> frekans = new TreeMap<Character, Integer>();
        
        
        for (int  i = 0; i < cumle.length(); i++){
            char c = cumle.charAt(i);
            
            if (frekans.containsKey(c)) {
                frekans.replace(c, frekans.get(c)+1);
            }
            else{
                frekans.put(c, 1);
            }
        }
        for (Map.Entry<Character,Integer> entry : frekans.entrySet()){
            System.out.println("Karakter: " + entry.getKey() + " " + entry.getValue() + " kadar geçiyor...");
            
        }
        
        
    }
    
}
