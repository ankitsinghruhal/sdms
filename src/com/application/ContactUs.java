import com.application;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ContactUs
{
    public static void main(String[] args)
    {
        JFrame welcomeScreen = new JFrame("CDMS");
        welcomeScreen.setSize(500,100);
        welcomeScreen.setResizable(false);
        welcomeScreen.setLocationRelativeTo(null);
        welcomeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel welcomeMessage = new JLabel("contact us at : registrar@dcrustm.org \n Telephone No. +91-130-2484005.");
        welcomeMessage.setHorizontalAlignment(JLabel.CENTER);
        welcomeMessage.setFont(new Font("Arial" , Font.PLAIN, 15));
        welcomeScreen.add(welcomeMessage);

        LoginScreen.main(args);

        welcomeScreen.setVisible(true);
    }
}