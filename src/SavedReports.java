import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SavedReports extends JFrame
{
    private JPanel MainPanel;
    private JLabel Title;
    private JButton Back;

    public SavedReports()
    {
        setContentPane(MainPanel);
        setTitle("Receipt Saver");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        Back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JFrame SavedReports = (JFrame) SwingUtilities.getWindowAncestor(Back);
                SavedReports.dispose();
            }
        });
    }
}
