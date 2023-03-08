
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author furka
 */
public class GrafikKullanimi extends JPanel {

    public GrafikKullanimi() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.drawRect(100, 10, 30, 40);
        g.fillRect(200, 100, 30, 40);
        g.setColor(Color.blue);
        g.drawOval(200, 200, 60, 30);
        g.fillOval(300, 300, 50, 50);
        g.setColor(Color.yellow);
        g.drawLine(100, 100, 350, 350);
    }
    
}
