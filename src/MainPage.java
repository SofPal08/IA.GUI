import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage
{
    private JPanel MainPanel;
    private JButton SavedReceipts;
    private JButton AddReceipt;
    private JButton SavedReports;
    private JButton NewReport;
    private JLabel Title;

    public MainPage()
    {
        setContentPane(MainPanel);
        setTitle("Receipt Saver");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(400, 400);
        setLocationRelativeTo( null );
        setVisible ( true );
    }

    public static void main (String[] args )
    {
        new MainPage();

    }
}