import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class label extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3;
    public label(){
        JLabel l1=new JLabel("First Name: ");
        tf1=new JTextField(20);
        JLabel l2=new JLabel("Second Name: ");
        tf2=new JTextField(20);
        JButton jb=new JButton("Concat");
        JLabel l3=new JLabel("Result: ");
        tf3=new JTextField(20);
        setLayout(new FlowLayout(FlowLayout.CENTER,30,10));
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(jb);
        add(l3);
        add(tf3);
        jb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        tf3.setText(tf1.getText()+tf2.getText());
    }
    public static void main(String args[]) {
        label d = new label();
        d.setSize(300, 400);
        d.setVisible(true);
        
    }
}