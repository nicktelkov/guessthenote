import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gameWindow extends JFrame {

        int score;

    public gameWindow(int note, int sc){
        this.score = sc;
        setTitle("Guess The Note SCORE: " + score);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gamePanel gamePanel = new gamePanel(note);
        gamePanel.setBounds(695, 800, 95, 200);
        add(gamePanel);
        setBounds(600, 600, 800, 400);

        JButton[] jbs = new JButton[7];
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        jbs[0] = new JButton("C - do");
        jbs[1] = new JButton("D - re");
        jbs[2] = new JButton("E - mi");
        jbs[3] = new JButton("F - fa");
        jbs[4] = new JButton("G - sol");
        jbs[5] = new JButton("A - la");
        jbs[6] = new JButton("B - si");
        for (int i = 0; i <= 6; i++) {
            jbs[i].setAlignmentX(BOTTOM_ALIGNMENT);
            add(jbs[i]);
        }
        jbs[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed..." + gameMechanics.checkNote(0, note));
                gameMechanics.checkNote(0, note);
                if (!gameMechanics.checkNote(0, note)) {
                    AlertDialog dialog = new AlertDialog();
                    dialog.setResultMessage("Вы проиграли");
                }
                dispose();
                score ++;
                new gameWindow(gameMechanics.noteImage(), score);
            }
        });
        jbs[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed..." + gameMechanics.checkNote(1, note));
                gameMechanics.checkNote(1, note);
                if (!gameMechanics.checkNote(1, note)) {
                    AlertDialog dialog = new AlertDialog();
                    dialog.setResultMessage("Вы проиграли");
                }
                dispose();
                score ++;
                new gameWindow(gameMechanics.noteImage(), score);
            }
        });
        jbs[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed..." + gameMechanics.checkNote(2, note));
                gameMechanics.checkNote(2, note);
                if (!gameMechanics.checkNote(2, note)) {
                    AlertDialog dialog = new AlertDialog();
                    dialog.setResultMessage("Вы проиграли");
                }
                dispose();
                score ++;
                new gameWindow(gameMechanics.noteImage(), score);
            }
        });
        jbs[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed..." + gameMechanics.checkNote(3, note));
                gameMechanics.checkNote(3, note);
                if (!gameMechanics.checkNote(3, note)) {
                    AlertDialog dialog = new AlertDialog();
                    dialog.setResultMessage("Вы проиграли");
                }
                dispose();
                score ++;
                new gameWindow(gameMechanics.noteImage(), score);
            }
        });
        jbs[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed..." + gameMechanics.checkNote(4, note));
                gameMechanics.checkNote(4, note);
                if (!gameMechanics.checkNote(4, note)) {
                    AlertDialog dialog = new AlertDialog();
                    dialog.setResultMessage("Вы проиграли");
                }
                dispose();
                score ++;
                new gameWindow(gameMechanics.noteImage(), score);
            }
        });
        jbs[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed..." + gameMechanics.checkNote(5, note));
                gameMechanics.checkNote(5, note);
                if (!gameMechanics.checkNote(5, note)) {
                    AlertDialog dialog = new AlertDialog();
                    dialog.setResultMessage("Вы проиграли");
                }
                dispose();
                score ++;
                new gameWindow(gameMechanics.noteImage(), score);
            }
        });
        jbs[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed..." + gameMechanics.checkNote(6, note));
                gameMechanics.checkNote(6, note);
                if (!gameMechanics.checkNote(6, note)) {
                    AlertDialog dialog = new AlertDialog();
                    dialog.setResultMessage("Вы проиграли");
                }
                dispose();
                score ++;
                new gameWindow(gameMechanics.noteImage(), score);
            }
        });

        setVisible(true);
    }

}




