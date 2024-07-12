package pk10_tugas04_07a;

import javax.swing.JFrame;

/**
 * drawpanel
 * @author Bariq 30/05-2024
 */

public class PK10_Tugas04_07a 
{
    public static void main(String[] args) 
    {
        // kodingan dimulai
        LukisPanel panel = new LukisPanel();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel); // menambah panel ke frame
        application.setSize(250, 250); // menyetting ukuran frame
        application.setVisible(true); // membuat frame terlihat
    }
    
} //akhir kelas