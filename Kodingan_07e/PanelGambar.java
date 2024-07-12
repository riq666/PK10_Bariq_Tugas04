package pk10_tugas04_07e;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

/**
 * menggambar garis di jframe
 * @author Bariq 30/05-2024
 */

public class PanelGambar extends JPanel {
    private SecureRandom angkaAcak = new SecureRandom();
    private GarisSaya[] garis; // array garis

    // konstruktor, membuat panel dengan bentuk acak
    public PanelGambar() {
        setBackground(Color.WHITE);

        garis = new GarisSaya[5 + angkaAcak.nextInt(5)];

        // membuat garis
        for (int hitung = 0; hitung < garis.length; hitung++) {
            // menghasilkan koordinat acak
            int x1 = angkaAcak.nextInt(300);
            int y1 = angkaAcak.nextInt(300);
            int x2 = angkaAcak.nextInt(300);
            int y2 = angkaAcak.nextInt(300);

            // menghasilkan warna acak
            Color warna = new Color(angkaAcak.nextInt(256), 
                                    angkaAcak.nextInt(256), 
                                    angkaAcak.nextInt(256));

            // menambahkan garis ke daftar garis yang akan ditampilkan
            garis[hitung] = new GarisSaya(x1, y1, x2, y2, warna);
        }
    }

    // untuk setiap array bentuk, gambar bentuk individual
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // menggambar garis
        for (GarisSaya garis : garis) {
            garis.gambar(g);
        }
    }
} // akhir kelas