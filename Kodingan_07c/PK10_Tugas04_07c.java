package pk10_tugas04_07c;

import javax.swing.JFrame;

/**
 * menggambar senyuman
 * @author 30/05-2024
 */

public class PK10_Tugas04_07c {
    public static void main(String[] args) 
    {
        // Membuat panel GambarSenyum
        GambarSenyum panel = new GambarSenyum();

        // Membuat JFrame
        JFrame aplikasi = new JFrame();

        aplikasi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikasi.add(panel);
        aplikasi.setSize(250, 270); // Menyesuaikan ukuran frame
        aplikasi.setVisible(true);
    }
} //akhir kelas