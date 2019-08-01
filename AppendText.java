package A3;

import java.io.FileOutputStream;
import java.io.IOException;

public class AppendText{
    public static void main(String[] args) throws IOException {
        try (FileOutputStream output = new FileOutputStream("src//main/java/A3/append.txt",true)) {
            String str = "Hello";
            byte[] toByte = str.getBytes();
            output.write(toByte);
        }
    }
}