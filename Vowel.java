import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Vowel{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String text = input.nextLine();
        Character[] vowelList = {'a', 'e', 'i', 'o', 'u'};
        
        int vowelCount = 0;
        int consCount = 0;
        char character = 'a';
        for (int i = 0; i < text.length(); i++)
        {
            character = text.charAt(i);
            if (IsIn(vowelList, character)) { vowelCount++; } else if (character != ' ') { consCount++; }            
        } 
        System.out.println("Vowels: " + vowelCount + "\nConsonants: " + consCount);
    }
    
    public static boolean IsIn(Character[] list, char value)
    {
        boolean foo = false;
        for (char e : list)
        {
            if (e == value) {foo = true;}
        }
        return foo;
    }
}

