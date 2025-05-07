import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class numberoperation extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3;
    public numberoperation(){
        JLabel l1=new JLabel("First Number: ");
        tf1=new JTextField(20);
        JLabel l2=new JLabel("Second Number: ");
        tf2=new JTextField(20);
        JButton jb1=new JButton("ADD");
        JButton jb2=new JButton("SUBTRACT");
        JLabel l3=new JLabel("Result: ");
        tf3=new JTextField(20);
        setLayout(new FlowLayout(FlowLayout.CENTER,30,10));
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(jb1);
        add(jb2);
        add(l3);
        add(tf3);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        int num1=Integer.parseInt(tf1.getText());
        int num2=Integer.parseInt(tf2.getText());
        if(s.equals("ADD"))
            tf3.setText(String.valueOf(num1+num2));
        else
            tf3.setText(String.valueOf(num1-num2));
    }
    public static void main(String args[]) {
        numberoperation d = new numberoperation();
        d.setSize(300, 400);
        d.setVisible(true);
        
    }
}