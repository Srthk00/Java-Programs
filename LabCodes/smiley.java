import java.awt.*;
import javax.swing.*;

public class smiley extends Canvas{
    public void paint(Graphics g){
        setBackground(Color.magenta);
        setForeground(Color.black);
        // g.drawString("Hello Java",400,200);
        // g.drawLine(50,80, 200, 300);
        // g.drawArc(150, 160, 300, 100, 0, 90);
        // int []x={20,35,50,65,80,95};
        // int []y={60,105,105,110,95,95};
        // g.fillPolygon(x,y,6);
        g.drawRect(700, 150, 150, 100); //head
        g.fillOval(740,185,20,20); //left eye
        g.fillOval(790,185,20,20); // right eye
        g.fillRect(740, 225, 70, 10); // mouth
        g.drawRect(750 , 110, 50, 40); // top
        g.drawRect(680 , 170, 20, 40);  // left ear
        g.drawRect(850 , 170, 20, 40); // right ear
        g.drawRect(750 , 250, 50, 20); // neck
        g.drawRect(680, 270, 190, 200); // body
        g.drawRect(660 , 270, 20, 30);  // left shoulder
        g.drawRect(640 , 270, 20, 180);  // left hand
        g.drawRect(870 , 270, 20, 30);  // right shoulder
        g.drawRect(890 , 270, 20, 180);  // right hand
        g.drawRect(710 , 470, 50, 180);  // left leg
        g.drawRect(790 , 470, 50, 180);  // right leg
        g.drawRect(680 , 650, 80, 30);  // left boot
        g.drawRect(790 , 650, 80, 30);  // right boot
        
        
    }
    public static void main(String[] args) {
        smiley s=new smiley();
        JFrame f=new JFrame();
        f.add(s);
        f.setSize(300,400);
        f.setVisible(true);
    }
}


// 770,470,10,50