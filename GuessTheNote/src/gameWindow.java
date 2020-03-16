import javax.swing.*;
import java.awt.*;

public class gameWindow extends JFrame {
    public gameWindow() {
        setTitle("Guess The Note");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(600, 600, 400, 600);


        JButton[] jbs = new JButton[7];
        setLayout(new FlowLayout());
        jbs[0] = new JButton("C - do");
        jbs[1] = new JButton("D - re");
        jbs[2] = new JButton("E - mi");
        jbs[3] = new JButton("F - fa");
        jbs[4] = new JButton("G - sol");
        jbs[5] = new JButton("A - la");
        jbs[6] = new JButton("B - si");
        for (int i = 0; i <= 6; i++) {
            add(jbs[i]);
        }
        setVisible(true);
    }
}


