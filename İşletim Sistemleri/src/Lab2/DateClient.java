/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author furka
 */
public class DateClient {
    public static void main(String[] args) throws IOException {
        
        String serverAddress = "127.0.0.1";
        Socket s = new Socket (serverAddress, 9091);
        BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String answer = input.readLine();
        s.close();
        JOptionPane.showMessageDialog(null, answer);
        System.exit(0);
        
        
        
    }
}
