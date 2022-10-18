//Importing a scanner class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creating an object for the scanner class
        Scanner scan = new Scanner(System.in);
        //Asking the user for input
        System.out.println("Enter the first string");
        //storing the user input
        String strOne= scan.next();
        //Asking the user for input
        System.out.println("Enter the second string");
        //storing the user input
        String strTwo= scan.next();
        //creating the substring string
       String substring1;
        String substring2;
        //checking if the string is equal
        if(strOne.equals(strTwo)){
            //displaying if the strings are equal
            System.out.println("The strings are equal");
            //displaying the strings using concatenate
            System.out.println("The strings are equal and this is your strings "+strOne+" "+strTwo);
            //using the substrings method to get the substrings of the two strings
            substring1 = strTwo.substring(2, 4);
            System.out.println("the substring of string One  = " + substring1);
            substring2 = strTwo.substring(2, 4);
            System.out.println("the substring of string One  = " + substring2);
        }else{
            System.out.println("The strings are not equal");
        }

    }
}