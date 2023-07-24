package com.java;
import javax.swing.*;
        import java.awt.*;
        import java.io.FileOutputStream;
        import java.io.ObjectOutputStream;

public class GUIExample {
    JFrame frame;
    JPanel panel;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4;
    String[] str={"male","female","neuter"};
    JComboBox<String> gender;
    JButton b1,b2;
    GUIExample(){
        frame=new JFrame("Registration Form");
        panel =new JPanel(new GridLayout(6,2));
        l1=new JLabel("Name: ");
        l2=new JLabel("Father's name: ");
        l3=new JLabel("City: ");
        l4=new JLabel("Age: ");
        l5=new JLabel("Gender: ");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        gender=new JComboBox<>(str);
        b1=new JButton("Clear");
        b2=new JButton("Next");
        frame.setSize(500,500);
        panel.setSize(500,500);
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(l3);
        panel.add(t3);
        panel.add(l4);
        panel.add(t4);
        panel.add(l5);
        panel.add(gender);
        panel.add(b1);
        panel.add(b2);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(e->{
            new GUIExample();
            frame.dispose();
        });
        b2.addActionListener(e->{
            try{
                FileOutputStream fos=new FileOutputStream("sdb.txt",true);
                ObjectOutputStream ous=new ObjectOutputStream(fos);
                String s1=t1.getText();
                String s2=t2.getText();
                String s3=t3.getText();
                String s4=t4.getText();
                String s5=gender.getSelectedItem().toString();
                ous.writeObject("\n"+s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5);
                ous.close();
                JOptionPane.showMessageDialog(panel,"Data Saved");
                new GUIExample();
                frame.dispose();
            }catch (Exception ex){
                JOptionPane.showMessageDialog(panel,ex.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        new GUIExample();
    }
}
