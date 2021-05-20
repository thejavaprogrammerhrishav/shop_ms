
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Programmer PC
 */
public class Image_Load {
    
    public static void load_image(String Path,JButton but){
        try {
            Image img=ImageIO.read(Image_Load.class.getResource(Path));
            img=img.getScaledInstance(but.getWidth(), but.getHeight(), Image.SCALE_SMOOTH);
            but.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            Logger.getLogger(Image_Load.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
