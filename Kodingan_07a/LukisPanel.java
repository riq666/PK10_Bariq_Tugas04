package pk10_tugas04_07a;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * drawpanel
 * @author Bariq 30/05-2024
 */

public class LukisPanel extends JPanel
{
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        int width = getWidth(); // total lebar
        int height = getHeight(); // total panjang
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }
} //akhir kelas