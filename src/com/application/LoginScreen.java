package com.application;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

public class LoginScreen
{
    public static void main(String[] args)
    {
        JFrame loginScreen = new JFrame("SDMS - Login");
        loginScreen.setSize(800,500);
        loginScreen.setResizable(false);
        loginScreen.setLocationRelativeTo(null);
        loginScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane userpane = new JTabbedPane();
        userpane.setSize(700,400);

        JPanel LoginPanel = new JPanel(new GridLayout(3,2,5,5));
        JPanel SignUpPanel = new JPanel(new GridLayout(3,2,5,5));

        userpane.addTab("Login", LoginPanel);
        userpane.setMnemonicAt(0, KeyEvent.VK_1);
        userpane.addTab("Sign Up", SignUpPanel);
        userpane.setMnemonicAt(1, KeyEvent.VK_1);
        
        loginScreen.setContentPane(userpane);
        loginScreen.setVisible(true);
    }   
}
