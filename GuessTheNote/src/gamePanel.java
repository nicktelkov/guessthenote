//import sun.lwawt.macosx.CPrinterGraphics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class gamePanel extends JPanel {
int i;
   // private final CPrinterGraphics g;
    Image[] note = new Image[7];

    gamePanel(int i){
        try {
            note[0] = ImageIO.read(new File("/Volumes/Nick Studio/Users/Nick/Documents/Coding/Java/GuessTheNote/src/C.png"));
            note[1] = ImageIO.read(new File("/Volumes/Nick Studio/Users/Nick/Documents/Coding/Java/GuessTheNote/src/D.png"));
            note[2] = ImageIO.read(new File("/Volumes/Nick Studio/Users/Nick/Documents/Coding/Java/GuessTheNote/src/E.png"));
            note[3] = ImageIO.read(new File("/Volumes/Nick Studio/Users/Nick/Documents/Coding/Java/GuessTheNote/src/F.png"));
            note[4] = ImageIO.read(new File("/Volumes/Nick Studio/Users/Nick/Documents/Coding/Java/GuessTheNote/src/G.png"));
            note[5] = ImageIO.read(new File("/Volumes/Nick Studio/Users/Nick/Documents/Coding/Java/GuessTheNote/src/A.png"));
            note[6] = ImageIO.read(new File("/Volumes/Nick Studio/Users/Nick/Documents/Coding/Java/GuessTheNote/src/B.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    this.i = i;
    }
    public void paintComponent(Graphics g){
        g.drawImage(note[i], 10, 10, null);
    }


}


