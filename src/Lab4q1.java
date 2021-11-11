import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab4q1 {

    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            Scanner scan = new Scanner(new File("input.txt"));

            int numWord = 5;
            int count = 0;

            while (scan.hasNext())
            {

                if (count % numWord == 0)
                {
                    System.out.print(scan.next() + " ");
                }
                else
                {
                    scan.next();
                }
                count++;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
