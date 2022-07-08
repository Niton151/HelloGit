package HelloGit;

import java.util.Random;
import java.util.Scanner;

class HeadsOrTails 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Who are you?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Tossing a coin...");

        int headCount = 0, tailCount = 0;
        for (int i = 1; i <= 3; i++) 
        {
            String result = "";
           if(randomBool())
           {
                result = "Heads";
                headCount++;
           }
           else
           {
                result = "Tails";
                tailCount++;
           }
           System.out.println("Round " + i + ": " + result);
        }

        System.out.println("Heads: " + headCount + ", Tails: " + tailCount);

        if(headCount > tailCount)
        {
            System.out.println(name + " won!");
        }
        else
        {
            System.out.println(name + " lost.");
        }
    }

    private static boolean randomBool() 
    {
        Random r = new Random();
        return r.nextInt(2) == 0;
    }
}