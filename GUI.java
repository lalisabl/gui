
package gui;
import javax.swing.*;
import java.awt.*;
public class GUI {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        JLabel label=new JLabel("Students Registration System  ");
        JLabel name=new JLabel("Full name");
        JTextField field=new JTextField();
        JLabel gend=new JLabel("Gender");
        JRadioButton male=new JRadioButton("Male");
       JRadioButton female=new JRadioButton("Female");
       ButtonGroup group = new ButtonGroup();
group.add(male);
group.add(female);
       JLabel sub=new JLabel("Favorite Subject");
       JCheckBox math=new JCheckBox("Maths");
       JCheckBox phy=new JCheckBox("Physics");
       JCheckBox pro=new JCheckBox("Programing");
       JButton butn =new JButton("Submit");
       JPanel pan=new JPanel();
             pan.setLayout(new BoxLayout(pan, BoxLayout.Y_AXIS));

       butn.setBackground(Color.green);
       pan.add(label);
       pan.add(name);
                     
       pan.add(field);
       pan.add(gend);
 JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        radioPanel.add(male);
        radioPanel.add(female);
        
        pan.add(radioPanel);        
        pan.add(sub);
       pan.add(math);
       pan.add(phy);
       pan.add(pro);
       pan.add(butn);
butn.setFont(new Font("Arial", Font.PLAIN, 50));

field.setPreferredSize(new Dimension(50,50));
label.setFont(new Font("Arial", Font.PLAIN, 30));
name.setFont(new Font("Arial", Font.PLAIN, 30));
gend.setFont(new Font("Arial", Font.PLAIN, 30));
male.setFont(new Font("Arial", Font.PLAIN, 30));
female.setFont(new Font("Arial", Font.PLAIN, 30));
sub.setFont(new Font("Arial", Font.PLAIN, 30));
math.setFont(new Font("Arial", Font.PLAIN, 30));
phy.setFont(new Font("Arial", Font.PLAIN, 30));
pro.setFont(new Font("Arial", Font.PLAIN, 30));
frame.setLayout(new FlowLayout());
        frame.getContentPane().add(pan);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();


        
    }
    
}
