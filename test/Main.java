import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

    JLabel label;

    public Main() {
         setSize(400, 300);
         setTitle("Title");
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         setVisible(true);

         label = new JLabel("Text inside");
         add(label, BorderLayout.NORTH);
   }

    @Override
    public void paint(Graphics g){
        Image img = createImage(getWidth(), getHeight());
        Graphics gr = img.getGraphics();
        draw(gr);
        g.drawImage(img, 0, 0, this);
    }

    public void draw(Graphics g){
        super.paint(g);
        g.drawRect(100, 100, 200, 100);
    }

    public static void main(String[] args) {
        Main start = new Main();
    }
}