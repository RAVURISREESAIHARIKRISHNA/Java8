package swingimple;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo
{

    public SwingDemo()
    {
        JFrame Frame = null;
        Frame = new JFrame("Hari Technologies");
        Frame.setSize(500, 500);
        JLabel Label = null;
        Label = new JLabel("Welcome to Hari Technologies...\n\n\nHello World");
        Frame.add(Label);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setVisible(true);
    }

    public SwingDemo(String title, String matter)
    {
        JFrame Frame = new JFrame(title);
        Frame.setSize(500, 500);
        JLabel Label = new JLabel(matter);
        Frame.add(Label);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setVisible(true);

    }

}
