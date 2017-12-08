/*
 * Ryan Banks
 * NameReversal.java
 * 12/6/17
 * 
 */
import java.util.*;
import java.io.*;

public class NameReversal
{
    public static void main (String args[])
    {
        boolean quit = false; //checked by while loop to see if user still wants to run
        do
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("What is your name? ");
            String userName = kbReader.nextLine();
            userName = userName.toLowerCase();
            int nameLength = userName.length() - 1;
            String rev = "";
            for (int i = 0; i <= nameLength; i++) //loop that constructs reversed name string
            {   
                if (i < 1)
                {
                    rev = rev + userName.substring(nameLength);
                }
                else 
                {
                    rev = rev + userName.substring(nameLength - i, (nameLength - i)+1);
                }
            }//end of for loop
            System.out.println("\nYour name reversed is \"" + rev +"\"\n");
            System.out.print("Would you like to quit? True or False. ");
            quit = kbReader.nextBoolean();
        }while(!quit); //end of while loop
        System.out.println("Terminating. Goodbye!"); //end message
    }//end of main
}//end of class