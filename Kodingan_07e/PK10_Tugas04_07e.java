package pk10_tugas04_07e;

import javax.swing.JFrame;

/**
 * menggambar garis di jframe
 * @author Bariq 30/05-2024
 */

public class PK10_Tugas04_07e {
    public static void main(String[] args) {
        PanelGambar panel = new PanelGambar();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
} // akhir kelas