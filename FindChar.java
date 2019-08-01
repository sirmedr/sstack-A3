package A3;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FindChar {
    public static void main(String[] args) throws IOException{
        char[] characters;
        char input = 'H';
        String line;
        int count=0;
        try{
            if(Character.isLetter(args[0].charAt(0)))
                input = args[0].charAt(0);
            else
                System.out.println("Argument given is not a character");
            }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("No Argument given. Continuing with default value '" + input + "'");
        }

        File getTxt=new File("/Users/sergiomedrano/NetBeansProjects/MavenP1/src/main/java/A3/append.txt");
        FileReader fReader = new FileReader(getTxt);
        BufferedReader bReader = new BufferedReader(fReader);
        
        
        while((line=bReader.readLine())!=null)
        {
            characters=line.toCharArray();
            for (int i = 0; i<characters.length;i++) 
            {
                char character = characters[i];
                //System.out.println(character);
                if(character == input)
                    count++;
            }
        }
        if(count!=0)
            System.out.println("Character '" + input + "' found " + count + " times");
        else
            System.out.println("Character not found");
        fReader.close();
    }
}