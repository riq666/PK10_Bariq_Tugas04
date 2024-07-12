package pk10_tugas04_07d;

import javax.swing.JFrame;

/**
 * menggambar pelangi
 * @autor Bariq 30/05-2024
 */

public class PK10_Tugas04_07d {
    public static void main(String[] args) 
    {
        GambarPelangi panel = new GambarPelangi(); 
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);
    }
} //akhir kelas