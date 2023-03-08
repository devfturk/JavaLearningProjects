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
public class Main {
    private int test;

    public Main(int test){
        this.test = test;
    }


    public static void main(String[] args) {



        System.out.println("Main Thread Çalışıyor!\n");

        Thread [] threadler = new Thread[10];
        for(int i = 0; i <10; i++){
            threadler[i] = new Thread(new IlkThread(i));
        }

        for(int i = 0; i < 10; i++){
            threadler[i].start();
            try{
                threadler[i].join();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

        try{

        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Tum Elemanların Toplamı = " + IlkThread.sum + " Olur!");
        System.out.println("Main Thread Kapanıyor!\n");

    }


    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }
}
