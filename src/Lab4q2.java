import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab4q2 {


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

            public String[] list()
            {

            }

            while (scan.hasNextLine())
            {
                String word = scan.next();
                if (count % numWords == 0)
                {
                    System.out.println(word);
                }

                pw[count % numWords].print(word);

                count++;
            }

            for(int i = 0; i < numFiles; i++)
            {
                pw[i].close();
            }

            /*for(int i = 0; i < numFiles; i++)
            {

            }*/


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
