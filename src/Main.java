import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        MainForm form = new MainForm();
        JFrame frame = new JFrame();

        frame.add(new MainForm().getMainPanel());

        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
