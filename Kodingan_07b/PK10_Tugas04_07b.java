package pk10_tugas04_07b;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * menggambar persegi dan oval di frame
 * @author Bariq 30/05-2024
 */

public class PK10_Tugas04_07b {
    public static void main(String[] args) {
        // obtain user's choice
        String input = JOptionPane.showInputDialog(
            "Entri 1 untuk gambar persegi\n" +
            "Entri 2 untuk gambar oval"
        );

        int pilihan = Integer.parseInt(input); // mengubah masukan input

        // mengubah panel sesuai dengan input user's
        Bentuk panel = new Bentuk(pilihan);

        JFrame aplikasi = new JFrame(); // membuat sebuah frame

        aplikasi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikasi.add(panel);
        aplikasi.setSize(300, 300);
        aplikasi.setVisible(true);
    }
} //akhir kelas