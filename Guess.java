import java.util.Scanner;

public class Guess
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String actualWord = "RANDOM";
        String guess = "";
        do 
        {
            System.out.println("Guess the 6 letter word");
            guess = input.nextLine().toUpperCase();
        
            System.out.print("You got: ");
            for (int i = 0; i < 6; i++)
            {
                String actualChar = actualWord.charAt(i) + "";
                String guessChar = guess.charAt(i) + "";
            
                if (actualChar.equals(guessChar)) { System.out.print(actualChar); }
                else { System.out.print("?"); }
                
            }
            System.out.println("\n");
        } while (!(actualWord.equals(guess)));
    }
}