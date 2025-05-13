import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class voting extends JFrame implements ActionListener{
    JTextField tf1,tf2;
    JTextArea ta;
    JRadioButton rd1,rd2;
    public voting(){
        setLayout(new FlowLayout(FlowLayout.CENTER,30,10));
        JLabel jl1=new JLabel("Enter Name: ");
        tf1=new JTextField(40);
        JLabel jl2=new JLabel("Enter Age: ");
        tf2=new JTextField(40);
        JLabel jl3=new JLabel("Catagory: ");
        rd1=new JRadioButton("Male");
        rd2=new JRadioButton("Female");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rd1);
        bg.add(rd2);
        JButton b=new JButton("VOTE");
        JLabel jl4=new JLabel("Message: ");
        ta=new JTextArea();
        add(jl1);
        add(tf1);
        add(jl2);
        add(tf2);
        add(jl3);
        add(rd1);
        add(rd2);
        add(b);
        add(jl4);
        add(ta);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String gender=(rd1.isSelected())?"Male":"Female";
        String a=tf2.getText();
        int age=Integer.parseInt(a);
        if(age<18 && gender.equals("Male")){
            ta.setText("Sorry! Mr."+tf1.getText()+", you can't vote since your age is less than 18...");
        }
        else if(age<18 && gender.equals("Female")){
            ta.setText("Sorry! Ms."+tf1.getText()+", you can't vote since your age is less than 18...");
        }
        else{
            ta.setText("Welcome To Voting Booth...");
        }
    }
    public static void main(String[] args) {
        voting v=new voting();
        v.setSize(300,400);
        v.setVisible(true);
    }
}
