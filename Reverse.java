import java.util.Scanner;

public class Reverse{
        public static Scanner fish = new Scanner(System.in); 
        public static String text = "klahgl";
        public static String reverse = "";
        public static String[] foo = {"hi", "hello"};
        public static int textLength = 0;
    public static void main(String[] args) {
        boolean error = false;
        do
        {
            error = false;
            System.out.println("\n\nEnter a string");
            text = fish.nextLine(); 
            if (text.equals("")) { System.out.println("Invalid string"); error = true;} 
        } while (error);
            
        
        textLength = text.length();
        for (int i = 0; i < textLength; i++)
        {
            reverse = reverse + text.charAt((textLength - 1) - i);
        }
        System.out.println("Your reversed text is: " + reverse);
    }
    
    public static void ResetVars()
    {
        Scanner fish = new Scanner(System.in); 
        String text = "klahgl";
        String reverse = "";
        String[] foo = {"hi", "hello"};
        int textLength = 0;
    }
}