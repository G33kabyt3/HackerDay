package GameLogic;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DisplayImage {

	String imagestr;
    public DisplayImage(String img) {
    	imagestr = img;
        displayImage(getImage());
    }

    private Image getImage() {
        try {
            return ImageIO.read(getClass().getResourceAsStream(
                    imagestr));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void displayImage(Image image) {
        JLabel label = new JLabel(new ImageIcon(image));

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(label);
        panel.setName("CONGRAGULATION");

        JScrollPane scrollPane = new JScrollPane(panel);
        JOptionPane.showMessageDialog(null, scrollPane);
    }

}
