import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.FileInputStream;


public class AddReceipt extends JFrame
{
    private JPanel MainPanel;
    private JLabel Title;
    private JTextField Name;
    private JTextField Date;
    private JTextField Total_Price;
    private JButton next;
    private JButton insertButton;
    private JTextField textField1;

    public AddReceipt()
{
    setContentPane(MainPanel);
    setTitle("Receipt Saver");
    setDefaultCloseOperation( EXIT_ON_CLOSE );
    setSize(500,600);
    setLocationRelativeTo( null );
    setVisible( true );


    insertButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}

}

