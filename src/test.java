import javax.swing.*;
import java.awt.*;

//import java.io.BufferedReader;
//
//import java.io.FileReader;
//import java.io.IOException;
//

public class test {
    int x =50;
    int y =50;
    @Override
    public void paint (Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(x,y,30,30);
    }
    public static void main(String [] ars){
        JFrame frame = new JFrame("paintTest");
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panel.repaint();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run ( ) {
                if(panel.x<=300){
                    panel.x++;
                    panel.repaint();
                }
            }
        },0,20);
    }

}

//}
