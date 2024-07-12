package pk10_tugas04_07c;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * menggambar senyuman
 * @author 30/05-2024
 */

public class GambarSenyum extends JPanel 
{
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);

        // menggambar wajah
        g.setColor(Color.RED);
        g.fillOval(10, 10, 200, 200);

        // menggambar mata
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        // menggambar mulut
        g.fillOval(50, 110, 120, 60);

        // membuat senyuman
        g.setColor(Color.RED);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
} //akhir kelas
