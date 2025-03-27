package com.application;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class HomeScreen
{
    public static void main(String[] args)
    {
        JFrame homeScreen = new JFrame("SDMS - Home");
        homeScreen.setSize(1500,800);
        homeScreen.setResizable(false);
        homeScreen.setLocationRelativeTo(null);
        homeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane userpane = new JTabbedPane();
        userpane.setSize(700,400);

        JPanel LoginPanel = new JPanel(new GridLayout(3,2,5,5));
        JPanel SignUpPanel = new JPanel(new GridLayout(3,2,5,5));

        userpane.addTab("Home", LoginPanel);
        userpane.setMnemonicAt(0, KeyEvent.VK_1);
        userpane.addTab("Exit", SignUpPanel);
        userpane.setMnemonicAt(1, KeyEvent.VK_1);
        
        homeScreen.setContentPane(userpane);

        homeScreen.setVisible(true);
    }
}
