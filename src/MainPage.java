import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainPage extends JFrame
{
    private JPanel MainPanel;
    private JButton SavedReceipts;
    private JButton SavedReports;
    private JButton NewReport;
    private JLabel Title;
    private JButton AddReceipt;

    public MainPage()
    {
        setContentPane(MainPanel);
        setTitle("Receipt Saver");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(500,600);
        setLocationRelativeTo( null );
        setVisible( true );

        SavedReceipts.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new SavedReceipts();
                dispose();
            }
        });

        SavedReports.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new SavedReports();
                dispose();
            }
        });

        AddReceipt.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new AddReceipt();

            }
        });
    }

    public static void main(String [] args)
    {
        new MainPage();
    }
}