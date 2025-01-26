import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet {

    // The paint method is used to display content on the applet window
    @Override
    public void paint(Graphics g) {
        // Display "Hello, World!" message on the applet window
        g.drawString("Hello, World!", 50, 50);
    }
}
