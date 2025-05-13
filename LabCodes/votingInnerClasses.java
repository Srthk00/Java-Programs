import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class votingInnerClasses extends JFrame{
    JTextField tf1,tf2;
    JTextArea ta;
    JRadioButton rd1,rd2;
    public votingInnerClasses(){
        setLayout(new FlowLayout());
        JLabel jl1=new JLabel("Enter Name: ");
        add(jl1);
        tf1=new JTextField(40);
        add(tf1);
        JLabel jl2=new JLabel("Enter Age: ");
        add(jl2);
        tf2=new JTextField(40);
        add(tf2);
        JLabel jl3=new JLabel("Catagory: ");
        add(jl3);
        rd1=new JRadioButton("Male");
        add(rd1);
        rd2=new JRadioButton("Female");
        add(rd2);
        ButtonGroup bg=new ButtonGroup();
        bg.add(rd1);
        bg.add(rd2);
        JButton b=new JButton("VOTE");
        add(b);
        JLabel jl4=new JLabel("Message: ");
        add(jl4);
        ta=new JTextArea(30,40);
        add(ta);
        b.addActionListener(new xyz());
        rd1.addItemListener(new xyz());
        rd2.addItemListener(new xyz());
    }

    class xyz implements ActionListener,ItemListener{
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

        public void itemStateChanged(ItemEvent e){
            if(rd1.isSelected()){
                ta.setBackground(Color.blue);
            }
            if(rd2.isSelected()){
                ta.setBackground(Color.pink);
            }
        }
    }

    public static void main(String[] args) {
        votingInnerClasses v=new votingInnerClasses();
        v.setSize(300,400);
        v.setVisible(true);
    }
}