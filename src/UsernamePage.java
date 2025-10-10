import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsernamePage extends JFrame
{
    private JPanel MainPanel;
    private JTextArea Title;
    private JTextField username;
    private JPasswordField password;
    private JButton exitButton;

    public UsernamePage()
    {
        setContentPane(MainPanel);
        setTitle("Receipt Saver");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(400, 400);
        setLocationRelativeTo( null );
        setVisible ( true );
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
    }
    public static void main (String[] args )
    {
        new UsernamePage();

    }

}
