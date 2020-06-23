import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Task1 {

    public static void readStream(String nameFile) {
        try {
            InputStream stream = new FileInputStream(nameFile);
            byte[] bytes = new byte[256];
            int count;
            while ((count = stream.read(bytes)) != -1) {
                String text = new String(bytes, 0, count, "utf8");
                System.out.println("text = " + text);
            }
            stream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
