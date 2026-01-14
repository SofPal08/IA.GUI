import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AddReceipt extends JFrame {
    private JButton AddFile;
    private JPanel MainPanel;
    private JLabel Title;

    public AddReceipt() {
        setContentPane(MainPanel);
        setTitle("Add Receipt");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        AddFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(
                        new FileNameExtensionFilter("png", "jpg", "jpeg","HEIC", "images")
                );

                int receipt = fileChooser.showOpenDialog(AddReceipt.this);
                if (receipt == JFileChooser.APPROVE_OPTION) {
                    File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                }


            }
        });
    }

    public static String readImage(File imageFile)
    {
        try
        {
            ITesseract tesseract = new Tesseract();
            tesseract.setDatapath("tessdata");
            tesseract.setLanguage("eng");

            return tesseract.doOCR(imageFile);
        }
            catch (Exception e)
            {
                e.printStackTrace();
                return"";

            }
    }

}




