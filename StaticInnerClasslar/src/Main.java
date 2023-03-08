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
        Matematik.Alan alan = new Matematik.Alan();
        alan.daire_alan(5);
        Matematik.Alan.daire_alan(6);// static method olduğunda direkt olarak bu şekilde de çağırabiliriz.
        
    }
}
