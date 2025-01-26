import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class VLCUIClone {
    JMenu menu1, menu2, menu3, menu4, menu5, menu6, menu7, menu8;
    JMenuItem i1;

    public VLCUIClone() throws IOException {
        JFrame frame = new JFrame("VLC UI Clone");
        JMenuBar bar = new JMenuBar();
        menu1 = new JMenu("Media");
        menu2 = new JMenu("Playback");
        menu3 = new JMenu("Audio");
        menu4 = new JMenu("Video");
        menu5 = new JMenu("Subtitle");
        menu6 = new JMenu("Tools");
        menu7 = new JMenu("View");
        menu8 = new JMenu("Help");

        i1 = new JMenuItem("Item 1");

        menu1.add(i1);
        bar.add(menu1);
        bar.add(menu2);
        bar.add(menu3);
        bar.add(menu4);
        bar.add(menu5);
        bar.add(menu6);
        bar.add(menu7);
        bar.add(menu8);

        File imagefile = new File("/home/arnavs/Downloads/vlc.png");
        frame.setIconImage(ImageIO.read(imagefile));

        frame.setJMenuBar(bar);
        frame.setVisible(true);
        frame.setSize(1920, 1200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }

    public  static void main(String[] args) throws IOException {
        new VLCUIClone();
    }

}
