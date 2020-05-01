/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_grafos_martinfuentes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Martin Fuentes
 */
public class Canvas_Lab {

    public void drawOval(Graphics g, int x, int y, Color c, String n) {
        g.setColor(c);                   
        
        //Dibuja el Nodo
        g.fillOval(x - 6, y - 6, 26, 26);
        g.setColor(Color.black);  
        g.drawString(n, x, y);
    }

    public void drawLine(Graphics2D g, int x1, int y1, int x2, int y2, Color c) {
        int xAux = 0, yAux = 0;
        Font f = new Font("Tahoma", Font.BOLD, 15);
        
        // linea entre nodos
        g.setColor(c);
        g.setStroke(new BasicStroke(3));
        g.drawLine(x1, y1, x2, y2);
    }

}
