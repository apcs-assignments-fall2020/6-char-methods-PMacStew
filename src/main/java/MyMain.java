import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch >= 65 && ch <= 90)
            ch += 32;
        return (char) ch;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
                result += (char) (str.charAt(i) + 32); 
            else
                result += str.charAt(i);
        }
        return result;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (ch >= 97 && ch <= 122)
            ch -= 32;
        return (char) ch;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
                result += (char) (str.charAt(i) - 32);
            else    
                result += str.charAt(i);
        }
        return result;
    }


    public static void main(String[] args) {
        boolean question = true;
        String letterChoice = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = scan.next().charAt(0);
        System.out.print("Would you like to change this letter to uppercase or lowercase: ");
        while (question) {
            letterChoice = scan.nextLine();
            if (letterChoice.toUpperCase().equals("UPPERCASE")) {
                System.out.println("The uppercase form of your letter is " + toUpper(ch));
                question = false; }
            else if (letterChoice.toUpperCase().equals("LOWERCASE")) {
                System.out.println("The lowercase form of you letter is " + toLower(ch));
                question = false; }
            else
                System.out.println("Invalid input. Try again.");
        }

        
    }
}
