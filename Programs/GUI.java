package com.java;
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.io.FileOutputStream;
        import java.io.ObjectOutputStream;
        import java.io.Serializable;
        import java.util.ArrayList;
public class GUI implements Serializable {
    String name;
    String fatherName;

    GUI(String name, String fatherName){
        this.name = name;
        this.fatherName = fatherName;
    }
    public String toString(){
        return name + "     " + fatherName;
    }


    public static void main(String[] args) {
        new guiframe();
    }
}
class guiframe extends JFrame{
    Container c ;
    JLabel l1;
    JLabel l2;
    JTextField t1;
    JTextField t2;
    JButton b1;
    ArrayList<GUI>e1 = new ArrayList<GUI>();
    guiframe(){
        c = getContentPane();

        c.setLayout(new GridLayout(3,2));

        l1 = new JLabel("NAME : ");
        l2 = new JLabel("Father NAME : ");

        t1 = new JTextField(30);
        t2 = new JTextField(30);

        b1 = new JButton("Save Data");

        JLabel t3 = new JLabel();

        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(t2);
        c.add(t3);
        c.add(b1);

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    savedata();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public void savedata() throws Exception{
        String name = t1.getText();
        String fathername = t2.getText();

        /*System.out.println(name);
        System.out.println(fathername);
        */
        new GUI(name , fathername);

        FileOutputStream file = new FileOutputStream("C:\\Users\\Muhammad Shayan\\Desktop\\Java Final preparetions\\IO streams\\writing.txt");

        ObjectOutputStream obj = new ObjectOutputStream(file);

        obj.writeObject(e1);
        obj.close();

    }
}
