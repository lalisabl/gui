package gui;
import javax.swing.*;
import java.awt.*;
public class GUI {
    public static void main(String[] args) {
        JFrame frame =new JFrame("Students Registration form");
        JPanel content=new JPanel();
        JPanel radioPanel = new JPanel();

        JLabel label=new JLabel("Students Registration form");

        JLabel name=new JLabel("Full name");
        
        JTextField field=new JTextField();
        JLabel gender=new JLabel("Gender");
        JRadioButton male=new JRadioButton("Male");
        JRadioButton female=new JRadioButton("Female");
        ButtonGroup bnt_group = new ButtonGroup();
        bnt_group.add(male);
        bnt_group.add(female);
        JLabel subject=new JLabel("Favorite Subject");
        JCheckBox math=new JCheckBox("Maths");
        JCheckBox physics=new JCheckBox("Physics");
        JCheckBox program=new JCheckBox("Programing");
        JButton submit_butn =new JButton("Submit");
        submit_butn.setPreferredSize(new Dimension(350, 50));
        submit_butn.setBackground(Color.BLACK);
        radioPanel.add(male);
        radioPanel.add(female);
//      adding layout containers
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setLayout(new FlowLayout());
//        adding all subcontent and elements to the big container
        content.add(label);
        content.add(name);
        content.add(field);
        content.add(gender);
        content.add(radioPanel);        
        content.add(subject);
        content.add(math);
        content.add(physics);
        content.add(program);
        content.add(submit_butn);
//        adding style to each of the elements
submit_butn.setFont(new Font("Arial", Font.PLAIN, 20));
submit_butn.setForeground(Color.RED);
submit_butn.setFocusable(false);
field.setPreferredSize(new Dimension(50,50));
label.setFont(new Font("Arial", Font.PLAIN, 20));
name.setFont(new Font("Arial", Font.PLAIN, 20));
gender.setFont(new Font("Arial", Font.PLAIN, 20));
male.setFont(new Font("Arial", Font.PLAIN, 20));
female.setFont(new Font("Arial", Font.PLAIN, 20));
subject.setFont(new Font("Arial", Font.PLAIN, 20));
math.setFont(new Font("Arial", Font.PLAIN, 20));
physics.setFont(new Font("Arial", Font.PLAIN, 20));
program.setFont(new Font("Arial", Font.PLAIN, 20));
//
        frame.getContentPane().add(content);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();       
    }
    
}
