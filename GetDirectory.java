package A3;

import java.io.File;
public class GetDirectory {
    public static void main(String[] args){
        String path = "/Users/sergiomedrano/NetBeansProjects/MavenP1/src/main/java/";
        String fileStr = "-----  Files  -----\n";
        String dirStr =  "--- Directories ---\n";
        File directory = new File(path);
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile())
                fileStr = fileStr + file.getName()+"\n";
            else
                dirStr = dirStr + file.getName()+"\n";
        }
        System.out.print(dirStr+ "\n" + fileStr);
    }
}