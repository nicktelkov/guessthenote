import javax.swing.*;
import java.awt.*;

public class AlertDialog extends JFrame {

    private JLabel result;

    public void setResultMessage(String message) {
        result.setText(message);
    }

    public AlertDialog() throws HeadlessException {
        setLocation(350, 350);
        setSize(400, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        result = new JLabel();
        JButton ok = new JButton("NEW GAME"),
                close = new JButton("CLOSE");
        ok.addActionListener(ev -> {
            new gameWindow(gameMechanics.noteImage(), 0);
            dispose();
        });
        close.addActionListener(ev -> {
            System.exit(1);
        });
        JPanel panel = new JPanel();
        panel.add(result);
        panel.add(ok);
        panel.add(close);
        add(panel);
        setVisible(true);
    }
}
