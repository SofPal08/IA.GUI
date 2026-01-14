import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class TestClass
{
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

    public static void main(String[] args) {
        File testImage = new File("test.png");
        String result = readImage(testImage);
        System.out.println(result);
    }

}
