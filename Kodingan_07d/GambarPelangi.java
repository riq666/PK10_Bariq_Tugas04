package pk10_tugas04_07d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Menggambar pelangi
 * @author Bariq 30/05-2024
 */

public class GambarPelangi extends JPanel {
    // definisikan warna nila dan ungu
    private final static Color UNGU = new Color(128, 0, 128);
    private final static Color NILA = new Color(75, 0, 130);

    // warna-warna yang digunakan dalam pelangi, dimulai dari yang paling dalam
    // Dua entri putih menghasilkan busur kosong di tengah
    private Color[] warna = {
        Color.WHITE, Color.WHITE, UNGU, NILA, Color.BLUE,
        Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED
    };

    // konstruktor
    public GambarPelangi() {
        setBackground(Color.WHITE); // atur latar belakang menjadi putih
    }

    // menggambar pelangi menggunakan busur konsentris
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int radius = 20; // radius busur
        // menggambar pelangi di dekat tengah bawah
        int pusatX = getWidth() / 2;
        int pusatY = getHeight() - 10;

        // menggambar busur terisi mulai dari yang paling luar
        for (int counter = warna.length; counter > 0; counter--) {
            // atur warna untuk busur saat ini
            g.setColor(warna[counter - 1]);

            // mengisi busur dari 0 hingga 180 derajat
            g.fillArc(pusatX - counter * radius,
                      pusatY - counter * radius,
                      counter * radius * 2, counter * radius * 2, 0, 180);
        }
    }
} //akhir kelas