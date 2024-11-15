import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    Ball balls = new Ball();
    public GUI(){


        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try{
                        Thread.sleep(20);
                    }catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                    balls.move();
                    repaint();
                }

            }
        });
        t.start();
        JFrame f = new JFrame();
        f.add(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);
    };


    public void paint(Graphics g){
        super.paint(g);
        balls.draw(g);
    }
}
