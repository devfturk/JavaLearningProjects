/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev2;

/**
 *
 * @author furka
 */
import java.util.Random;
public class IlkThread implements Runnable{

    public int id;
    public static volatile int sum;

    public IlkThread(int id){
        this.id = id;
    }



    @Override
    public void run(){
        int toplam = 0;
        for(int i =0; i<1000; i++){
            Random a = new Random();
            int b = a.nextInt(1000-0) + 0;
            toplam = toplam + b;
        }
        sum += toplam;
        System.out.println("Bu Threadin id si " + id + " ve 1000 elemanın toplamı = " + toplam + " olmaktadır");

        try {

        }
        catch (Exception e){
            // System.out.println(e);
        }
       if(id == 9){
            System.out.println("Tüm elemanların toplamı = " + sum + " olur!");
        }
        Main kek = new Main(sum);

    }
}

