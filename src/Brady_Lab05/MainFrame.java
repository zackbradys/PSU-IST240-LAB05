// MainFrame.java
// Zack Brady | IST 240

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

    ControlPanel CPObj;

    public MainFrame() {
        super("L05: Lab Assignment - Java: Panels and Layouts | Zack Brady");
        CPObj = new ControlPanel();
        getContentPane().add(CPObj, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 480);
        setVisible(true);
    }

    public void MacLayoutSetup() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
