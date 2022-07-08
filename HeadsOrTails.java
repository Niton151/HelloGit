package HelloGit;

import java.util.Random;

class HeadsOrTails 
{
    public static void main(String[] args) 
    {
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
            System.out.println("You won!");
        }
        else
        {
            System.out.println("You lost.");
        }
    }

    private static boolean randomBool() 
    {
        Random r = new Random();
        return r.nextInt(2) == 0;
    }
}