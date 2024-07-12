package pk10_tugas04_07e;

import java.awt.Color;
import java.awt.Graphics;

/**
 * menggambar garis di jframe
 * @author Bariq 30/05-2024
 */

public class GarisSaya {
    private int x1; // koordinat x titik awal
    private int y1; // koordinat y titik awal
    private int x2; // koordinat x titik akhir
    private int y2; // koordinat y titik akhir
    private Color warna; // warna garis ini

    // konstruktor dengan nilai input
    public GarisSaya(int x1, int y1, int x2, int y2, Color warna) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.warna = warna;
    }

    // Menggambar garis dengan warna yang ditentukan
    public void gambar(Graphics g) {
        g.setColor(warna);
        g.drawLine(x1, y1, x2, y2);
    }
} // akhir kelas