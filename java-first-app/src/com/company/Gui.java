package com.company;
import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what is your name");
        JOptionPane.showMessageDialog(null,"hello "+name);
        String work = JOptionPane.showInputDialog("what do you do?");
        JOptionPane.showMessageDialog(null,"your a "+work);
        int age =Integer.parseInt(JOptionPane.showInputDialog("how old are you?"));
        JOptionPane.showMessageDialog(null,"oh you are "+ age +" years old");

    }

}
