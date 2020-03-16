import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        int note = gameMechanics.noteImage();
        gameWindow gameWindow = new gameWindow(note, 0);
        //gameWindow.revalidate();


    }
}
