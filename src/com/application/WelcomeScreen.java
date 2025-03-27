package com.application;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeScreen
{
    public static void main(String[] args)
    {
        JFrame welcomeScreen = new JFrame("SDMS");
        welcomeScreen.setSize(500,100);
        welcomeScreen.setResizable(false);
        welcomeScreen.setLocationRelativeTo(null);
        welcomeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel welcomeMessage = new JLabel("welcome to Student Data management System.");
        welcomeMessage.setHorizontalAlignment(JLabel.CENTER);
        welcomeMessage.setFont(new Font("Arial" , Font.PLAIN, 15));
        welcomeScreen.add(welcomeMessage);

        LoginScreen.main(args);

        welcomeScreen.setVisible(true);
    }
}