package pk10_tugas04_07b;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * menggambar persegi dan oval di frame
 * @author Bariq 30/05-2024
 */

public class Bentuk extends JPanel 
{
    private int pilihan; // pilihan untuk gambar

    // menyetting konstuktor untuk gambar
    public Bentuk(int userChoice) 
    {
        pilihan = userChoice;
    }

        @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);

        for (int i = 0; i < 10; i++) 
        {
            // mengambil pilihan gambar sesuai pilihan
            switch (pilihan) 
            {
                case 1: // menggambar persegi
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 2: // menggambar oval
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
            }
        }
    }
} //akhir kelas
