import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab4q2 {

    public static void fileSplitter(String words, int numFiles) throws FileNotFoundException {





    }




    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            int numFiles = 5;
            int numWords = 5;

            File[] fa = new File[numFiles];
            PrintWriter[] pw = new PrintWriter[numFiles];

            for (int i = 0; i < numFiles; i++)
            {
                fa[i] = new File(("File" + i + ".txt"));
                pw[i] = new PrintWriter(fa[i]);
            }

            File f = new File("input.txt");
            Scanner scan = new Scanner(f);

            int count = 0;
            String words = "";

            while (scan.hasNextLine())
            {
                words = scan.next();

                pw[count % numWords].print(words + " "); // puts word in to correct file
                count++;
            }

            for(int i = 0; i < numFiles; i++) // closes printwriter for each file
            {
                pw[i].close();
            }

            fileSplitter(words, numFiles);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
